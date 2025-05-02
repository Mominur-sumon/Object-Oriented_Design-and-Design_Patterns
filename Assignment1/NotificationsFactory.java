

public class NotificationsFactory {
    
        public Notifications createNotification(String notificationType) {
            if (notificationType == null) {
                return null;
            }
            if (notificationType.equalsIgnoreCase("PUSH")) {
                return new PushNotifications();
            } else if (notificationType.equalsIgnoreCase("SMS")) {
                return new SmsNotification();
            } else if (notificationType.equalsIgnoreCase("EMAIL")) {
                return new EmailNotifications();
            }
            return null;
        }
}
