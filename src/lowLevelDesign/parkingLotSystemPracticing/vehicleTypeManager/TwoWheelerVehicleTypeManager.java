package lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager;

public class TwoWheelerVehicleTypeManager implements VehicleTypeManager{
    @Override
    public Double getParkingFee(Long duration) {
        return duration*2.0;
    }
}
