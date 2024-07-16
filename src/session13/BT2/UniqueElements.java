package session13.BT2;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        //Khai báo mảng chứa các phần tử và tạo HashMap
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        // Duyệt từng phần tử trong mảng và cập nhật HashMap
        for (int element : array) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        // Tìm các phần tử duy nhất và lưu vào mảng mới
        List<Integer> uniqueElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements.add(entry.getKey());
            }
        }

        // In phần tử duy nhất
        System.out.println("Các phần tử duy nhất trong mảng: " + uniqueElements);

        scanner.close();
    }
}

