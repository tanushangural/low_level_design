package lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Enums;

public enum Direction {
    UP,
    DOWN,
    NONE;

    public static Direction fromString(String direction) {
        switch (direction.toUpperCase()) {
            case "UP":
                return UP;
            case "DOWN":
                return DOWN;
            default:
                return NONE;
        }
    }

    public enum ElevatorState {
        IDLE,
        UP,
        DOWN
    }
}
