package ElevatorSystem.Panels;

import ElevatorSystem.Buttons.HallButton;

public class HallPanel {
    private final HallButton up;
    private final HallButton down;

    public HallPanel() {
        this.up = new HallButton(ElevatorSystem.Enums.Direction.UP);
        this.down = new HallButton(ElevatorSystem.Enums.Direction.DOWN);
    }

    public HallButton getUpButton() {
        return up;
    }

    public HallButton getDownButton() {
        return down;
    }
}
