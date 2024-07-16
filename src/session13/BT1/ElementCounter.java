package session13.BT1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementCounter {
    public static void main(String[] args) {
        // Khai báo mảng từ đầu vào của người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Đếm số lần xuất hiện của mỗi phần tử trong mảng
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();
        for (int element : array) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        // Duyệt qua các phần tử trong HashMap và in ra số lần xuất hiện của từng phần tử
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            System.out.println("Phần tử: " + entry.getKey() + ", Số lần xuất hiện: " + entry.getValue());
        }

        scanner.close();
    }
}

