package raSes3_Hoclai;
import java.util.Random;
import java.util.Scanner;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        //Array in Java
//        //thành phần : index_chỉ số ; element_fần tử
//
//        //Đặc điểm của măng (4)
//
//        //Cách khai báo & khởi tạo giá trị
//        //cách 1 - từ khóa new ; cách 2 - k có từ khóa :
//        int[] arayInt = new int[] {1,2,3,4,5}; //các phần tử ban đầu = 0
//        int[] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arayInt));
//    }

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.println(
                    "-------Menu------\n"
                            + "1. Display\n"
                            + "2. Add \n"
                            + "3. Delete \n"
                            + "4. Update \n"
                            + "5. Exit\n"
            );
            Scanner sc = new Scanner(System.in);
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    NumberManager.printArray();
//                System.out.println(Arrays.toString(NumberManager.arrayUnt));
                    break;
                case 2:
                    int randomInt = new Random().nextInt(100);
                    NumberManager.addNum(randomInt);
                    break;
                case 3:
                    System.out.println("Nhap index can xoa");
                    byte index = Byte.parseByte(sc.nextLine());
                    NumberManager.removeNum(index);
                    break;
                    case 4:
                        System.out.println("Nhap index can sua");
                        byte index2 = Byte.parseByte(sc.nextLine());
                        System.out.println("So ban muon them");
                        byte num = Byte.parseByte(sc.nextLine());
                        NumberManager.updateNum(index2, num);
                        break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
