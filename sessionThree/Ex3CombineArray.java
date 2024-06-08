package sessionThree;

import java.util.Scanner;

public class Ex3CombineArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("First array's size");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        for(int i=0; i<size1; i++){
            System.out.println("Number" + (i+1));
            arr1[i]=sc.nextInt();
        }
        System.out.println("Property list:");
        for(int j=0; j<arr1.length; j++){
            System.out.print(arr1[j] + "\t");
        }

         System.out.println("Second array's size");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        for(int i=0; i<size2; i++){
            System.out.println("Number" + (i+1));
            arr2[i]=sc.nextInt();
        }
        System.out.println("Property list of second array:");
        for(int j=0; j<arr2.length; j++){
            System.out.print(arr2[j] + "\t");
        }

        int newSize=size1+size2;
        int concatArray[]=new int[newSize];
            for (int i = 0; i < size1; i++) {
            concatArray[i] = arr1[i];
        }
        for(int i=0; i<size2;i++){
            concatArray[size1 + i]=arr2[i];
        }
           System.out.println("Concatenated array:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(concatArray[i] + " ");
        }

    }
}
