package session14.BT3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String employeeId; // Mã nhân viên
    private String employeeName; // Tên nhân viên
    private LocalDate birthday; // Ngày sinh
    private boolean sex; // Giới tính
    private double salary; // Lương cơ bản
    private Employee manager; // Người quản lý
    private Department department; // Phòng ban

    public Employee(String employeeId, String employeeName, String birthday, boolean sex, double salary, Employee manager, Department department) {
        if (!employeeId.matches("E\\d{4}")) {
            throw new IllegalArgumentException("Mã nhân viên phải bắt đầu bằng ký tự E và có đúng 5 ký tự.");
        }
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.sex = sex;
        this.salary = salary;
        this.manager = manager;
        if (department == null) {
            throw new IllegalArgumentException("Phòng ban không được null.");
        }
        this.department = department;
        this.department.addMember();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getManager() {
        return manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setBirthday(String birthday) {
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setDepartment(Department department) {
        if (this.department != null) {
            this.department.removeMember();
        }
        this.department = department;
        this.department.addMember();
    }
}
