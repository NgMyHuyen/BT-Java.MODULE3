package session12.BT2;
import java.util.Stack;

public class CheckParentheses {
    public static void main(String[] args) {
        // Ví dụ chuỗi đầu vào để kiểm tra
        String input = "{[()]}";

        // Gọi hàm kiểm tra và in kết quả
        if (isBalanced(input)) {
            System.out.println("Chuỗi đúng.");
        } else {
            System.out.println("Chuỗi không đúng.");
        }
    }

    // Hàm kiểm tra xem chuỗi có các cặp dấu ngoặc cân bằng hay không
    public static boolean isBalanced(String input) {
        //  Tạo một Stack rỗng để lưu trữ các dấu ngoặc
        Stack<Character> stack = new Stack<>();

        // Duyệt từng ký tự trong chuỗi đầu vào
        for (char ch : input.toCharArray()) {
            // B3: Nếu ký tự đang xét là một dấu ngoặc mở, đưa nó vào stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            //  Nếu ký tự đang xét là một dấu ngoặc đóng
            else if (ch == ')' || ch == '}' || ch == ']') {
                // Nếu stack rỗng, nghĩa là có dấu ngoặc đóng không có dấu ngoặc mở tương ứng
                if (stack.isEmpty()) {
                    return false;
                }

                // Lấy phần tử trên cùng của stack ra
                char openBracket = stack.pop();

                // Kiểm tra xem dấu ngoặc mở và đóng có khớp nhau hay không
                if ((ch == ')' && openBracket != '(') ||
                        (ch == '}' && openBracket != '{') ||
                        (ch == ']' && openBracket != '[')) {
                    return false;
                }
            }
        }

        //
        // Nếu đã duyệt hết chuỗi và Stack vẫn còn phần tử, chuỗi không đúng
        return stack.isEmpty();
    }
}

