package NotificationBuilder;

public class EmailNotifications implements Notification {
    @Override 
    public void notifyUser(String email){
        System.out.println("Notification :: Email " + email+ "\n");
    }
}
