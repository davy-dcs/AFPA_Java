package Exercice9;

import Exercice9.action.Manage;

public class Main {
    public static void main(String[] args) {
        /*
        Exercice 1 : Gestion des employés dans un fichier
        Objectif : Utiliser une interface pour gérer les informations des employés et les enregistrer dans un fichier.

        Créez une interface Employe avec les méthodes suivantes :
        String getNom()
        double calculerSalaire()
        Implémentez deux classes :
        EmployeTempsPlein (salaire fixe)
        EmployeTempsPartiel (salaire horaire * nombre d'heures)
        Créez une classe principale qui enregistre les informations des employés dans un fichier texte nommé employes.txt.
         */
        Manage manage = new Manage();
        manage.execute();
    }
}
