package sessionFour.rikkeiAcademy;

import java.util.Scanner;

public class BT9Main {
    public static void main(String[] args) {
        BT9Student student=new BT9Student();
        Scanner sc= new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1.Hiển thị tất cả học sinh");
            System.out.println("2.Thêm mới học sinh");
            System.out.println("3.Sửa thông tin sinh viên theo mã sinh viên");
            System.out.println("4.Xoá học sinh");
            System.out.println("5.Thoát");
            System.out.print("Mời chọn chức năng: ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    student.displayData();
                    break;
                case 2:
                    student.addStudent();
                    break;
                case 3:
                    student.update();
                    break;
                case 4:
                    student.delete();
                    break;
                case 5:
                    System.exit(0);

            }
        }

    }
    
}
 