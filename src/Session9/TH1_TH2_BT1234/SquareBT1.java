package Session9.TH1_TH2_BT1234;

import java.io.Serializable;

public class SquareBT1 extends Rectangle implements ResizableBT1,ColorableBT2 {
    public SquareBT1() {}
    public SquareBT1(double side) {
        super(side, side);
    }
    public SquareBT1(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {return getWidth();}
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {super.setWidth(width);}
    public void setHeight(double height) {super.setHeight(height);}

    public void resize(double percent) {
        double factor = percent / 100.0;
        double newSize= getSide()*(1.0+factor);
        setSide(newSize);
    }

    public String toString(){
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}