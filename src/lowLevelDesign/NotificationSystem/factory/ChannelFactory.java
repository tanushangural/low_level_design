package lowLevelDesign.NotificationSystem.factory;

import lowLevelDesign.NotificationSystem.channels.Channel;
import lowLevelDesign.NotificationSystem.channels.EmailChannel;
import lowLevelDesign.NotificationSystem.channels.PushNotificationChannel;
import lowLevelDesign.NotificationSystem.enums.ChannelsType;

public class ChannelFactory {
    private ChannelFactory() {}

    public static Channel getChannel(ChannelsType channelsType) {
        if(channelsType.equals(ChannelsType.EMAIL)) {
            return new EmailChannel();
        }
        else if(channelsType.equals(ChannelsType.PUSH)) {
            return new PushNotificationChannel();
        }
        return null;
    }
}
