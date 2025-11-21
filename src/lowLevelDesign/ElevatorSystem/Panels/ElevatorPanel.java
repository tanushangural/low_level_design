package lowLevelDesign.ElevatorSystem.Panels;

import lowLevelDesign.ElevatorSystem.Buttons.ElevatorButton;
import lowLevelDesign.ElevatorSystem.Buttons.DoorButton;
import lowLevelDesign.ElevatorSystem.Enums.DoorStatus;

import java.util.List;
import java.util.stream.Stream;

public class ElevatorPanel {
    private final List<ElevatorButton> buttons;
    private final DoorButton openDoorButton;
    private final DoorButton closeDoorButton;

    public ElevatorPanel() {
        this.openDoorButton = new DoorButton(DoorStatus.OPEN);
        this.closeDoorButton = new DoorButton(DoorStatus.CLOSED);
        this.buttons = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
                .map(ElevatorButton::new)
                .toList();
    }

    public List<ElevatorButton> getButtons() {
        return buttons;
    }

    public DoorButton getOpenDoorButton() {
        return openDoorButton;
    }

    public DoorButton getCloseDoorButton() {
        return closeDoorButton;
    }
}
