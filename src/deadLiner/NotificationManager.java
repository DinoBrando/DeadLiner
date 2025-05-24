package deadLiner;

public class NotificationManager {
    public void sendNotification(INotifiable user, String message){
        user.notify();
    }
}

