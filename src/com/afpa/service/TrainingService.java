package com.afpa.service;

import com.afpa.domain.Student;
import com.afpa.domain.Trainer;
import com.afpa.domain.Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Classe de service pour les formations
 */
public class TrainingService implements Service<Training> {
    private ArrayList<Training> trainings = new ArrayList<>();

    /**
     * Lister toutes les formations.
     *
     * @return HashSet<Training>
     */
    public ArrayList<Training> getTrainings() {
        return trainings;
    }

    /**
     * Lister les formations auxquelles un étudiant est inscrit.
     *
     * @param student inscrit
     * @return ArrayList<Training>
     */
    public ArrayList<Training> getTrainings(Student student) {
        ArrayList<Training> result = new ArrayList<>();
        for (Training training : this.trainings) {
            if (training.getStudents().contains(student)) result.add(training);
        }
        return result;
    }

    public void setTrainings(ArrayList<Training> trainings) {
        this.trainings = trainings;
    }

    /**
     * Lister les formateurs disponibles.
     *
     * @param trainerService list des formateurs
     * @return ArrayList<Trainer>
     */
    public ArrayList<Trainer> getAvailableTrainers(TrainerService trainerService) {
        for (Training training : this.trainings) {
            trainerService.getTrainers().removeIf(trainer -> trainer.equals(training.getTrainer()));
        }
        return trainerService.getTrainers();
    }

    /**
     * Lister les étudiants inscrits à une formation spécifique.
     *
     * @param id de la formation
     * @return ArrayList<Student>
     */
    public ArrayList<Student> getStudents(int id) {
        return this.get(id).getStudents();
    }

    /**
     * Rechercher une formation par titre ou domaine d'expertise.
     *
     * @param q à rechercher
     * @return ArrayList<Training>
     */
    public ArrayList<Training> search(String q) {
        ArrayList<Training> result = new ArrayList<>();
        for (Training training : this.trainings) {
            if (training.getTitle().contains(q) || training.getTrainer().getExpertise().contains(q)) {
                result.add(training);
            }
        }
        return result;
    }

    /**
     * Lister les formations par formateur
     *
     * @return ArrayList<Training>
     */
    public ArrayList<Training> sort() {
        Collections.sort(this.trainings, Comparator.comparing(training -> training.getTrainer().getName()));
        return this.trainings;
    }

    /**
     * Afficher les détails d'une formation spécifique.
     *
     * @param id de la formation
     * @return Training
     */
    @Override
    public Training get(int id) throws NullPointerException {
        Training training = null;
        for (Training t : this.trainings) {
            if (t.getID() == id) {
                training = t;
                break;
            }
        }
        return training;
    }


    @Override
    public String toString() {
        return "TrainingService{" + "trainings=" + trainings + '}';
    }

    /**
     * Ajouter une nouvelle formation.
     *
     * @param training to add
     */
    @Override
    public void add(Training training) {
        if (this.trainings.contains(training)) {
            System.out.println("La formation existe déjà.");
        } else {
            this.trainings.add(training);
        }
    }
}
