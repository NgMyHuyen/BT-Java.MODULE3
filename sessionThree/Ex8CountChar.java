//Bt8: so lan xuat hien cua 1 ky tu

package sessionThree;
import java.util.Scanner;

public class Ex8CountChar {
    public static void main(String[] args) {

    char kyTu = 'a';
    int count = 0;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    String chuoi = scanner.nextLine();
    System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");
    // char kyTu = scanner.next().charAt(0);

    for (int i = 0; i < chuoi.length(); i++) {
        if (chuoi.charAt(i) == kyTu) {
            count++;
        }
    }

    System.out.println("Số lần xuất hiện của " + kyTu + " trong chuỗi " + chuoi + "là: " + count);
}

}
