package lowLevelDesign.NotificationSystem.NotificationProvider;

import lowLevelDesign.NotificationSystem.data.User;
import lowLevelDesign.NotificationSystem.enums.NotificationType;

public interface NotificationProvider {
    void push(NotificationType notificationType, String message, User user);
}
