package Session9.TH1_TH2_BT1234;

public class Rectangle extends Shape implements ResizableBT1 {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = length;
    }

    public double getWidth() {return width; }
    public double getHeight() {return height;}

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        double factor=percent/100.0;
        this.width*=(1.0+factor);
        this.height*=(1.0+factor);
    }
    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

}