package Session9.TH1_TH2_BT1234;

public abstract class Shape {
    private String color="green";
    private boolean filled=true;
    private double area;

    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {return color;}
    public boolean isFilled() {return filled;}

    public void setColor(String color) {this.color = color;}
    public void setFilled(boolean filled) {this.filled = filled;}
    @Override
    public String toString() {
        return "A Shape with color of: " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }

    public abstract double getArea();

    public void setArea(double area) {
        this.area = area;
    }
}