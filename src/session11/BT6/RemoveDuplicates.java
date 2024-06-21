package session11.BT6;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Tạo list chứa các phần tử mặc định
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);

        // Hoặc sử dụng nhập từ bàn phím
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập số lượng phần tử:");
         int n = scanner.nextInt();
         System.out.println("Nhập các phần tử:");
         for (int i = 0; i < n; i++) {
             list.add(scanner.nextInt());
         }

        // Tạo danh sách mới để chứa các phần tử không trùng lặp
        ArrayList<Integer> newList = new ArrayList<>();

        // Duyệt danh sách cũ và thêm các phần tử không trùng lặp vào danh sách mới
        for (int num : list) {
            if (!newList.contains(num)) {
                newList.add(num);
            }
        }

        // In ra danh sách mới đã loại bỏ các phần tử trùng lặp
        System.out.println("Danh sách không có phần tử trùng lặp:");
        for (int num : newList) {
            System.out.print(num + " ");
        }
    }
}

