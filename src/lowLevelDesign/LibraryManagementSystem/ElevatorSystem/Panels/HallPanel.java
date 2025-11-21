package lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Panels;

import lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Buttons.HallButton;

public class HallPanel {
    private final HallButton up;
    private final HallButton down;

    public HallPanel() {
        this.up = new HallButton(lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Enums.Direction.UP);
        this.down = new HallButton(lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Enums.Direction.DOWN);
    }

    public HallButton getUpButton() {
        return up;
    }

    public HallButton getDownButton() {
        return down;
    }
}
