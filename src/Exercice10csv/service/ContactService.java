package Exercice10csv.service;

import Exercice10csv.domain.Contact;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;

public class ContactService {
    private HashSet<Contact> contacts = new HashSet<>();

    public void add(Contact contact) {
        if (this.contacts.add(contact)) System.out.println("Contact ajouté.");;
    }

    public void save() {
        File file = new File("src/Exercice10csv", "contacts.csv");

        if (!file.exists()) {
            try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
                bufferedOutputStream.write("Type,Nom,Numéro".getBytes());
                bufferedOutputStream.write(System.lineSeparator().getBytes());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            for (Contact contact : contacts) {
                bufferedOutputStream.write(contact.toString().getBytes());
                bufferedOutputStream.write(System.lineSeparator().getBytes());
            }
            System.out.println("Contacts sauvegardés.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
