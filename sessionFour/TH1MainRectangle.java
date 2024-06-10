package sessionFour;

import java.util.Scanner;

import javafx.scene.shape.Rectangle;

public class TH1MainRectangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter width");
        double width=input.nextDouble();
         System.out.println("Enter height");
        double height=input.nextDouble();
        TH1Rectangle rectangle=new TH1Rectangle(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area " + rectangle.getArea());
    }
}
