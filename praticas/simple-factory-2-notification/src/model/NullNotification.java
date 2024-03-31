package model;

public class NullNotification implements Notification {

    @Override
    public void notifyUser(String receiver, String message) {
        System.out.println("No notification sent");
    }
}
