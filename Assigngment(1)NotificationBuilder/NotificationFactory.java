package NotificationBuilder;

public class NotificationFactory {
    // for singleton Pattern 
    private static NotificationFactory instance = new NotificationFactory();

    private NotificationFactory(){
        // private constructor
    }

    public static NotificationFactory getInstance(){
        return instance ;
    }

    // for factory design pattern 
    public Notification createNotification(String notificationType){
        if(notificationType.equalsIgnoreCase("email")){
            return new EmailNotifications() ;

        }

        else if (notificationType.equalsIgnoreCase("sms")){
            return new SmsNotifications();
        }
        else if(notificationType.equalsIgnoreCase("push")){
            return new PushNotifications();
        }
        return null ;
    }
}
