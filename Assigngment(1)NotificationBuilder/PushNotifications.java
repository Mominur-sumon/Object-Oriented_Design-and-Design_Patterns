package NotificationBuilder;

public class PushNotifications implements Notification{
    @Override
    public void notifyUser(String push){
        System.out.println("Notification :: Push "+ push +"\n");
    }
}
