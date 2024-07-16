package session18.bt.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainBt2 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\TRAN\\INTELLIJ\\Intel-MD3\\Bt_MD3\\src\\session18\\bt\\data\\Bt2.txt";
        try {
            String content = readFile(filePath); // Đọc nội dung file
            String[] words = content.split("\\s+"); // Chia nội dung thành mảng từ
            List<String> longestWords = findLongestWords(words); // Tìm các từ có độ dài lớn nhất

            // In ra các từ có độ dài lớn nhất và độ dài của chúng
            if (longestWords.isEmpty()) {
                System.out.println("Không có từ nào trong file.");
            } else {
                int maxLength = longestWords.get(0).length();
                System.out.println("Các từ có độ dài lớn nhất (" + maxLength + " ký tự):");
                for (String word : longestWords) {
                    System.out.println(word);
                }
            }
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

    // Hàm tìm các từ có độ dài lớn nhất
    public static List<String> findLongestWords(String[] words) {
        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear(); // Xóa danh sách trước khi thêm từ mới có độ dài lớn nhất
                longestWords.add(word);
            } else if (word.length() == maxLength) {
                longestWords.add(word); // Thêm từ vào danh sách nếu nó có độ dài bằng maxLength
            }
        }

        return longestWords;
    }
}