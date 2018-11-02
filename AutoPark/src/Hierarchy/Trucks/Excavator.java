package Hierarchy.Trucks;

import Hierarchy.Car;
import Interfaces.Digging;

public class Excavator extends Car implements Digging {

    public Excavator(int id, String brand, String model, int fuelConsumption, int price, String location, int maxPassengers, int maxCarryWeight) {
        super(id, brand, model, fuelConsumption, price, location, maxPassengers, maxCarryWeight);
    }
}
