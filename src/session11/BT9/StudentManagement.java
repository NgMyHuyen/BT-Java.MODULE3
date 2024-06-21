package session11.BT9;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();

    public void showAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        System.out.println("Không tìm thấy sinh viên");
        return null;
    }

    public double getAverageScore() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double totalScore = 0.0;
        for (Student student : students) {
            totalScore += student.getAverageScore();
        }
        return totalScore / students.size();
    }

    public void sortByScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore));
    }
}
