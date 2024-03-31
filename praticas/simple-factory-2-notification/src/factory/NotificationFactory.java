package factory;

import model.*;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type.equals("SMS")) return new SMSNotification();
        if (type.equals("Email")) return new EmailNotification();
        if (type.equals("Push")) return new PushNotification();
        return new NullNotification();
    }
}
