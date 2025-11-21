package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data;

import java.time.LocalDateTime;

public class Vehicle {
    public String getName() {
        return name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    private final String name;
    private final VehicleType vehicleType;
    private final String licensePlate;
    private final LocalDateTime entryTime;

    public Vehicle(String name, VehicleType vehicleType, String licensePlate) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
        this.entryTime = LocalDateTime.now();
    }
}
