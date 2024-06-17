package Ses8_ThBt.TH2;

public class Car extends Vehicle {

    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + this.getBrand() + '\'' + ", color='" + this.getColor() + '\'' + '}';
    }

    public static class Motorcycle extends Vehicle {
        //    public Motorcycle() {}
        public Motorcycle(String brand, String color) {
            super(brand, color);
        }
        @Override
        public String toString() {
            return "Motorcycle{" + "brand=' "+this.getBrand()+ '\''+ ", color=' "+this.getColor()+'\''+'}';
        }
    }
}