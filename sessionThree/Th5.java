//TH5: so nho nhat

package sessionThree;

import java.util.Scanner;

public class Th5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("List size: ");
        int size= sc.nextInt();
        int array[]= new int[size];

        for(int i=0; i<array.length; i++){
             System.out.println("Enter element " + (i+1) + ":");
        array[i]=sc.nextInt();
        }

        int min= array[0];
        int index=1;
        for(int j=0; j<array.length; j++){
            if(array[j]<min){
                min= array[j];
                index=j+1;
            }
        }
        System.out.println("The smallest number in list is:" + min + ", at position "+index);

    }
}
