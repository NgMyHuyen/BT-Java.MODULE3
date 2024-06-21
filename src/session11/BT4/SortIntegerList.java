package session11.BT4;
import java.util.ArrayList;
import java.util.Scanner;

public class SortIntegerList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Bước 1: Tạo danh sách số nguyên và thêm phần tử vào list
        System.out.println("Nhập số lượng phần tử:");
        int n = scanner.nextInt();

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Bước 2: Sắp xếp danh sách theo thứ tự tăng dần sử dụng thuật toán nổi bọt
        bubbleSort(list);

        // Bước 3: In ra danh sách đã sắp xếp
        System.out.println("Danh sách đã sắp xếp:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    // Hàm sắp xếp nổi bọt (bubble sort)
    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Hoán đổi các phần tử
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
