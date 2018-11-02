package MainLogic;

import Hierarchy.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AutoStation {

    private List<Car> carsList;


// find price of AutoStation

    public int findStationPrice() {
        int stationPrice = 0;
        for (Car car : carsList) {
            stationPrice += car.getPrice();
        }
        return stationPrice;
    }

   //getter, setter

    public void setCarsList(List<Car> carsList) {
        this.carsList = carsList;
    }

    public List<Car> getCarsList() {
        return carsList;
    }
}
