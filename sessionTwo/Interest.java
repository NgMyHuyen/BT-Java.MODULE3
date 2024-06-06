// TH4: Lai ngan hang

package sessionTwo;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Input your princial:");
        double principal=input.nextDouble();

        System.out.println("Input your rate:");
        double rate=input.nextDouble();

        System.out.println("Input the time (month):");
        int month = input.nextInt();
        double totalInterest=0;

        for(int i=0; i<month; i++){
            totalInterest += principal*(rate/100)/12*month;
        }
        System.out.println("Total of interest:" + totalInterest);
    }
}
