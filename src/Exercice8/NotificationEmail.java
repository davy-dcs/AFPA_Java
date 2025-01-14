package Exercice8;

public class NotificationEmail implements Notification{
    @Override
    public void envoyer(String message) {
        System.out.println("message email : " + message);
    }
}
