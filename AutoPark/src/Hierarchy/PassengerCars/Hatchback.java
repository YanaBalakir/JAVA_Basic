package Hierarchy.PassengerCars;

import Hierarchy.Car;
import Interfaces.CruiseControl;
import Interfaces.EmergencyBrakingSystem;

public class Hatchback extends Car implements CruiseControl, EmergencyBrakingSystem {


    public Hatchback(int id, String brand, String model, int fuelConsumption, int price, String location, int maxPassengers, int maxCarryWeight) {
        super(id, brand, model, fuelConsumption, price, location, maxPassengers, maxCarryWeight);
    }
}


