package com.hi.interviews.parkcinglotsystem;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        ParkingSpot ps1 = new ParkingSpot("1", VehicleType.CAR, true);
        ParkingSpot ps2 = new ParkingSpot("2", VehicleType.MOTORCYCLE, true);
        ParkingSpot ps3 = new ParkingSpot("3", VehicleType.TRUCK, true);
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        parkingSpotList.add(ps1);
        parkingSpotList.add(ps2);
        parkingSpotList.add(ps3);

        ParkingFloor parkingFloor1 = new ParkingFloor(1, parkingSpotList);

        List<ParkingFloor> parkingFloors  = new ArrayList<>();

        parkingFloors.add(parkingFloor1);

        ParkingLot parkingLot1 = new ParkingLot(parkingFloors);

        List<ParkingLot> parkingLotList = new ArrayList<>();
        parkingLotList.add(parkingLot1);

        // parking lot with 1 floor
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem(parkingLot1); // Create a

        Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
        TestMain main = new TestMain();
        main.getListOfAvailableParkingSpots(parkingLotSystem);

        parkingLotSystem.parkVehicle(car, parkingFloors); // Park the car

        main.getListOfAvailableParkingSpots(parkingLotSystem);

        parkingLotSystem.unparkVehicle(car, parkingFloors); // Unpark the car

        main.getListOfAvailableParkingSpots(parkingLotSystem);
    }

    public void getListOfAvailableParkingSpots(ParkingLotSystem parkingLotSystem ){
       /* parkingLotSystem.getParkingLot().getFloors().stream().forEach(parkingFloor -> parkingFloor.getSpots().stream().forEach(parkingSpot -> System.out.println(parkingSpot.getId())));*/

        for(ParkingFloor parkingFloor : parkingLotSystem.getParkingLot().getFloors()){
            for(ParkingSpot parkingSpot : parkingFloor.getSpots()){
                if (parkingSpot.isAvailable() ){
                    System.out.println("Available Parking spot :: "+parkingSpot.getId() + " :: " + parkingSpot.getSpotType());
                }
           }
        }

    }

}
