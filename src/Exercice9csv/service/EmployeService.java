package Exercice9csv.service;

import Exercice9csv.domain.Employe;

import java.io.*;
import java.util.HashSet;

public class EmployeService {
    private HashSet<Employe> employes = new HashSet<>();

    public void add(Employe employe) {
        if (employes.add(employe)) {
            System.out.println(employe.getNom() + " a été ajouté avec succes.");
        } else {
            System.out.println(employe.getNom() + " est déjà dans la liste.");
        }
    }

    public void save() {
        File file = new File("src/Exercice9csv", "employes.csv");

        if (!file.exists()) {
            try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
                bufferedOutputStream.write("Nom,Type,Nombre d'heure,Salaire horaire,Salaire mensuel".getBytes());
                bufferedOutputStream.write(System.lineSeparator().getBytes());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            for (Employe employe : employes) {
                bufferedOutputStream.write(employe.toString().getBytes());
                bufferedOutputStream.write(System.lineSeparator().getBytes());
            }
            System.out.println("Les employés ont été sauvegardés.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
