package sessionThree;

import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount of mark you want to input: ");
        int size = input.nextInt();
        int array[]=new int[size];

        for(int i=0; i<array.length; i++){
            System.out.println("Enter mark" + i+1);
            array[i]=input.nextInt();
        }

        int count=0;
        System.out.println("List of mark");
        for(int j=0; j<array.length; j++){
            System.out.printf(array[j] + "\t");
            if(array[j]>5 && array[j]<=10)
            count++;
        }
        System.out.printf("\n The number of student pass the exam is: " + count);

    }
}
