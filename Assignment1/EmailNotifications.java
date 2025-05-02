public class EmailNotifications implements Notifications {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending an "+message+" notification");
    }
}
