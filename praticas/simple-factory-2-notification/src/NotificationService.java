import factory.NotificationFactory;
import model.Notification;

public class NotificationService {
    public static void main(String[] args) {
        Notification sms = NotificationFactory.createNotification("SMS");
        Notification email = NotificationFactory.createNotification("Email");
        Notification push = NotificationFactory.createNotification("Push");
        Notification nulo = NotificationFactory.createNotification("Null");
        sms.notifyUser("Allan", "Olá! Estou enviando via SMS");
        email.notifyUser("João", "Olá! Estou enviando via Email");
        push.notifyUser("Maria", "Olá! Estou enviando via Notificação Push");
        nulo.notifyUser("Nulo", "Nothing");
    }
}