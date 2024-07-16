package session13.BT3;
import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        // Khai báo một HashMap và thêm các phần tử vào
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 5);
        hashMap.put("B", 1);
        hashMap.put("C", 3);
        hashMap.put("D", 2);
        hashMap.put("E", 4);

        // Tạo một danh sách các cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Dùng Collections.sort() để sắp xếp danh sách theo giá trị tăng dần
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Duyệt qua danh sách đã sắp xếp và in các phần tử theo thứ tự tăng dần của giá trị
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

