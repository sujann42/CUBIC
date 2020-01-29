package GENERICS;

public class Car {
    private String color;
    private String fuelType;
    private int price;

    public Car(){

    }


    public Car(String color, String fuelType, int price) {
        this.color = color;
        this.fuelType = fuelType;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
