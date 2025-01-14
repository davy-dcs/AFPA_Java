package Exercice12;

import Exercice12.action.Manage;

public class Main {
    public static void main(String[] args) {
        /*
        Exercice 4 : Journalisation des erreurs
        Objectif : Utiliser une interface pour enregistrer les messages d'erreur dans un fichier.

        Créez une interface Logger avec une méthode void log(String message).
        Implémentez une classe FileLogger qui enregistre les messages dans un fichier errors.log.
        Créez une classe principale qui génère des messages d'erreur et les journalise.
         */
        new Manage().execute();
    }
}
