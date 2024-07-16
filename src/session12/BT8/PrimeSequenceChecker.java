package session12.BT8;
import java.util.Scanner;
import java.util.Stack;

public class PrimeSequenceChecker {
    public static void main(String[] args) {
        // Tạo Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi đầu vào
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Gọi hàm kiểm tra và in kết quả
        if (isPrimeSequence(input)) {
            System.out.println("Chuỗi là dãy số nguyên tố.");
        } else {
            System.out.println("Chuỗi không phải là dãy số nguyên tố.");
        }

        // Đóng Scanner
        scanner.close();
    }

    // Hàm kiểm tra xem chuỗi có phải là dãy số nguyên tố hay không
    public static boolean isPrimeSequence(String input) {
        // B1: Tạo một stack để lưu trữ các ký tự trong chuỗi đầu vào
        Stack<Integer> stack = new Stack<>();

        // B2: Duyệt qua từng ký tự trong chuỗi đầu vào
        for (char ch : input.toCharArray()) {
            // Kiểm tra xem ký tự đó có phải là số hay không
            if (Character.isDigit(ch)) {
                // Nếu là số, chuyển đổi ký tự đó thành số nguyên và thêm vào stack
                stack.push(Character.getNumericValue(ch));
            }
        }

        // B3: Lấy từng ký tự từ stack và kiểm tra xem chúng có phải là số nguyên tố hay không
        while (!stack.isEmpty()) {
            int number = stack.pop();
            if (!isPrime(number)) {
                return false;
            }
        }

        // Nếu tất cả các số trên stack đều là số nguyên tố, trả về true
        return true;
    }

    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

