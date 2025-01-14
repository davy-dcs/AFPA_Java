package Exercice12.domain;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger implements Logger {
    private LocalDateTime date;

    @Override
    public void log(String message) {
        this.date = LocalDateTime.now();
        File file = new File("src/Exercice12", "errors.log");
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            bufferedOutputStream.write((date.toString() + " " + message).getBytes());
            bufferedOutputStream.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
