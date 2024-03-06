package com.hi.interviews.parkcinglotsystem;

import java.util.List;
public class ParkingLotSystem {
    private ParkingLot parkingLot;

    // Constructor, methods to manage parking operations


    public ParkingLotSystem(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void parkVehicle(Vehicle car, List<ParkingFloor> parkingFloors){
        // need to check how to use streams
        /*parkingFloors.stream().forEach(parkingFloor -> parkingFloor.getSpots().stream().
                forEach(parkingSpot -> parkingSpot.getSpotType().equals(car.getType())?
                        parkingSpot.setAvailable(false):
                        System.out.println("Parking slot not avaliable")));*/

        for(ParkingFloor parkingFloor : parkingFloors){
            for(ParkingSpot parkingSpot : parkingFloor.getSpots()){
                if (parkingSpot.getSpotType().equals(car.getType()) ){
                    if (parkingSpot.isAvailable() ){
                        parkingSpot.setAvailable(false);
                    } else {
                        System.out.println("Parking spot not avaliable");
                    }
                }
            }
        }
    }

    public void unparkVehicle(Vehicle car, List<ParkingFloor> parkingFloors){
        // need to check how to use streams
        /*parkingFloors.stream().forEach(parkingFloor -> parkingFloor.getSpots().stream().
                forEach(parkingSpot -> parkingSpot.getSpotType().equals(car.getType())?
                        parkingSpot.setAvailable(false):
                        System.out.println("Parking slot not avaliable")));*/

        for(ParkingFloor parkingFloor : parkingFloors){
            for(ParkingSpot parkingSpot : parkingFloor.getSpots()){
                if (parkingSpot.getSpotType().equals(car.getType()) ){
                    if (!parkingSpot.isAvailable() ){
                        parkingSpot.setAvailable(true);
                    }
                }
            }
        }
    }
}
