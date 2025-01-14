package com.afpa.domain;

import java.util.Objects;

/**
 * Classe étudiant, enfant de la classe abstraite Person
 */
public class Student extends Person {
    private String email;

    /**
     * Construit un étudiant
     *
     * @param name  de l'étudiant
     * @param email de l'étudiant
     */
    public Student(String name, String email) {
        super(name);
        this.email = email;
    }

    /**
     * Obtient l'email de l'étudiant
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Affecte l'email à l'étudiant
     *
     * @param email String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + ", id=" + ID + ", name='" + name + '\'' + "email='" + email + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
