package MainLogic;

import Hierarchy.Car;

import java.util.ArrayList;
import java.util.List;

public class StationFactory {

    public static AutoStation createStation(Car...args) {
        AutoStation autoStation = new AutoStation ();
        List<Car> carsList = new ArrayList<Car>();
        for(Car arg:args){
            carsList.add(arg);
        }
        autoStation.setCarsList(carsList);
        return autoStation;
    }
}


