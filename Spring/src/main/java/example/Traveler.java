package org.example;

public class Traveler {
    private vehicle vehicle;
    public  Traveler(vehicle vehicle){
        this.vehicle= vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
