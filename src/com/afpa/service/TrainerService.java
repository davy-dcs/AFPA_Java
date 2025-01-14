package com.afpa.service;

import com.afpa.domain.Trainer;

import java.util.ArrayList;

/**
 * Classe de service pour les formateurs
 */
public class TrainerService implements Service<Trainer> {
    private ArrayList<Trainer> trainers = new ArrayList<>();

    /**
     * Lister tous les formateurs.
     *
     * @return ArrayList<Trainer>
     */
    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    /**
     * Afficher les détails d'un formateur spécifique.
     *
     * @param id du formateur
     * @return Trainer
     */
    @Override
    public Trainer get(int id) throws NullPointerException {
        Trainer trainer = null;
        for (Trainer t : this.trainers) {
            if (t.getID() == id) {
                trainer = t;
                break;
            }
        }
        return trainer;
    }


    /**
     * Ajouter un nouveau formateur.
     *
     * @param trainer à ajouter
     */
    @Override
    public void add(Trainer trainer) {
        if (this.trainers.contains(trainer)) {
            System.out.println("Le formateur existe déjà.");
        } else {
            this.trainers.add(trainer);
        }
    }
}
