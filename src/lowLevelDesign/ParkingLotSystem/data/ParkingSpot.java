package lowLevelDesign.ParkingLotSystem.data;

public class ParkingSpot {
    private final int id;
    private final String FloorNumber;
    private final String name;
    private final VehicleType vehicleType;
    private final boolean isFree;

    public ParkingSpot(int id, String floorNumber, String name, VehicleType vehicleType, boolean isFree) {
        this.id = id;
        this.FloorNumber = floorNumber;
        this.name = name;
        this.vehicleType = vehicleType;
        this.isFree = isFree;
    }
}
