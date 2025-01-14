package Exercice13.service;

import Exercice13.domain.Livre;

import java.io.*;
import java.util.Arrays;

public class LivreService {
    private File file = new File("src/Exercice13", "bibliotheque.txt");

    public void add(Livre livre) {
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.file, true))) {
            bufferedOutputStream.write(livre.toString().getBytes());
            bufferedOutputStream.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void show() {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.file))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedInputStream.available() > 0) {
                stringBuilder.appendCodePoint(bufferedInputStream.read());
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
