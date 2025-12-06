package lowLevelDesign.NotificationSystem.data;

import lowLevelDesign.NotificationSystem.channels.Channel;
import lowLevelDesign.NotificationSystem.enums.ChannelsType;

import java.util.List;

public class User {
    private final int id;
    private final String name;
    private final String phoneNumber;
    private final String email;
    private final List<ChannelsType> channelsTypes;

    public User(int id, String name, String phoneNumber, String email, List<ChannelsType> channelsTypes) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.channelsTypes = channelsTypes;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<ChannelsType> getChannelsTypes() {
        return channelsTypes;
    }
}
