package ParkingLotSystem.data;

public class EntryPoint {
    private String name;
    private boolean isOpen;

    public EntryPoint(String name, boolean isOpen) {
        this.name = name;
        this.isOpen = isOpen;
    }

    public String getName() {
        return name;
    }
    public boolean isOpen() {
        return isOpen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
