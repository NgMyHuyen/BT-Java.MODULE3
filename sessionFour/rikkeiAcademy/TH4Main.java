package sessionFour.rikkeiAcademy;

import java.util.Scanner;

public class TH4Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        float a= input.nextFloat();
        System.out.println("Input second number");
        float b= input.nextFloat();
        TH4Calculator calculator= new TH4Calculator(a,b);
        System.out.println("Sum: " + calculator.sum());
        System.out.println("Sum: " + calculator.minus());
        System.out.println("Sum: " + calculator.multiplication());
        System.out.println("Sum: " + calculator.division());
    }
}
