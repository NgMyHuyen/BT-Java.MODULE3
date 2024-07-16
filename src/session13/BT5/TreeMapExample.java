package session13.BT5;
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo TreeMap để lưu trữ các phần tử (sắp xếp theo khóa tăng dần mặc định)
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Nhập mảng từ người dùng
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Đưa các phần tử của mảng vào TreeMap
        for (int num : array) {
            treeMap.put(num, 0); // Giá trị 0 không quan trọng, chỉ cần có key là đủ
        }

        // In ra TreeMap sau khi sắp xếp tăng dần
        System.out.println("Các phần tử sắp xếp tăng dần trong TreeMap:");
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();

        // Tìm phần tử nhỏ nhất trong TreeMap
        Map.Entry<Integer, Integer> smallestEntry = treeMap.firstEntry();
        System.out.println("Phần tử nhỏ nhất trong TreeMap: " + smallestEntry.getKey());

        // Xóa phần tử lớn nhất để tìm phần tử lớn thứ 2
        treeMap.remove(treeMap.lastKey());
        if (!treeMap.isEmpty()) {
            Integer secondLargest = treeMap.lastKey();
            System.out.println("Phần tử lớn thứ 2 trong TreeMap: " + secondLargest);
        } else {
            System.out.println("Không có phần tử lớn thứ 2 trong TreeMap.");
        }
    }
}

