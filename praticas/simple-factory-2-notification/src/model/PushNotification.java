package model;

public class PushNotification implements Notification {

    @Override
    public void notifyUser(String receiver, String message) {
        System.out.println(message+" to "+receiver);
    }
}
