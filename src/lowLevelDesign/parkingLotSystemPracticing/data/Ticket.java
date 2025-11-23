package lowLevelDesign.parkingLotSystemPracticing.data;

import lowLevelDesign.parkingLotSystemPracticing.enums.VehicleType;

import java.util.Random;

public class Ticket {
    private final Integer ticketId;
    private final ParkingSpot parkingSpot;
    private final Vehicle vehicle;
    private final VehicleType vehicleType;
    private final Long startDuration;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle, VehicleType vehicleType) {
        Random random = new Random();
        this.ticketId = random.nextInt();
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
        this.startDuration = System.currentTimeMillis();
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Long getStartDuration() {
        return startDuration;
    }
}
