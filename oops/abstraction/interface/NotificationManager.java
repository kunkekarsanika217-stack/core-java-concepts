interface NotificationService {
    void sendNotification(String message, String recipient);
}

class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println(
            "Email sent to " + recipient + ": " + message
        );
    }
}

 class SMSNotification implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println(
            "SMS sent to " + recipient + ": " + message
        );
    }
}

class PushNotification implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println(
            "Push notification sent to " + recipient + ": " + message
        );
    }
}

public class NotificationManager {

    public static void main(String[] args) {

        NotificationService notification;

        notification = new EmailNotification();
        notification.sendNotification(
            "Your order has been shipped", "user@gmail.com"
        );
notification = new SMSNotification();
        notification.sendNotification(
            "OTP is 456789", "+91-9876543210"
        );

        notification = new PushNotification();
        notification.sendNotification(
            "New offer available!", "User123"
        );
    }
}

