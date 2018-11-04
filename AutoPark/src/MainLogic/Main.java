package MainLogic;

import Hierarchy.Car;
import Hierarchy.PassengerCars.Hatchback;
import Hierarchy.PassengerCars.Minivan;
import Hierarchy.PassengerCars.Sedan;
import Hierarchy.Trucks.DumpTruck;
import MainLogic.Utils.CarsPropertiesReader;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        //create cars
        Car car1 = new Hatchback(001, "Mazda", "6", 9, 5000, "Minsk", 5, 100);
        Car car2 = new Minivan(002, "Opel", "Corsa", 7, 10000, "Minsk", 7, 100);
        Car car3 = new DumpTruck(003, "MAZ", "33", 13, 15000, "Vitebsk", 2, 1000);
        Car car4 = new Sedan(004, "Fiat", "Punto", 8, 6000, "Mogilev", 5, 100);

        //add cars to Station
        AutoStation autoStation1 = StationFactory.createStation(car1, car2, car3, car4);

//find price

        System.out.println(autoStation1.findStationPrice());

        //sort by Fuel Consumption
        autoStation1.getCarsList().sort(Comparator.comparing(Car::getFuelConsumption));

        //search by range of the parameters
autoStation1.showCarsByPrice(3000,10000);

// get car's location from properties file


        CarsPropertiesReader.getLocation(2);

        }
    }

