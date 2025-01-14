package com.afpa.domain;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Classe abstraite Person
 */
public abstract class Person {
    private static final AtomicInteger A_I = new AtomicInteger(-1);
    protected final int ID;
    protected String name;

    /**
     * Construit une personne
     *
     * @param name de la personne
     */
    public Person(String name) {
        this.ID = A_I.incrementAndGet();
        this.name = name;
    }

    /**
     * Obtient l'id de la personne
     *
     * @return int
     */
    public int getID() {
        return ID;
    }

    /**
     * Obtient le nom de la personne
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Affecte le nom de la personne
     *
     * @param name à affecter
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + ID + ", name='" + name + '\'' + '}';
    }
}
