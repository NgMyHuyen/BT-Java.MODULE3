package sessionFour.rikkeiAcademy;

import java.util.Scanner;

public class BT8Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BT8Employee employee = new BT8Employee();
        employee.addEmployee(scanner);
        // System.out.println("Tien luong la: " +employee.calSalary());
        employee.displayData();
    }
}
