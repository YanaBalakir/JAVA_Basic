package Hierarchy;

public abstract class Car {

    private int id;
    private String brand;
    private String model;
    private int fuelConsumption;
    private int price;
    private String location;
    private int maxPassengers;
    private int maxCarryWeight;


    //getters
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getMaxCarryWeight() {
        return maxCarryWeight;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setMaxCarryWeight(int maxCarryWeight) {
        this.maxCarryWeight = maxCarryWeight;
    }

    // constructor

    public Car(int id, String brand, String model, int fuelConsumption, int price, String location, int maxPassengers, int maxCarryWeight) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.location = location;
        this.maxPassengers = maxPassengers;
        this.maxCarryWeight = maxCarryWeight;
    }


    //methods

    public void move(Car car, String destination) {
        System.out.println(car.getId() + "is moved from " + car.getLocation() + "to" + destination);
    }

    int takePassengers(int countOfPassengers) {
        if (countOfPassengers >= maxPassengers) {
            return 0;
        } else {
            return maxPassengers - countOfPassengers;
        }
    }

    int takeCarry(int carryWeight) {
        if (carryWeight >= maxCarryWeight) {
            return 0;
        } else {
            return -carryWeight;
        }
    }

 }
