package lowLevelDesign.parkingLotSystemPracticing;


import lowLevelDesign.parkingLotSystemPracticing.apis.EntryParkingSpotAPI;
import lowLevelDesign.parkingLotSystemPracticing.apis.ExitParkingSpotAPI;
import lowLevelDesign.parkingLotSystemPracticing.data.ParkingSpot;
import lowLevelDesign.parkingLotSystemPracticing.data.Ticket;
import lowLevelDesign.parkingLotSystemPracticing.data.Vehicle;
import lowLevelDesign.parkingLotSystemPracticing.enums.PaymentMode;
import lowLevelDesign.parkingLotSystemPracticing.enums.VehicleType;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        EntryParkingSpotAPI entryParkingSpotAPI = new EntryParkingSpotAPI();
        ExitParkingSpotAPI exitParkingSpotAPI = new ExitParkingSpotAPI();

        for (ParkingSpot parkingSpot : ParkingSpotInMemory.list) {
            System.out.println(parkingSpot.getParkingSpotId() + " " + parkingSpot.getFloor() + " " + parkingSpot.getVehicle() + " "
            + parkingSpot.getVehicleType());
        }
        System.out.println();
        Thread.sleep(2000);

        Vehicle vehicle1 = new Vehicle("PB35 4073", VehicleType.TWO_WHEELER);
        Ticket ticket1 = entryParkingSpotAPI.entryParkingSpot(vehicle1,vehicle1.getVehicleType());
        System.out.println("ticket1" + ticket1);

        Thread.sleep(2000);

        for (ParkingSpot parkingSpot : ParkingSpotInMemory.list) {
            System.out.println(parkingSpot.getParkingSpotId() + " " + parkingSpot.getFloor() + " " + parkingSpot.getVehicle() + " "
                    + parkingSpot.getVehicleType());
        }
        System.out.println();
        Thread.sleep(2000);


        Vehicle vehicle2 = new Vehicle("PB35 4074", VehicleType.FOUR_WHEELER);
        Ticket ticket2 = entryParkingSpotAPI.entryParkingSpot(vehicle2,vehicle2.getVehicleType());
        System.out.println("ticket2" + ticket2);


        Thread.sleep(2000);


        for (ParkingSpot parkingSpot : ParkingSpotInMemory.list) {
            System.out.println(parkingSpot.getParkingSpotId() + " " + parkingSpot.getFloor() + " " + parkingSpot.getVehicle() + " "
                    + parkingSpot.getVehicleType());
        }
        System.out.println();
        Thread.sleep(2000);


        Vehicle vehicle3 = new Vehicle("PB35 4072", VehicleType.HEAVY_WHEELER);
        Ticket ticket3 = entryParkingSpotAPI.entryParkingSpot(vehicle3,vehicle3.getVehicleType());
        System.out.println("ticket3" + ticket3);

        Thread.sleep(2000);

        exitParkingSpotAPI.exitParkingSpot(ticket2, PaymentMode.CARD);

        Thread.sleep(2000);

        for (ParkingSpot parkingSpot : ParkingSpotInMemory.list) {
            System.out.println(parkingSpot.getParkingSpotId() + " " + parkingSpot.getFloor() + " " + parkingSpot.getVehicle() + " "
                    + parkingSpot.getVehicleType());
        }
        System.out.println();
        Thread.sleep(2000);

    }

}

/*
Functional Requirements:

1.The parking lot has:
Multiple floors/levels
Each floor has multiple parking spots
Spots can be of different types: for example Car, Bike, Truck (you can assume a few types).

2.On vehicle entry:
A vehicle arrives at an entry gate.
The system should find a suitable free spot for that vehicle type.
The system should generate a parking ticket containing basic details (e.g., vehicle info, spot, entry time).

3.On vehicle exit:
The driver presents the ticket at an exit gate.
The system calculates the parking fee based on the duration of stay and maybe vehicle type.
After payment, the spot should be freed and made available again.

4.The system should be able to show:
Available spots per floor
Available spots per vehicle type
* */

/*
APIS

1. List<ParkingSpot> getAvailableParkingSpotByVehicleType(VehicleType vehicleType);

2. List<ParkingSpot> getAvailableParkingSpotByFloor(Integer floor);

3. ParkingSpot findAParkingSpotForVehicleType(VehicleType vehicleType);

4. Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot);

5. Double calculateParkingFee(Ticket ticket);

6. PaymentReceipt payParkingAmount(Double paymentAmount, EntryTicket entryTicket);

7. void exitParking(Ticket ticket, PaymentReceipt paymentReceipt);

Database schema

ParkingSpot:
id, isAvl, vehicleType, vehicle, floor

* */
