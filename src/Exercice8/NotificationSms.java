package Exercice8;

public class NotificationSms implements Notification{
    @Override
    public void envoyer(String message) {
        System.out.println("message SMS : " + message);
    }
}
