// TH5: Kiem tra so nguyen to

package sessionTwo;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("The number you want to check:");
        int number = input.nextInt();

        if(number < 2){
            System.out.println(number + " is not prime");
        }else {
            int i=2;
            boolean isPrime=true;
            while (i<number) {
                if(number%i==0) {
                    isPrime=false;
                break;
                }
                i++;
            }
            if(isPrime==true){
                System.out.println(number+" is prime");
            }else {System.out.println(number+" is not prime");}
        }
    }
}
