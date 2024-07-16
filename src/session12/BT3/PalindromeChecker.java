package session12.BT3;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Ví dụ chuỗi đầu vào để kiểm tra
        String input = "Able was I ere I saw Elba";

        // Gọi hàm kiểm tra và in kết quả
        if (isPalindrome(input)) {
            System.out.println("Chuỗi là palindrome.");
        } else {
            System.out.println("Chuỗi không phải là palindrome.");
        }
    }

    // Hàm kiểm tra xem chuỗi có phải là palindrome hay không
    public static boolean isPalindrome(String input) {
        // Chuyển chuỗi về chữ thường và loại bỏ các ký tự không phải chữ cái
        input = input.toLowerCase().replaceAll("[^a-z]", "");

        // Tạo Stack và Queue để lưu trữ các ký tự
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Duyệt từng ký tự trong chuỗi và thêm vào Stack và Queue
        for (char ch : input.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        // Lấy ra so sánh từng phần tử của Stack và Queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        // Nếu tất cả các ký tự đều khớp, chuỗi là palindrome
        return true;
    }
}
