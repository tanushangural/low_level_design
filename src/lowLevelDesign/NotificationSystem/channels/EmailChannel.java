package lowLevelDesign.NotificationSystem.channels;

import lowLevelDesign.NotificationSystem.data.User;
import lowLevelDesign.NotificationSystem.NotificationProvider.NotificationProvider;
import lowLevelDesign.NotificationSystem.enums.NotificationProviderType;
import lowLevelDesign.NotificationSystem.enums.NotificationType;
import lowLevelDesign.NotificationSystem.factory.NotificationProviderFactory;

public class EmailChannel implements Channel{
    @Override
    public void push(NotificationType notificationType, String message, User user) {
        NotificationProviderType notificationProviderType = NotificationProviderType.SEND_GRID;
        NotificationProvider notificationProvider = NotificationProviderFactory.getProvider(notificationProviderType);
        notificationProvider.push(notificationType, message, user);
    }
}
