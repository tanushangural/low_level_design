package lowLevelDesign.parkingLotSystemPracticing;

import lowLevelDesign.parkingLotSystemPracticing.data.ParkingSpot;
import lowLevelDesign.parkingLotSystemPracticing.data.Vehicle;
import lowLevelDesign.parkingLotSystemPracticing.enums.VehicleType;
import lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager.VehicleTypeManager;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ParkingSpotManager {
    private Vehicle vehicle;
    private VehicleType vehicleType;

    private static final Lock lock = new ReentrantLock();

    public ParkingSpotManager(Vehicle vehicle, VehicleType vehicleType) {
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
    }

    public ParkingSpot getParkingSpot() {
        return ParkingSpotInMemory.getAnyAvailableParkingSpotByVehicleType(vehicleType);
    }

    public void allocateParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.setAvl(true);
        parkingSpot.setVehicle(vehicle);
        ParkingSpotInMemory.updateParkingSpot(parkingSpot);
    }

    public ParkingSpot findAndAllocateParkingSpot() {
        synchronized (lock) {
            ParkingSpot parkingSpot = ParkingSpotInMemory.getAnyAvailableParkingSpotByVehicleType(vehicleType);
            if(parkingSpot == null) {
                throw new RuntimeException("No SpotFound");
            }
            parkingSpot.setAvl(true);
            parkingSpot.setVehicle(vehicle);
            ParkingSpotInMemory.updateParkingSpot(parkingSpot);
            return parkingSpot;
        }
    }

    public void deAllocateParkingSpot(ParkingSpot parkingSpot) {
        synchronized (lock) {
            parkingSpot.setAvl(false);
            parkingSpot.setVehicle(null);
            ParkingSpotInMemory.updateParkingSpot(parkingSpot);
        }
    }
}
