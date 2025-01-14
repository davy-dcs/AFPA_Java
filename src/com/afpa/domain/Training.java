package com.afpa.domain;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Classe formation
 */
public class Training {
    private static final AtomicInteger A_I = new AtomicInteger(-1);
    private final int ID;
    private String title;
    private String description;
    private Trainer trainer;
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Construit une formation
     *
     * @param title       de la formation
     * @param description de la formation
     */
    public Training(String title, String description) {
        this.ID = A_I.incrementAndGet();
        this.title = title;
        this.description = description;
    }

    /**
     * Obtient l'id de la formation
     *
     * @return int
     */
    public int getID() {
        return ID;
    }

    /**
     * Obtient le titre de la formation
     *
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Affecte le titre de la formation
     *
     * @param title à affecter
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtient la description de la formation
     *
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Affecte la description de la formation
     *
     * @param description à affecter
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtient le formateur
     *
     * @return Trainer
     */
    public Trainer getTrainer() {
        return trainer;
    }

    /**
     * Associer un formateur à une formation
     *
     * @param trainer à associer
     */
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    /**
     * Obtient les étudiants inscrit à la formation
     *
     * @return ArrayList<Student>
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Affecte les étudiants
     *
     * @param students à affecter
     */
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * Ajouter un étudiant à une formation
     *
     * @param student à ajouter
     */
    public void setStudent(Student student) {
        if (!this.students.contains(student)) this.students.add(student);
    }

    @Override
    public String toString() {
        return "Training{" + "ID=" + ID + ", title='" + title + '\'' + ", description='" + description + '\'' + ", trainer=" + trainer + ", students=" + students + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Training training = (Training) o;
        return Objects.equals(title, training.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
