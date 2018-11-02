package Hierarchy.Trucks;

import Hierarchy.Car;
import Interfaces.CargoCarring;

public class DumpTruck extends Car implements CargoCarring {

    public DumpTruck(int id, String brand, String model, int fuelConsumption, int price, String location, int maxPassengers, int maxCarryWeight) {
        super(id, brand, model, fuelConsumption, price, location, maxPassengers, maxCarryWeight);
    }
}
