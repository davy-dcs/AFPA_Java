package Exercice13;

import Exercice13.action.Manage;
import Exercice13.domain.LivreNumerique;
import Exercice13.domain.LivrePapier;
import Exercice13.service.LivreService;

public class Main {
    public static void main(String[] args) {
        /*
        Exercice 5 : Gestion d'une bibliothèque
        Objectif : Créer un système pour gérer une bibliothèque et enregistrer les données dans des fichiers.

        Créez une interface Livre avec les méthodes :
        String getTitre()
        String getAuteur()
        Implémentez deux classes :
        LivrePapier
        LivreNumerique
        Écrivez un programme qui enregistre les informations sur les livres dans un fichier bibliotheque.txt et permet d'afficher la liste des livres.
         */

        new Manage().execute();
    }
}
