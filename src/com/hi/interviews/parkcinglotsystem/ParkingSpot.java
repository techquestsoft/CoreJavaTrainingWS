package com.hi.interviews.parkcinglotsystem;

public class ParkingSpot {
    private String id;
    private VehicleType spotType;
    private boolean isAvailable;

    // Constructor, getters, setters

    public ParkingSpot(String id, com.hi.interviews.parkcinglotsystem.VehicleType spotType, boolean isAvailable) {
        this.id = id;
        this.spotType = spotType;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public void setSpotType(VehicleType spotType) {
        this.spotType = spotType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
