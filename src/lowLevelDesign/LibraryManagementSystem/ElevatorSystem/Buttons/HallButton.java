package lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Buttons;

import lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Enums.Direction;

public class HallButton implements Button {
    private boolean status;
    private final Direction direction;

    public HallButton(Direction direction) {
        this.direction = direction;
        this.status = false; // Initially, the button is not pressed
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public boolean isPressed() {
        return status;
    }
    @Override
    public void press() {
        status = true;
        System.out.println("Door button pressed. Door will open.");
    }

    @Override
    public void release() {
        status = false;
        System.out.println("Door button released. Door will close.");
    }
}
