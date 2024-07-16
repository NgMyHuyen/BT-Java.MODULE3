package session14.BT3;
import java.util.*;

public class HRManagementApp implements HRManagementInterface {
    private List<Department> departments;
    private List<Employee> employees;

    public HRManagementApp() {
        this.departments = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    // Quản trị phòng ban
    public void displayDepartments() {
        for (Department dept : departments) {
            System.out.println("ID: " + dept.getDepartmentId() + ", Name: " + dept.getDepartmentName());
        }
    }

    public void addDepartment(String departmentId, String departmentName) {
        departments.add(new Department(departmentId, departmentName));
    }

    public void editDepartmentName(String departmentId, String newName) {
        for (Department dept : departments) {
            if (dept.getDepartmentId().equals(departmentId)) {
                dept.setDepartmentName(newName);
                return;
            }
        }
    }

    public void displayEmployeesByDepartment(String departmentId) {
        for (Employee emp : employees) {
            if (emp.getDepartment().getDepartmentId().equals(departmentId)) {
                System.out.println("ID: " + emp.getEmployeeId() + ", Name: " + emp.getEmployeeName());
            }
        }
    }

    public void deleteDepartment(String departmentId) {
        departments.removeIf(dept -> dept.getDepartmentId().equals(departmentId) && dept.getTotalMembers() == 0);
    }

    // Quản trị nhân viên
    public void displayAllEmployees() {
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getEmployeeId() + ", Name: " + emp.getEmployeeName());
        }
    }

    public void displayEmployeeDetails(String employeeId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(employeeId)) {
                System.out.println("ID: " + emp.getEmployeeId() + ", Name: " + emp.getEmployeeName() + ", Birthday: " + emp.getBirthday() + ", Sex: " + (emp.isSex() ? "Male" : "Female") + ", Salary: " + emp.getSalary() + ", Manager: " + (emp.getManager() != null ? emp.getManager().getEmployeeName() : "None") + ", Department: " + emp.getDepartment().getDepartmentName());
                return;
            }
        }
    }

    public void addEmployee(String employeeId, String employeeName, String birthday, boolean sex, double salary, String managerId, String departmentId) {
        Employee manager = null;
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(managerId)) {
                manager = emp;
                break;
            }
        }

        Department department = null;
        for (Department dept : departments) {
            if (dept.getDepartmentId().equals(departmentId)) {
                department = dept;
                break;
            }
        }

        if (department == null) {
            throw new IllegalArgumentException("Phòng ban không được null.");
        }

        employees.add(new Employee(employeeId, employeeName, birthday, sex, salary, manager, department));
    }

    public void editEmployee(String employeeId, String newName, String newBirthday, boolean newSex, double newSalary, String newManagerId, String newDepartmentId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(employeeId)) {
                emp.setEmployeeName(newName);
                emp.setBirthday(newBirthday);
                emp.setSex(newSex);
                emp.setSalary(newSalary);

                Employee newManager = null;
                for (Employee e : employees) {
                    if (e.getEmployeeId().equals(newManagerId)) {
                        newManager = e;
                        break;
                    }
                }
                emp.setManager(newManager);

                Department newDepartment = null;
                for (Department dept : departments) {
                    if (dept.getDepartmentId().equals(newDepartmentId)) {
                        newDepartment = dept;
                        break;
                    }
                }
                emp.setDepartment(newDepartment);
                return;
            }
        }
    }

    public void deleteEmployee(String employeeId) {
        employees.removeIf(emp -> emp.getEmployeeId().equals(employeeId));
    }

    public void displayAverageEmployeeCount() {
        for (Department dept : departments) {
            System.out.println("Department: " + dept.getDepartmentName() + ", Average Employees: " + (dept.getTotalMembers() / (double) employees.size()));
        }
    }

    public void displayTop5DepartmentsByEmployeeCount() {
        departments.stream()
                .sorted((d1, d2) -> Integer.compare(d2.getTotalMembers(), d1.getTotalMembers()))
                .limit(5)
                .forEach(dept -> System.out.println("Department: " + dept.getDepartmentName() + ", Total Members: " + dept.getTotalMembers()));
    }

    public void displayManagerWithMostEmployees() {
        Map<Employee, Long> managerCount = new HashMap<>();
        for (Employee emp : employees) {
            Employee manager = emp.getManager();
            if (manager != null) {
                managerCount.put(manager, managerCount.getOrDefault(manager, 0L) + 1);
            }
        }

        managerCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Manager: " + entry.getKey().getEmployeeName() + ", Managed Employees: " + entry.getValue()));
    }

    public void displayTop5OldestEmployees() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getBirthday))
                .limit(5)
                .forEach(emp -> System.out.println("Employee: " + emp.getEmployeeName() + ", Birthday: " + emp.getBirthday()));
    }

    public void displayTop5HighestPaidEmployees() {
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .limit(5)
                .forEach(emp -> System.out.println("Employee: " + emp.getEmployeeName() + ", Salary: " + emp.getSalary()));
    }

    public static void main(String[] args) {
        HRManagementApp app = new HRManagementApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Hiển thị danh sách phòng ban");
            System.out.println("2. Thêm mới phòng ban");
            System.out.println("3. Chỉnh sửa tên phòng ban");
            System.out.println("4. Hiển thị danh sách nhân viên của phòng ban");
            System.out.println("5. Xóa phòng ban");
            System.out.println("6. Hiển thị danh sách thông tin tất cả nhân viên");
            System.out.println("7. Xem chi tiết thông tin nhân viên");
            System.out.println("8. Thêm mới nhân viên");
            System.out.println("9. Chỉnh sửa thông tin nhân viên");
            System.out.println("10. Xóa nhân viên");
            System.out.println("11. Thống kê số lượng nhân viên trung bình của mỗi phòng");
            System.out.println("12. Tìm ra 5 phòng có số lượng nhân viên đông nhất");
            System.out.println("13. Tìm ra người quản lý nhiều nhân viên nhất");
            System.out.println("14. Tìm ra 5 nhân viên có tuổi cao nhất công ty");
            System.out.println("15. Tìm ra 5 nhân viên hưởng lương cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    app.displayDepartments();
                    break;
                case 2:
                    System.out.print("Nhập mã phòng ban: ");
                    String deptId = scanner.nextLine();
                    System.out.print("Nhập tên phòng ban: ");
                    String deptName = scanner.nextLine();
                    app.addDepartment(deptId, deptName);
                    break;
                case 3:
                    System.out.print("Nhập mã phòng ban: ");
                    String editDeptId = scanner.nextLine();
                    System.out.print("Nhập tên mới phòng ban: ");
                    String newDeptName = scanner.nextLine();
                    app.editDepartmentName(editDeptId, newDeptName);
                    break;
                case 4:
                    System.out.print("Nhập mã phòng ban: ");
                    String displayDeptId = scanner.nextLine();
                    app.displayEmployeesByDepartment(displayDeptId);
                    break;
                case 5:
                    System.out.print("Nhập mã phòng ban: ");
                    String deleteDeptId = scanner.nextLine();
                    app.deleteDepartment(deleteDeptId);
                    break;
                case 6:
                    app.displayAllEmployees();
                    break;
                case 7:
                    System.out.print("Nhập mã nhân viên: ");
                    String empId = scanner.nextLine();
                    app.displayEmployeeDetails(empId);
                    break;
                case 8:
                    System.out.print("Nhập mã nhân viên: ");
                    String newEmpId = scanner.nextLine();
                    System.out.print("Nhập tên nhân viên: ");
                    String empName = scanner.nextLine();
                    System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
                    String birthday = scanner.nextLine();
                    System.out.print("Nhập giới tính (true: nam, false: nữ): ");
                    boolean sex = scanner.nextBoolean();
                    System.out.print("Nhập lương cơ bản: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    System.out.print("Nhập mã quản lý (nếu có): ");
                    String managerId = scanner.nextLine();
                    System.out.print("Nhập mã phòng ban: ");
                    String departmentId = scanner.nextLine();
                    app.addEmployee(newEmpId, empName, birthday, sex, salary, managerId, departmentId);
                    break;
                case 9:
                    System.out.print("Nhập mã nhân viên: ");
                    String editEmpId = scanner.nextLine();
                    System.out.print("Nhập tên mới nhân viên: ");
                    String newEmpName = scanner.nextLine();
                    System.out.print("Nhập ngày sinh mới (dd/MM/yyyy): ");
                    String newBirthday = scanner.nextLine();
                    System.out.print("Nhập giới tính mới (true: nam, false: nữ): ");
                    boolean newSex = scanner.nextBoolean();
                    System.out.print("Nhập lương cơ bản mới: ");
                    double newSalary = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    System.out.print("Nhập mã quản lý mới (nếu có): ");
                    String newManagerId = scanner.nextLine();
                    System.out.print("Nhập mã phòng ban mới: ");
                    String newDeptId = scanner.nextLine();
                    app.editEmployee(editEmpId, newEmpName, newBirthday, newSex, newSalary, newManagerId, newDeptId);
                    break;
                case 10:
                    System.out.print("Nhập mã nhân viên: ");
                    String delEmpId = scanner.nextLine();
                    app.deleteEmployee(delEmpId);
                    break;
                case 11:
                    app.displayAverageEmployeeCount();
                    break;
                case 12:
                    app.displayTop5DepartmentsByEmployeeCount();
                    break;
                case 13:
                    app.displayManagerWithMostEmployees();
                    break;
                case 14:
                    app.displayTop5OldestEmployees();
                    break;
                case 15:
                    app.displayTop5HighestPaidEmployees();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

