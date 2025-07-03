package ElevatorSystem.DoorAndFloor;

import ElevatorSystem.Display.Display;
import ElevatorSystem.Panels.HallPanel;

import java.util.List;

public class Floor {
    private List<Display> displayList;
    private List<HallPanel> hallPanelList;

    public boolean isBotton() {
        // Assuming this method checks if the floor is the bottom floor
        // This is a placeholder implementation, actual logic may vary
        return displayList.isEmpty() || hallPanelList.isEmpty();
    }

    public boolean isTop() {
        // Assuming this method checks if the floor is the top floor
        // This is a placeholder implementation, actual logic may vary
        return displayList.isEmpty() || hallPanelList.isEmpty();
    }
}
