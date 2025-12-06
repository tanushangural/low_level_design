package lowLevelDesign.NotificationSystem.apis;

import lowLevelDesign.NotificationSystem.data.User;
import lowLevelDesign.NotificationSystem.channels.Channel;
import lowLevelDesign.NotificationSystem.enums.ChannelsType;
import lowLevelDesign.NotificationSystem.enums.NotificationType;
import lowLevelDesign.NotificationSystem.factory.ChannelFactory;

import java.util.List;

public class SendNotificationAPI {

    public void sendNotification(NotificationType notificationType, String message,  User user) {
        if(notificationType == null || message == null || user == null
        ) {
            throw new RuntimeException("Invalid params");
        }
        for(ChannelsType channelsType: user.getChannelsTypes()) {
            Channel channel = ChannelFactory.getChannel(channelsType);
            channel.push(notificationType, message, user);
        }
    }
}
