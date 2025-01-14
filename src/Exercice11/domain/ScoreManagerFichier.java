package Exercice11.domain;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ScoreManagerFichier implements ScoreManager {
    private HashMap<String, ArrayList<Integer>> scores = new HashMap<>();

    public void save() {
        File file = new File("src/Exercice11", "scores.txt");

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            for (String key : scores.keySet()) {
                bufferedOutputStream.write(key.getBytes());
                bufferedOutputStream.write(System.lineSeparator().getBytes());
                for (int value : scores.get(key)) {
                    bufferedOutputStream.write(("\t" + value).getBytes());
                    bufferedOutputStream.write(System.lineSeparator().getBytes());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void ajouterScore(String joueur, int score) {
        if (scores.containsKey(joueur)) {
            scores.get(joueur).add(score);
        } else {
            scores.put(joueur, new ArrayList<>());
            scores.get(joueur).add(score);
        }
    }

    @Override
    public void afficherScores() {
        for (String key : scores.keySet()) {
            System.out.println(key + " : ");
            for (int value : scores.get(key)) {
                System.out.println("\t" + value);
            }
        }
    }
}
