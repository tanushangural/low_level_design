package lowLevelDesign.NotificationSystem.factory;

import lowLevelDesign.NotificationSystem.NotificationProvider.NotificationProvider;
import lowLevelDesign.NotificationSystem.NotificationProvider.TwillioNotificationProvider;
import lowLevelDesign.NotificationSystem.enums.NotificationProviderType;

public class NotificationProviderFactory {
    private NotificationProviderFactory() {}

    public static NotificationProvider getProvider(NotificationProviderType notificationProviderType) {
        if(notificationProviderType.equals(NotificationProviderType.TWILIO)) {
            return new TwillioNotificationProvider();
        }
        return null;
    }
}
