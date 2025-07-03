package ElevatorSystem;

import ElevatorSystem.DoorAndFloor.Floor;

import java.util.List;

public class Building {
    private List<Floor> floor;
    private List<ElevatorCar> elevator;

    private static Building building = null;

    public static Building getInstance() {
        if (building == null) {
            building = new Building();
        }
        return building;
    }

    public List<Floor> getFloor() {
        return floor;
    }
}
