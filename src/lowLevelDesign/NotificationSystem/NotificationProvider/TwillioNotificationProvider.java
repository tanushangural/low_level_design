package lowLevelDesign.NotificationSystem.NotificationProvider;

import lowLevelDesign.NotificationSystem.data.User;
import lowLevelDesign.NotificationSystem.enums.NotificationType;

public class TwillioNotificationProvider implements NotificationProvider{
    @Override
    public void push(NotificationType notificationType, String message, User user) {

    }
}
