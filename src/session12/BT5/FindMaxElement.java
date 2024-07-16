package session12.BT5;
import java.util.Scanner;
import java.util.Stack;

public class FindMaxElement {
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

        // Gọi hàm tìm phần tử lớn nhất và in kết quả
        int maxElement = findMaxUsingStack(array);
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);

        // Đóng Scanner
        scanner.close();
    }

    // Hàm tìm phần tử lớn nhất trong mảng bằng cách sử dụng stack
    public static int findMaxUsingStack(int[] array) {
        // B1: Tạo một stack rỗng để lưu trữ các phần tử
        Stack<Integer> stack = new Stack<>();

        // B2: Duyệt qua từng phần tử trong mảng
        for (int element : array) {
            // Nếu stack rỗng hoặc phần tử đang xét lớn hơn phần tử trên đỉnh của stack, đưa phần tử đó vào stack
            if (stack.isEmpty() || element > stack.peek()) {
                stack.push(element);
            } else {
                // Ngược lại, lấy phần tử trên đỉnh của stack ra khỏi stack
                stack.pop();
                stack.push(element);
            }
        }

        // B3: In ra phần tử lớn nhất nằm trên đỉnh của stack
        return stack.peek();
    }
}
