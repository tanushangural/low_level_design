package ElevatorSystem;

import ElevatorSystem.DoorAndFloor.Floor;

import java.util.List;

public class ElevatorSystem {
    private Building building;

    public void monitoring() {
        building = Building.getInstance();
        List<Floor> floors = building.getFloor();

        for (Floor floor : floors) {
            if (floor.isBotton()) {
                System.out.println("This is the bottom floor.");
            } else if (floor.isTop()) {
                System.out.println("This is the top floor.");
            } else {
                System.out.println("This is a middle floor.");
            }
        }
    }

    public void dispatcher() {
        building = Building.getInstance();
        List<Floor> floors = building.getFloor();

        for (Floor floor : floors) {
            // Logic to dispatch elevators based on the floor's status
            // This is a placeholder implementation, actual logic may vary
            if (floor.isBotton()) {
                System.out.println("Dispatching elevator to the bottom floor.");
            } else if (floor.isTop()) {
                System.out.println("Dispatching elevator to the top floor.");
            } else {
                System.out.println("Dispatching elevator to a middle floor.");
            }
        }
    }

    private ElevatorSystem() {
        // Private constructor to prevent instantiation
    }

    private static final ElevatorSystem system = null;

    public static ElevatorSystem getInstance() {
        return new ElevatorSystem();
    }
}

