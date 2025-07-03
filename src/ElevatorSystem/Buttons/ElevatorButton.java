package ElevatorSystem.Buttons;

public class ElevatorButton implements Button {
    private final int floorNumber;
    private boolean status;

    public ElevatorButton(int floorNumber) {
        this.floorNumber = floorNumber;
        this.status = false;
    }

    @Override
    public boolean isPressed() {
        return status;
    }

    @Override
    public void press() {
        status = true;
        System.out.println("Elevator button for floor " + floorNumber + " pressed.");
    }

    @Override
    public void release() {
        status = false;
        System.out.println("Elevator button for floor " + floorNumber + " released.");
    }
}
