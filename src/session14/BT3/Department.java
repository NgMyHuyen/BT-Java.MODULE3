package session14.BT3;
import java.util.HashSet;
import java.util.Set;

public class Department {
    private String departmentId; // Mã phòng ban
    private String departmentName; // Tên phòng ban
    private int totalMembers; // Tổng số nhân viên

    public Department(String departmentId, String departmentName) {
        if (!departmentId.matches("D\\d{3}")) {
            throw new IllegalArgumentException("Mã phòng ban phải bắt đầu bằng ký tự D và có đúng 4 ký tự.");
        }
        this.departmentId = departmentId;
        if (departmentName == null || departmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên phòng ban không được để trống.");
        }
        this.departmentName = departmentName;
        this.totalMembers = 0;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        if (departmentName == null || departmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên phòng ban không được để trống.");
        }
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void addMember() {
        this.totalMembers++;
    }

    public void removeMember() {
        this.totalMembers--;
    }
}

