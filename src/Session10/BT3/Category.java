package Session10.BT3;

//int id, String name, boolean status, inputData,displayData
import java.util.Scanner;

public class Category {
    private int id;
    private String name;
    private boolean status;
    private static int idCounter = 1;

    public Category() {
        this.id = idCounter++;
    }

    public Category(String name, boolean status) {
        this();
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 6 && name.length() <= 30) {
            this.name = name;
        } else {
            System.out.println("Tên thể loại phải từ 6 đến 30 .");
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên thể loại (6-30 kí tự): ");
        setName(scanner.nextLine());
        System.out.print("Nhập trạng thái thể loại (true/false): ");
        setStatus(scanner.nextBoolean());
    }

    public void displayData() {
        System.out.println("ID: " + id + ", Tên: " + name + ", Trạng thái: " + (status ? "Hoạt động" : "Không hoạt động"));
    }
}

