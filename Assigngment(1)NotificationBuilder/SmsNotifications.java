package NotificationBuilder;

public class SmsNotifications implements Notification {
    
    @Override
    public void notifyUser (String sms) {
        System.out.println("Notification :: sms "+ sms + "\n" );
    }
}
