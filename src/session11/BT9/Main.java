package session11.BT9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Thêm các sinh viên vào danh sách
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Nhập mã số sinh viên: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Nhập họ và tên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập điểm trung bình: ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            management.addStudent(new Student(studentId, name, averageScore));
        }

        // Hiển thị tất cả sinh viên
        System.out.println("Danh sách sinh viên:");
        management.showAll();

        // Tìm kiếm sinh viên theo mã số
        System.out.print("\nTìm sinh viên với mã số: ");
        int searchId = scanner.nextInt();
        Student student = management.findStudentById(searchId);
        if (student != null) {
            System.out.println(student);
        }

        // Xóa sinh viên theo mã số
        System.out.print("\nXóa sinh viên với mã số: ");
        int removeId = scanner.nextInt();
        management.removeStudent(removeId);
        System.out.println("Danh sách sinh viên sau khi xóa:");
        management.showAll();

        // Sắp xếp sinh viên theo điểm tăng dần
        management.sortByScore();
        System.out.println("\nDanh sách sinh viên sắp xếp theo điểm tăng dần:");
        management.showAll();

        // Tính điểm trung bình của tất cả sinh viên
        System.out.println("\nĐiểm trung bình của tất cả sinh viên: " + management.getAverageScore());

        scanner.close();
    }
}