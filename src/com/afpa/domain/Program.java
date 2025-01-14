package com.afpa.domain;

import com.afpa.service.StudentService;
import com.afpa.service.TrainerService;
import com.afpa.service.TrainingService;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Programme qui gère toutes les commandes
 */
public class Program {
    private final TrainingService trainingService = new TrainingService();
    private final TrainerService trainerService = new TrainerService();
    private final StudentService studentService = new StudentService();
    private Scanner scanner;
    private LinkedHashMap<String, Method> commands = new LinkedHashMap<>();

    /**
     * Initialise Scanner avec ou sans script.
     *
     * @param hasScript boolean
     */
    public Program(boolean hasScript) {
        try {
            this.commands.put("1 - Ajouter une formation", Program.class.getDeclaredMethod("addTraining"));
            this.commands.put("2 - Lister toutes les formations", Program.class.getDeclaredMethod("listTrainings"));
            this.commands.put("3 - Afficher les détails d'une formation spécifique", Program.class.getDeclaredMethod("detailsTraining"));
            this.commands.put("4 - Ajouter un formateur", Program.class.getDeclaredMethod("addTrainer"));
            this.commands.put("5 - Associer un formateur à une formation", Program.class.getDeclaredMethod("associate"));
            this.commands.put("6 - Lister les formateurs disponibles", Program.class.getDeclaredMethod("availableTrainers"));
            this.commands.put("7 - Ajouter un étudiant", Program.class.getDeclaredMethod("addStudent"));
            this.commands.put("8 - Inscrire un étudiant à une formation", Program.class.getDeclaredMethod("registerStudent"));
            this.commands.put("9 - Lister les étudiants inscrits à une formation spécifique", Program.class.getDeclaredMethod("listStudents"));
            this.commands.put("10 - Rechrcher une formation par titre ou domaine d'expertise", Program.class.getDeclaredMethod("searchTrainings"));
            this.commands.put("11 - Lister les formations par formateur", Program.class.getDeclaredMethod("sortTrainings"));
            this.commands.put("12 - Lister les formations auxquelles un étudiant est inscrit", Program.class.getDeclaredMethod("studentTrainings"));
            this.commands.put("13 - Quitter le programme", Program.class.getDeclaredMethod("exit"));
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
        if (hasScript) {
            try {
                scanner = new Scanner(new File("src/script"));
            } catch (FileNotFoundException | NullPointerException e) {
                System.out.println("Le script n'existe pas ou est introuvable.");
            }
        } else {
            scanner = new Scanner(System.in);
        }
    }

    /**
     * Execute la commande selectionnée.
     */
    public void execute() {
        for (String command : this.commands.keySet()) {
            System.out.println(command);
        }
        String command = scanner.nextLine();
        for (String key : this.commands.keySet()) {
            if (key.split(" ")[0].equals(command)) {
                try {
                    this.commands.get(key).invoke(this);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        if (!command.startsWith("13")) this.execute();
    }

    /**
     * Ajouter une formation
     */
    private void addTraining() {
        System.out.println("Entrer le titre");
        String title = scanner.nextLine();
        System.out.println("Entrer la description");
        String description = scanner.nextLine();

        trainingService.add(new Training(title, description));
    }

    /**
     * Lister toutes les formations
     */
    private void listTrainings() {
        System.out.println(trainingService.getTrainings());
    }

    /**
     * Afficher les détails d'une formation spécifique
     */
    private void detailsTraining() {
        System.out.println("Entrer l'id de la formation");
        String id = scanner.nextLine();
        System.out.println(trainingService.get(Integer.parseInt(id)));
    }

    /**
     * Ajouter un formateur
     */
    private void addTrainer() {
        System.out.println("Entrer le nom");
        String name = scanner.nextLine();
        System.out.println("Entrer l'expertise");
        String expertise = scanner.nextLine();

        trainerService.add(new Trainer(name, expertise));
    }

    /**
     * Associer un formateur à une formation
     */
    private void associate() {
        System.out.println("Entrer l'id du formateur");
        String trainerId = scanner.nextLine();
        System.out.println("Entrer l'id de la formation");
        String trainingId = scanner.nextLine();
        try {
            trainingService.get(Integer.parseInt(trainingId)).setTrainer(trainerService.get(Integer.parseInt(trainerId)));
        } catch (NullPointerException e) {
            System.out.println("L'id est incorrect");
        } catch (NumberFormatException e) {
            System.out.println("L'id doit être un numéro");
        }
    }

    /**
     * Lister les formateurs disponibles
     */
    private void availableTrainers() {
        System.out.println(trainingService.getAvailableTrainers(trainerService));
    }

    /**
     * Ajouter un étudiant
     */
    private void addStudent() {
        System.out.println("Entrer le nom");
        String name = scanner.nextLine();
        System.out.println("Entrer l'email");
        String email = scanner.nextLine();

        studentService.add(new Student(name, email));
    }

    /**
     * Inscrire un étudiant à une formation
     */
    private void registerStudent() {
        System.out.println("Entrer l'id de l'étudiant");
        String studentId = scanner.nextLine();
        System.out.println("Entrer l'id de la formation");
        String trainingId = scanner.nextLine();
        try {
            trainingService.get(Integer.parseInt(trainingId)).setStudent(studentService.get(Integer.parseInt(studentId)));
        } catch (NullPointerException e) {
            System.out.println("L'id est incorrect");
        } catch (NumberFormatException e) {
            System.out.println("L'id doit être un numéro");
        }
    }

    /**
     * Lister les étudiants inscrits à une formation spécifique
     */
    private void listStudents() {
        System.out.println("Entrer l'id de la formation");
        String studentId = scanner.nextLine();

        try {
            System.out.println(trainingService.get(Integer.parseInt(studentId)).getStudents());
        } catch (NullPointerException e) {
            System.out.println("L'id est incorrect");
        } catch (NumberFormatException e) {
            System.out.println("L'id doit être un numéro");
        }
    }

    /**
     * Rechrcher une formation par titre ou domaine d'expertise
     */
    private void searchTrainings() {
        System.out.println("Entrer le titre ou le domaine d'expertise");
        String title = scanner.nextLine();

        System.out.println(trainingService.search(title));
    }

    /**
     * Lister les formations par formateur
     */
    private void sortTrainings() {
        System.out.println(trainingService.sort());
    }

    /**
     * Lister les formations auxquelles un étudiant est inscrit
     */
    private void studentTrainings() {
        System.out.println("Entrer l'id de l'étudiant");
        String studentId = scanner.nextLine();

        try {
            System.out.println(trainingService.getTrainings(studentService.get(Integer.parseInt(studentId))));
        } catch (NullPointerException e) {
            System.out.println("L'id est incorrect");
        } catch (NumberFormatException e) {
            System.out.println("L'id doit être un numéro");
        }
    }

    /**
     * Quitter le programme
     */
    private void exit() {
        System.out.println("Vous quittez le programme");
        scanner.close();
    }
}
