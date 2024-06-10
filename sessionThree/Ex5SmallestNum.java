//Bt5: smallest number

package sessionThree;

import java.util.Scanner;

public class Ex5SmallestNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("The lengtht of number array: ");
        int size=input.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.println("Input number" + (i+1));
            arr[i]=input.nextInt();
        }
        
        System.out.println("List number: ");
        int min=arr[0];
        for(int j=0; j<arr.length; j++){
            System.out.printf(arr[j] + "\t");
            if(arr[j]<min) min=arr[j];
        }
        System.out.println("The smallest num is: " + min);
    }
}
