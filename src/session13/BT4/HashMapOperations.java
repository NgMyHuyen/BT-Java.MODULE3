package session13.BT4;
import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        // Khai báo và khởi tạo HashMap gốc và tạo dữ liệu
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 3);
        originalMap.put("D", 4);
        originalMap.put("E", 5);

        // Sao chép toàn bộ HashMap này sang một HashMap khác
        HashMap<String, Integer> copiedMap = new HashMap<>();
        copiedMap.putAll(originalMap);

        // Kiểm tra xem một phần tử có tồn tại trong HashMap hay không
        String keyToCheck = "C";
        boolean exists = copiedMap.containsKey(keyToCheck);

        // In kết quả sao chép và kiểm tra
        System.out.println("Original HashMap: " + originalMap);
        System.out.println("Copied HashMap: " + copiedMap);
        System.out.println("Does key '" + keyToCheck + "' exist in the copied HashMap? " + exists);
    }
}

