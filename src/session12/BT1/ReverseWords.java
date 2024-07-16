package session12.BT1;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        // Tạo 1 Stack để lưu trữ văn bản
        Stack<String> stack = new Stack<>();

        // Nhập số lượng từ cần nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng từ: ");
        int soLuongTu = Integer.parseInt(scanner.nextLine());

        // Tạo 1 vòng lặp for với số lần lặp bằng số lượng từ vừa nhập, mỗi vòng lặp cho nhập 1 từ, rồi push vào stack
        for (int i = 0; i < soLuongTu; i++) {
            System.out.print("Nhập từ: ");
            String tu = scanner.nextLine();
            stack.push(tu);
        }

        // Tạo vòng lặp rồi in các từ trong stack ra bằng phương thức pop()
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
