package ParkingLotSystem.data;

public class Ticket {
    private final String refNum;

    public String getRefNum() {
        return refNum;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;

    public Ticket(String refNum, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.refNum = refNum;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }
}
