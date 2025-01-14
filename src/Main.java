import Exercice10.ComparateurPersonne;
import Exercice10.Personne;
import Exercice2.*;
import Exercice3.Document;
import Exercice4.Carte;
import Exercice4.CarteStandard;
import Exercice4.JeuDeCarte;
import Exercice5.Admin;
import Exercice5.Membre;
import Exercice5.Visiteur;
import Exercice6.Paiement;
import Exercice6.PaiementCarte;
import Exercice6.PaiementEspece;
import Exercice7.VoitureElectrique;
import Exercice7.VoitureHybride;
import Exercice7.VoitureThermique;
import Exercice8.NotificationEmail;
import Exercice8.NotificationPush;
import Exercice8.NotificationSms;
import Exercice9.ProduitNumerique;
import Exercice9.ProduitPhysique;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Animal chien = new Chien();
        chien.faireDuBruit();

        Volant oiseau = new Oiseau();
        oiseau.voler();

        Nageur poisson = new Poisson();
        poisson.nager();

        Chien chienNageant = new Chien();
        chienNageant.faireDuBruit();
        chienNageant.nager();

        Oiseau oiseauBruyant = new Oiseau();
        oiseauBruyant.faireDuBruit();
        oiseauBruyant.voler();

        Poisson poissonBruyant = new Poisson();
        poissonBruyant.faireDuBruit();
        poissonBruyant.nager();

        ArrayList<Document> documents = new ArrayList<>();
        for (Document document : documents) {
            document.afficherDetails();
        }


        JeuDeCarte jeu = new JeuDeCarte();
        jeu.add(new CarteStandard("valet", "pique"));
        jeu.add(new CarteStandard("dame", "pique"));
        jeu.add(new CarteStandard("roi", "pique"));
        jeu.add(new CarteStandard("ass", "pique"));
        jeu.add(new CarteStandard("valet", "carreau"));
        jeu.add(new CarteStandard("dame", "carreau"));
        jeu.add(new CarteStandard("roi", "carreau"));
        jeu.add(new CarteStandard("ass", "carreau"));
        jeu.add(new CarteStandard("valet", "coeur"));
        jeu.add(new CarteStandard("dame", "coeur"));
        jeu.add(new CarteStandard("roi", "coeur"));
        jeu.add(new CarteStandard("ass", "coeur"));
        jeu.add(new CarteStandard("valet", "trefle"));
        jeu.add(new CarteStandard("dame", "trefle"));
        jeu.add(new CarteStandard("roi", "trefle"));
        jeu.add(new CarteStandard("ass", "trefle"));


        jeu.melanger();
        jeu.afficher();


*/
        Admin admin = new Admin("fethi");
        Membre membre = new Membre("davy");
        Visiteur visiteur = new Visiteur();

        admin.connexion();
        membre.connexion();
        visiteur.connexion();

        admin.deconnexion();
        membre.deconnexion();
        visiteur.deconnexion();

        admin.getRole();
        membre.getRole();
        visiteur.getRole();
/*
        Paiement pC = new PaiementCarte();
        pC.effectuerPaiement(23.5);
        Paiement pE = new PaiementEspece();
        pE.effectuerPaiement(2.9);

        VoitureElectrique vE = new VoitureElectrique();
        VoitureThermique vT = new VoitureThermique();
        VoitureHybride vH = new VoitureHybride();

        vE.demarrer();
        vE.recharger();

        vT.demarrer();
        vT.faireLePlein();

        vH.demarrer();
        vH.faireLePlein();
        vH.recharger();


        NotificationEmail nE = new NotificationEmail();
        nE.envoyer("bonjour");
        NotificationPush nP = new NotificationPush();
        nP.envoyer("salut");
        NotificationSms nS = new NotificationSms();
        nS.envoyer("hello");


        ProduitPhysique pP = new ProduitPhysique("souris", 30);
        ProduitPhysique pP2 = new ProduitPhysique("clavier", 50);
        ProduitNumerique pN = new ProduitNumerique("btc", 100);
        ProduitNumerique pN2 = new ProduitNumerique("site", 200);

        pP.getNom();
        pP.getPrix();
        pP.afficherDetails();
        pP2.getNom();
        pP2.getPrix();
        pP2.afficherDetails();
        pN.getNom();
        pN.getPrix();
        pN.afficherDetails();
        pN2.getNom();
        pN2.getPrix();
        pN2.afficherDetails();


        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("aa", 28));
        personnes.add(new Personne("bb", 30));
        personnes.add(new Personne("cc", 29));
        personnes.add(new Personne("dd", 10));

        personnes.sort(new ComparateurPersonne());
        System.out.println(personnes);
*/
    }

}