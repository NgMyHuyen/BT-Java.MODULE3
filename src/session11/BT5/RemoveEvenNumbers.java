package session11.BT5;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Tạo danh sách số nguyên và thêm phần tử vào list
        System.out.println("Nhập số lượng phần tử:");
        int n = scanner.nextInt();

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        //Tạo danh sách mới để lưu các số lẻ
        ArrayList<Integer> newList = new ArrayList<>();

        // Duyệt danh sách ban đầu và thêm các số lẻ vào danh sách mới
        for (int num : list) {
            if (num % 2 != 0) {
                newList.add(num);
            }
        }

        // In ra danh sách mới đã loại bỏ các số chẵn
        System.out.println("Danh sách sau khi xóa các số chẵn:");
        for (int num : newList) {
            System.out.print(num + " ");
        }
    }
}
