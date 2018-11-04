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

    //find cars by price range
    public void showCarsByPrice(double lowerPrice,
                                          double upperPrice) {
        double price;

        System.out.println("Cars for Price range ["
                + lowerPrice + ", " + upperPrice + "]");
        for (Car car : carsList) {
            price = car.getPrice();
            if (price >= lowerPrice && price <= upperPrice) {
                System.out.println(car.getId() + ", "
                        + car.getBrand() + ","+ car.getPrice);
            }
            
   //getter, setter

    public void setCarsList(List<Car> carsList) {
        this.carsList = carsList;
    }

    public List<Car> getCarsList() {
        return carsList;
    }
}
