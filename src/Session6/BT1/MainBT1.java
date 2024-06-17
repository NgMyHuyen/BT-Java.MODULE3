package Session6.BT1;

public class MainBT1 { public static void main(String[] args) {
    // Bước 1:Khai báo các biến kiểu String gán bằng 1 chuỗi bất kỳ
    String str1 = "  Rikkei Academy  ";
    String str2 = "";
    String str3 = "rikkei academy";
    String str4 = "Hello,World,Java";

    // isEmpty(): dùng để kiểm tra xem một chuỗi có rỗng hay không
    System.out.println("isEmpty() method:");
    System.out.println("str1 is empty: " + str1.isEmpty());
    System.out.println("str2 is empty: " + str2.isEmpty());

    // trim(): Remove whitespace from both ends/dùng để loại bỏ khoảng trắng ở 2 đầu
    System.out.println("\ntrim() method:");
    System.out.println("Before trim: \"" + str1 + "\"");
    System.out.println("After trim: \"" + str1.trim() + "\"");

    // equals()-phân biệt hoa thường , equalsIgnoreCase()- k phân biệt hoa thg: Compare two strings
    System.out.println("\nequals() and equalsIgnoreCase() methods:");
    System.out.println("str1 equals str3: " + str1.equals(str3));
    System.out.println("str1 equalsIgnoreCase str3: " + str1.trim().equalsIgnoreCase(str3));

    // split(): Split a string into an array of substrings/tách một chuỗi thành một mảng các từ
    System.out.println("\nsplit() method:");
    String[] parts = str4.split(",");
    for (String part : parts) {
        System.out.println(part);
    }

    // concat(): Concatenate two strings/ nối hai chuỗi lại
    System.out.println("\nconcat() method:");
    System.out.println("Concatenated string: " + str1.trim().concat(" ").concat(str3));

    // contains(): Check if one string contains another/kiểm tra chuỗi s1 chứa chuỗi s2 không
    System.out.println("\ncontains() method:");
    System.out.println("str1 contains 'Academy': " + str1.contains("Academy"));

    // toUpperCase()
    System.out.println("\ntoUpperCase() method:");
    System.out.println("str3 to uppercase: " + str3.toUpperCase());

    // toLowerCase()
    System.out.println("\ntoLowerCase() method:");
    System.out.println("str1 to lowercase: " + str1.toLowerCase());

    // replace():  thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới
    System.out.println("\nreplace() method:");
    System.out.println("str1 replace 'R' with 'B': " + str1.replace('R', 'B'));
    System.out.println("str1 replace 'Academy' with 'School': " + str1.replace("Academy", "School"));

    // length(): lấy độ dài chuỗi
    System.out.println("\nlength() method:");
    System.out.println("Length of str1: " + str1.length());
}
}

