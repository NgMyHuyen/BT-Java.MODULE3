package Ses8_ThBt.TH2;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String color) {
        super(brand, color);
    }
    @Override
    public String toString() {
        return "Motorcycle{" + "brand=' "+this.getBrand()+ '\''+ ", color=' "+this.getColor()+'\''+'}';
    }
}
