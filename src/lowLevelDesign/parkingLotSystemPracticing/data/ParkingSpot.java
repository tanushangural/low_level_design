package lowLevelDesign.parkingLotSystemPracticing.data;

import lowLevelDesign.parkingLotSystemPracticing.enums.VehicleType;

public class ParkingSpot {
    private final VehicleType vehicleType;
    private final Integer floor;
    private Vehicle vehicle;
    private Boolean isAvl;

    private final Integer parkingSpotId;

    public ParkingSpot(Vehicle vehicle, VehicleType vehicleType, Integer floor, Boolean isAvl, Integer parkingSpotId) {
        this.vehicleType = vehicleType;
        this.floor = floor;
        this.parkingSpotId = parkingSpotId;
        this.isAvl = isAvl;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Integer getFloor() {
        return floor;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Boolean getAvl() {
        return isAvl;
    }

    public Integer getParkingSpotId() {
        return parkingSpotId;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setAvl(Boolean avl) {
        isAvl = avl;
    }
}
