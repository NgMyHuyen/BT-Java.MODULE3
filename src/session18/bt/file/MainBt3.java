package session18.bt.file;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBt3 {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\TRAN\\INTELLIJ\\Intel-MD3\\Bt_MD3\\src\\session18\\bt\\data\\Bt3.txt"; // Đường dẫn đến file gốc của bạn
        String destinationFilePath = "destination.txt"; // Đường dẫn đến file sao chép và đảo ngược phần tử của bạn

        try {
            String content = readFile(sourceFilePath); // Đọc nội dung file gốc
            String reversedContent = reverseWords(content); // Đảo ngược thứ tự các từ trong nội dung
            writeFile(destinationFilePath, reversedContent); // Ghi nội dung đã đảo ngược vào file mới

            System.out.println("File đã được sao chép và đảo ngược phần tử thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi xử lý file: " + e.getMessage());
        }
    }

    // Hàm đọc nội dung của file và trả về dưới dạng String
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

    // Hàm đảo ngược thứ tự các từ trong nội dung văn bản
    public static String reverseWords(String content) {
        String[] words = content.split("\\s+"); // Chia nội dung thành mảng từ
        List<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, words); // Chuyển mảng từ thành danh sách

        Collections.reverse(wordsList); // Đảo ngược thứ tự các từ

        return String.join(" ", wordsList); // Ghép lại thành một chuỗi với các từ đã đảo ngược
    }

    // Hàm ghi nội dung vào file mới
    public static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content);
        }
    }
}