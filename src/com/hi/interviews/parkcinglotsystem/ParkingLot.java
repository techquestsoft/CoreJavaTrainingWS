package com.hi.interviews.parkcinglotsystem;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    // Constructor, methods to park/unpark vehicles, check availability, get capacity


    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }
}
