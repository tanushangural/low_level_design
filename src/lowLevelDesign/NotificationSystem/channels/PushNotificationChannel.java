package lowLevelDesign.NotificationSystem.channels;

import lowLevelDesign.NotificationSystem.data.User;
import lowLevelDesign.NotificationSystem.enums.NotificationType;

public class PushNotificationChannel implements Channel{
    @Override
    public void push(NotificationType notificationType, String message, User user) {

    }
}
