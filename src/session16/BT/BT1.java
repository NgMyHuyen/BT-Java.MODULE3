package session16.BT;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class BT1 {

        public static int linearSearchList(List<Integer> list, int key) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == key)
                    return i;
            }
            return -1;
        }

        public static int findMax(List<Integer> list) {
            int max = list.get(0);
            for (int num : list) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Random rand = new Random();
            List<Integer> list = Stream.generate(() -> rand.nextInt(50)).limit(10).collect(Collectors.toList());

            System.out.println("Generated list: " + list);
            int maxNumber = findMax(list);
            System.out.println("The largest number in the list is: " + maxNumber);
        }
    }


