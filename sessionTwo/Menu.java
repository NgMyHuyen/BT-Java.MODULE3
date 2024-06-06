// TH6: Menu ve hinh tam giac, chu nhat, vuong

package sessionTwo;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("What's shape do you want?");
        System.out.println("1.Triangle");
        System.out.println("2.Square");
        System.out.println("3.Rectangle");
        int isSwitch=input.nextInt();

        switch (isSwitch) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
             System.out.println("Draw the square");
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
                break;
             case 3:
                 System.out.println("Draw the rectangle");
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
                break;

            default:
            System.out.println("No choice!");
                // break;
        }
    }
}
