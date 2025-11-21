package lowLevelDesign.ElevatorSystem;

import lowLevelDesign.ElevatorSystem.DoorAndFloor.Door;
import lowLevelDesign.ElevatorSystem.Display.Display;
import lowLevelDesign.ElevatorSystem.Enums.Direction;
import lowLevelDesign.ElevatorSystem.Panels.ElevatorPanel;

public class ElevatorCar {
    private int id;
    private Door door;
    private Direction.ElevatorState elevatorState;
    private Display display;
    private ElevatorPanel elevatorPanel;

    public void move() {
        if (elevatorState == Direction.ElevatorState.UP) {
            System.out.println("Elevator " + id + " is moving up.");
        } else if (elevatorState == Direction.ElevatorState.DOWN) {
            System.out.println("Elevator " + id + " is moving down.");
        } else {
            System.out.println("Elevator " + id + " is idle.");
        }
    }

    public void stop() {
        System.out.println("Elevator " + id + " has stopped.");
        elevatorState = Direction.ElevatorState.IDLE;
    }

    public void openDoor() {
        if (door.isOpen()) {
            System.out.println("Door is already open.");
        } else {
            door.open();
            System.out.println("Elevator " + id + " door opened.");
        }
    }

    public void closeDoor() {
        if (!door.isOpen()) {
            System.out.println("Door is already closed.");
        } else {
            door.close();
            System.out.println("Elevator " + id + " door closed.");
        }
    }
}
