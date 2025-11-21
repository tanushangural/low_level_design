package lowLevelDesign.ElevatorSystem.Panels;

import lowLevelDesign.ElevatorSystem.Buttons.HallButton;
import lowLevelDesign.ElevatorSystem.Enums.Direction;

public class HallPanel {
    private final HallButton up;
    private final HallButton down;

    public HallPanel() {
        this.up = new HallButton(Direction.UP);
        this.down = new HallButton(Direction.DOWN);
    }

    public HallButton getUpButton() {
        return up;
    }

    public HallButton getDownButton() {
        return down;
    }
}
