package MainLogic.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CarsPropertiesReader {
    static Properties carsProperties = new Properties();

    public static void getCarsProperties() throws IOException {
        FileInputStream fis = new FileInputStream("src/MainLogic/Utils/CarsProperties");
        carsProperties.load(fis);
    }

    public static int getId(int index) {
        return Integer.parseInt(carsProperties.getProperty("id" + index));
    }

    public static String getBrand(int index) {
        return carsProperties.getProperty("brand" + index);
    }

    public static String getModel(int index) {
        return carsProperties.getProperty("model" + index);
    }

    public static String getLocation(int index) {
        return carsProperties.getProperty("location" + index);
    }

    public static int getMaxPassengers(int index) {
        return Integer.parseInt(carsProperties.getProperty("maxPassengers" + index));
    }

    public static int getMaxCarryWeight(int index) {
        return Integer.parseInt(carsProperties.getProperty("maxCarryWeight" + index));
    }

    public static int getPrice(int index) {
        return Integer.parseInt(carsProperties.getProperty("price" + index));
    }

    public static int getFuelConsumption(int index) {
        return Integer.parseInt(carsProperties.getProperty("fuelConsumption" + index));
    }
}


