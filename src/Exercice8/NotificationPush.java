package Exercice8;

public class NotificationPush implements Notification{
    @Override
    public void envoyer(String message) {
        System.out.println("message push : " + message);
    }
}
