package lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager;

public class HeavyWheelerVehicleTypeManager implements VehicleTypeManager{
    @Override
    public Double getParkingFee(Long duration) {
        return duration * 8.0;
    }
}
