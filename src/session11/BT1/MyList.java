package session11.BT1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyList{
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add((int)(Math.random()*100));
        }
        System.out.println("Danh sách số nguyên ngẫu nhiên:");
        System.out.println(intList);

        Integer maxElement= Collections.max(intList);
        System.out.println("Phần tử lớn nhất trong danh sách là: " + maxElement);

        Collections.reverse(intList);
        System.out.println("Danh sách sau khi đảo ngược:");
        System.out.println(intList);

        Collections.sort(intList);
        System.out.println("Danh sách sau khi sắp xếp tăng dần:");
        System.out.println(intList);

        List<Integer> intList2 = new ArrayList<>(Arrays.asList(2,3,5));
        intList2.add(99);
        System.out.println("List ban đầu:");
        System.out.println(intList);
        System.out.println("List thêm vào:");
        System.out.println(intList2);

        intList.addAll(intList2);
        System.out.println("Danh sách sau khi sao chép từ anotherList:");
        System.out.println(intList);
    }
}
