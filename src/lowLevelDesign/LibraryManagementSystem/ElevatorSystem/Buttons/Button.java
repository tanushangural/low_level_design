package lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Buttons;

public interface Button {
    public boolean isPressed();
    public void press();
    public void release();
}
