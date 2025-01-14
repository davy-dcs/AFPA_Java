package com.afpa.service;

import com.afpa.domain.Student;

import java.util.ArrayList;

/**
 * Classe de service pour les étudiants
 */
public class StudentService implements Service<Student> {
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Ajouter un nouvel étudiant.
     *
     * @param student à ajouter
     */
    @Override
    public void add(Student student) {
         if (this.students.contains(student)) {
             System.out.println("L'étudiant existe déjà.");
         } else {
             this.students.add(student);
         }
    }

    /**
     * Afficher les détails d'un étudiant spécifique.
     *
     * @param id de l'étudiant
     * @return Student
     */
    @Override
    public Student get(int id) throws NullPointerException {
        Student student = null;
        for (Student s : this.students) {
            if (s.getID() == id) {
                student = s;
                break;
            }
        }
        return student;
    }
}
