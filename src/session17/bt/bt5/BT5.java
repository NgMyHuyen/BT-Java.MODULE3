package session17.bt.bt5;

import session17.bt.bt1.CheckedException;

import java.util.Scanner;
public class BT5 {
    public static int binarySearch(int[] arr, int key) throws CheckedException {
        int start = 0;
        int end = arr.length - 1;
        int index=-1;
        while (start <= end) {
            int mid = (start+ end) / 2;
            if (arr[mid] == key) {
                index= mid;
            }

            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if(index==-1) throw new CheckedException("K tim thay:" + key);
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter element "+(i+1)+ " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Enter the key: ");
        int key = Integer.parseInt(sc.nextLine());

        try{
            int result = binarySearch(arr, key);
            System.out.println("Key found at index: " + result);
        }catch (CheckedException e) {
            System.err.println(e.getMessage());
        }
    }
}
