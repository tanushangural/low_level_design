package lowLevelDesign.ElevatorSystem.Buttons;

import lowLevelDesign.ElevatorSystem.Enums.DoorStatus;

public class DoorButton implements Button {
    private boolean status;
    private final DoorStatus doorButtonType;

    public DoorButton(DoorStatus doorStatus) {
        doorButtonType = doorStatus;
    }

    public DoorStatus getDoorButtonType() {
        return doorButtonType;
    }

    @Override
    public boolean isPressed() {
        return false;
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
