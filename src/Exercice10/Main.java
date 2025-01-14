package Exercice10;

import Exercice10.action.Manage;

public class Main {
    public static void main(String[] args) {
        /*
        Exercice 2 : Gestion d'un carnet d'adresses
        Objectif : Lire et écrire des objets dans un fichier en utilisant des interfaces.

        Créez une interface Contact avec les méthodes :
        String getNom()
        String getNumeroTelephone()
        Implémentez une classe ContactSimple.
        Écrivez un programme qui permet d'ajouter plusieurs contacts et de les sauvegarder dans un fichier texte contacts.txt.
         */
        Manage manage = new Manage();
        manage.execute();
    }
}
