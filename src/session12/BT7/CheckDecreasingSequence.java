package session12.BT7;
import java.util.Scanner;
import java.util.Stack;

public class CheckDecreasingSequence {
    public static void main(String[] args) {
        // Tạo Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi đầu vào
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Gọi hàm kiểm tra và in kết quả
        if (isDecreasingSequence(input)) {
            System.out.println("Chuỗi là dãy giảm dần.");
        } else {
            System.out.println("Chuỗi không phải là dãy giảm dần.");
        }

        // Đóng Scanner
        scanner.close();
    }

    // Hàm kiểm tra xem chuỗi có phải là dãy giảm dần hay không
    public static boolean isDecreasingSequence(String input) {
        // B1: Khởi tạo một Stack để lưu trữ các ký tự của chuỗi đầu vào
        Stack<Character> stack = new Stack<>();

        // B2: Đưa các ký tự của chuỗi vào Stack bằng cách sử dụng vòng lặp for
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // B3: Khởi tạo một biến flag để lưu trữ kết quả kiểm tra, ban đầu gán giá trị là true
        boolean isDecreasing = true;

        // B4: Duyệt qua từng ký tự trong chuỗi đầu vào bằng vòng lặp for
        for (char ch : input.toCharArray()) {
            // B5: So sánh với ký tự đầu tiên trong Stack bằng phương thức peek()
            if (ch > stack.peek()) {
                // Nếu ký tự trong chuỗi lớn hơn ký tự đầu tiên trong Stack, gán giá trị của flag là false
                isDecreasing = false;
                break;
            }
            // Lấy ký tự đầu tiên ra khỏi Stack
            stack.pop();
        }

        // B6: Trả về kết quả kiểm tra
        return isDecreasing;
    }
}

