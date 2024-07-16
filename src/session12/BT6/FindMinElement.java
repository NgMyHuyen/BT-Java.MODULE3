package session12.BT6;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        // Tạo Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();

        // Khởi tạo mảng với kích thước đã nhập
        int[] array = new int[size];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Gọi hàm tìm phần tử nhỏ nhất và in kết quả
        int minElement = findMinUsingQueue(array);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minElement);

        // Đóng Scanner
        scanner.close();
    }

    // Hàm tìm phần tử nhỏ nhất trong mảng bằng cách sử dụng queue
    public static int findMinUsingQueue(int[] array) {
        // B1: Tạo một queue rỗng để lưu trữ các phần tử
        Queue<Integer> queue = new LinkedList<>();

        // B2: Duyệt qua từng phần tử trong mảng và đưa chúng vào queue
        for (int element : array) {
            queue.add(element);
        }

        // B3: Lấy phần tử đầu tiên trong queue ra khỏi queue
        int minElement = queue.poll();

        // B4: So sánh phần tử đó với các phần tử khác trong queue
        while (!queue.isEmpty()) {
            int currentElement = queue.poll();
            if (currentElement < minElement) {
                minElement = currentElement;
            }
        }

        // Phần tử nhỏ nhất nằm ở minElement
        return minElement;
    }
}

