public class NotificationsFactoryDemo {
    public static void main(String[] args) {

        NotificationsFactory notificationsFactory = new NotificationsFactory();      
        Notifications pushNotifications = notificationsFactory.createNotification("push");
        pushNotifications.notifyUser("Push by Shahriar Hossain");
        Notifications smsNotifications = notificationsFactory.createNotification("sms");
        smsNotifications.notifyUser(" Sms by Monirul Islam");
        Notifications emailNotifications = notificationsFactory.createNotification("email");
        emailNotifications.notifyUser(" Email by Abdur Rahman");
    }
}
