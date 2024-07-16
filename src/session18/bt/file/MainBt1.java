package session18.bt.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainBt1 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\TRAN\\INTELLIJ\\Intel-MD3\\Bt_MD3\\src\\session18\\bt\\data\\BT1.txt"; // Đường dẫn đến file text của bạn

        try {
            String content = readFile(filePath); // Đọc nội dung file
            String[] words = content.split("\\s+"); // Chia nội dung thành mảng từ
            int wordCount = words.length; // Đếm số lượng từ
            System.out.println("Số lượng từ trong file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }

    // Hàm đọc file và trả về nội dung dưới dạng String
    public static String readFile(String filePath) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        }
        return contentBuilder.toString();
    }
}