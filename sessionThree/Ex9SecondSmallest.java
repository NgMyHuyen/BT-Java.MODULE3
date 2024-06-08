package sessionThree;
import java.util.Arrays;
import java.util.Scanner;

public class Ex9SecondSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 System.out.println("The length of number list: ");
        int size=input.nextInt();
        int array[]=new int[size];

        for(int i=0; i<array.length; i++){
            System.out.println("Input number" + (i+1));
            array[i]=input.nextInt();
        }

        int n = size;
       System.out.println("Before arrange: ");
       for(int i=0; i<n; i++){
        System.out.print(array[i] + " ");
       }

        Arrays.sort(array);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Giá trị nhỏ thứ 2 = " + array[1]);
    
    }
}


