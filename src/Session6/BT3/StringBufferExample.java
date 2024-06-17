package Session6.BT3;

public class StringBufferExample {public static void main(String[] args) {
    // Khởi tạo một đối tượng từ lớp StringBuffer và gán cho một chuỗi bất kỳ
    StringBuffer sb = new StringBuffer("Rikkei Academy");

    // Sử dụng phương thức append để nối thêm chuỗi
    sb.append(" - Học viện lập trình");
    System.out.println("Sau khi append: " + sb);

    // Sử dụng phương thức insert để chèn thêm chuỗi tại vị trí chỉ định
    sb.insert(7, "Vietnam ");
    System.out.println("Sau khi insert: " + sb);

    // Sử dụng phương thức replace để thay thế chuỗi từ vị trí startIndex đến endIndex bằng chuỗi mới
    sb.replace(7, 14, "Hanoi");
    System.out.println("Sau khi replace: " + sb);

    // Sử dụng phương thức delete để xóa chuỗi từ vị trí startIndex đến endIndex
    sb.delete(0, 6);
    System.out.println("Sau khi delete: " + sb);

    // Sử dụng phương thức length để trả về chiều dài của chuỗi
    int length = sb.length();
    System.out.println("Chiều dài của chuỗi: " + length);

    // Sử dụng phương thức reverse để đảo ngược chuỗi
    sb.reverse();
    System.out.println("Sau khi reverse: " + sb);
}
}
