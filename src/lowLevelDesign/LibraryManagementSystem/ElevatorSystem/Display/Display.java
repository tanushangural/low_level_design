package lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Display;

import lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Enums.Direction;

public class Display {
    private int floor;
    private int capacity;
    private Direction direction;

    public void showElevatorDisplay() {
        System.out.println("Current Floor: " + floor);
        System.out.println("Capacity: " + capacity);
        System.out.println("Direction: " + (direction != null ? direction.toString() : "NONE"));
    }

    public void showHallDisplay() {
        System.out.println("Current Floor: " + floor);
        System.out.println("Direction: " + (direction != null ? direction.toString() : "NONE"));
    }
}
