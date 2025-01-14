package Exercice11csv;

import Exercice11csv.action.Manage;

public class Main {
    public static void main(String[] args) {
        /*
        Exercice 3 : Système de sauvegarde des scores
        Objectif : Créer une interface pour gérer les scores des joueurs et les enregistrer dans un fichier.

        Créez une interface ScoreManager avec les méthodes :
        void ajouterScore(String joueur, int score)
        void afficherScores()
        Implémentez la classe ScoreManagerFichier qui sauvegarde les scores dans un fichier texte scores.txt.
        Créez une classe principale qui permet d'ajouter des scores et d'afficher le contenu du fichier.
         */

        Manage manage = new Manage();
        manage.execute();
    }
}
