package lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager;

public class FourWheelerVehicleTypeManager implements VehicleTypeManager{
    @Override
    public Double getParkingFee(Long duration) {
        return duration * 4.0;
    }
}
