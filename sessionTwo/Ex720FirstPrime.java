package sessionTwo;

import java.util.Scanner;

public class Ex720FirstPrime {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int n = input.nextInt();
        System.out.println("Enter the ending number:");
        int l = input.nextInt();
        int count = 0;

        for (int i = n; i <= l; i++) {
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                count++;
                if (count == 20) {
                    break;
                }
            }
        }
    }
}
