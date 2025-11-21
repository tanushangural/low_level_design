package lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Panels;

import lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Buttons.DoorButton;

import java.util.List;
import java.util.stream.Stream;

public class ElevatorPanel {
    private final List<lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Buttons.ElevatorButton> buttons;
    private final DoorButton openDoorButton;
    private final DoorButton closeDoorButton;

    public ElevatorPanel() {
        this.openDoorButton = new DoorButton(lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Enums.DoorStatus.OPEN);
        this.closeDoorButton = new DoorButton(lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Enums.DoorStatus.CLOSED);
        this.buttons = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
                .map(lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Buttons.ElevatorButton::new)
                .toList();
    }

    public List<lowLevelDesign.LibraryManagementSystem.ElevatorSystem.Buttons.ElevatorButton> getButtons() {
        return buttons;
    }

    public DoorButton getOpenDoorButton() {
        return openDoorButton;
    }

    public DoorButton getCloseDoorButton() {
        return closeDoorButton;
    }
}
