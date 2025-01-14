package com.afpa.service;

/**
 * Interface des services
 *
 * @param <T> formateur | formation | étudiant
 */
public interface Service<T> {
    /**
     * Objet à ajouter
     *
     * @param t formateur | formation | étudiant
     */
    void add(T t);

    /**
     * Obtient un objet selon son ID
     *
     * @param id de l'objet
     * @return Trainer | Training | Student
     * @throws NullPointerException Objet non trouvé
     */
    T get(int id) throws NullPointerException;
}
