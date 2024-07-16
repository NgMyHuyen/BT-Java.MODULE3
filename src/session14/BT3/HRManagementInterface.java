package session14.BT3;

public interface HRManagementInterface {
    // Quản trị phòng ban
    void displayDepartments();
    void addDepartment(String departmentId, String departmentName);
    void editDepartmentName(String departmentId, String newName);
    void displayEmployeesByDepartment(String departmentId);
    void deleteDepartment(String departmentId);

    // Quản trị nhân viên
    void displayAllEmployees();
    void displayEmployeeDetails(String employeeId);
    void addEmployee(String employeeId, String employeeName, String birthday, boolean sex, double salary, String managerId, String departmentId);
    void editEmployee(String employeeId, String newName, String newBirthday, boolean newSex, double newSalary, String newManagerId, String newDepartmentId);
    void deleteEmployee(String employeeId);

    // Thống kê
    void displayAverageEmployeeCount();
    void displayTop5DepartmentsByEmployeeCount();
    void displayManagerWithMostEmployees();
    void displayTop5OldestEmployees();
    void displayTop5HighestPaidEmployees();
}
