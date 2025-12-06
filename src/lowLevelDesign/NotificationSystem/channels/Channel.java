package lowLevelDesign.NotificationSystem.channels;

import lowLevelDesign.NotificationSystem.data.User;
import lowLevelDesign.NotificationSystem.enums.NotificationType;

public interface Channel {
    void push(NotificationType notificationType, String message, User user);

}
