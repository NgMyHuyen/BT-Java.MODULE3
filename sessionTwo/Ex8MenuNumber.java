package sessionTwo;

import java.util.Scanner;

public class Ex8MenuNumber {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
         System.out.println("Chọn chức năng: ");
            System.out.println("1. Kiểm tra số nhập vào là chẵn hay lẻ.");
            System.out.println("2. Kiểm tra số nhập vào có phải số nguyên tố không.");
            System.out.println("3. Kiểm tra số nhập vào có chia hết cho 3 không.");
            System.out.println("4. Thoát.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int number = scanner.nextInt();

                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn");
                    } else {
                        System.out.println(number + " là số lẻ");
                    }
                    break;

                case 2:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int number2 = scanner.nextInt();
                    if(number2<2){
                        System.out.println(number2 + " không phải là số nguyên tố");}

                     for (int k = 2; k < number2; k++) {
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(number2); i++) {
                        if (number2 % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(number2 + " là số nguyên tố");
                    }
                     else {
                        System.out.println(number2 + " không phải là số nguyên tố");
                    }
                    break;}

                case 3:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int number3 = scanner.nextInt();

                    if (number3 % 3 == 0) {
                        System.out.println(number3 + " chia hết cho 3");
                    } else {
                        System.out.println(number3 + " không chia hết cho 3");
                    }
                    break;

                case 4:
                    System.out.println("Đã thoát.");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại.");
                    break;
            }
        } while (choice != 4);
    }
}
