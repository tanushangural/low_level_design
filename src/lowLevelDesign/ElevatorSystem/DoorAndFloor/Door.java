package lowLevelDesign.ElevatorSystem.DoorAndFloor;

import lowLevelDesign.ElevatorSystem.Enums.DoorStatus;

public class Door {
    private DoorStatus doorStatus;

    public boolean isOpen() {
        return doorStatus == DoorStatus.OPEN;
    }

    public void open() {
        if (doorStatus == DoorStatus.CLOSED) {
            doorStatus = DoorStatus.OPEN;
            System.out.println("Door is now open.");
        } else {
            System.out.println("Door is already open.");
        }
    }

    public void close() {
        if (doorStatus == DoorStatus.OPEN) {
            doorStatus = DoorStatus.CLOSED;
            System.out.println("Door is now closed.");
        } else {
            System.out.println("Door is already closed.");
        }
    }
}
