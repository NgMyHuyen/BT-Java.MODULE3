package Session9.TH3;

public class MainTH3 {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn A", 22);
        Student student2 = new Student("Trần B", 18);
        Student student3 = new Student ("Lê C", 20);

        Teacher teacher1 = new Teacher("Tô Ngọc Lâm", 33);
        Teacher teacher2 = new Teacher("Ngô D", 30);

        //hiển thị thông tin bằng phương thức displayInfo()
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        teacher1.displayInfo();
        teacher2.displayInfo();
    }
}
