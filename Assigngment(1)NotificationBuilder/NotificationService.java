package NotificationBuilder;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory singlefactory = NotificationFactory.getInstance();

        Notification sms = singlefactory.createNotification("sms") ;
        sms.notifyUser("New Sms form sms factory");

        Notification email = singlefactory.createNotification("email");
        email.notifyUser("This is an email notification");

        Notification push = singlefactory.createNotification("push") ;
        push.notifyUser("This is an push Notifications");

    }
}
