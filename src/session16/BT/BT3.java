

package session16.BT;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BT3 {
    public static int binarySearchRecursive(List<Integer> list, int key, int start, int end) {
        if (start <= end) {
            int mid = start + (end -start) / 2;
            if (list.get(mid) == key) {
                return mid;
            } else if (list.get(mid)> key) {
                return binarySearchRecursive(list, key, start, mid - 1);
            }
            return binarySearchRecursive(list, key, mid + 1, end);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> list = Stream.generate(() -> rand.nextInt(50)).limit(10).collect(Collectors.toList());
        list.sort(Integer::compareTo);
        System.out.println("Sorted list: " + list);
        System.out.print("Enter a number to search: ");
        int key = Integer.parseInt(sc.nextLine());

        int index= binarySearchRecursive(list, key, 0, list.size()-1);
        if(index!=-1){
            System.out.println("Found " + list.get(index) + " at " + index);
        }else{
            System.out.println("Do not find out");}
    }
}