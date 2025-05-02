public class PushNotifications implements Notifications {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending a "+ message+ " notification");
    }
}
