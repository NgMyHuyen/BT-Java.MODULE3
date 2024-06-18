package Session10.BT3;
//String id, String title,String author, int year, String description,Category category
import java.util.Scanner;

public class Book {
        private String id;
        private String title;
        private String author;
        private int year;
        private String description;
        private Category category;

        public Book() {
        }

        public Book(String id, String title, String author, int year, String description, Category category) {
                this.id = id;
                this.title = title;
                this.author = author;
                this.year = year;
                this.description = description;
                this.category = category;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                if (id.startsWith("B") && id.length() == 4) {
                        this.id = id;
                } else {
                        System.out.println("Mã sách phải bắt đầu bằng 'B' và có độ dài 4 kí tự.");
                }
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                if (title.length() >= 6 && title.length() <= 50) {
                        this.title = title;
                } else {
                        System.out.println("Tiêu đề sách phải từ 6 đến 50 kí tự.");
                }
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                if (!author.isEmpty()) {
                        this.author = author;
                } else {
                        System.out.println("Tên tác giả không được bỏ trống.");
                }
        }

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                int currentYear = java.time.Year.now().getValue();
                if (year >= 1970 && year <= currentYear) {
                        this.year = year;
                } else {
                        System.out.println("Năm xuất bản phải từ 1970 đến năm hiện tại.");
                }
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                if (!description.isEmpty()) {
                        this.description = description;
                } else {
                        System.out.println("Mô tả sách không được bỏ trống.");
                }
        }

        public Category getCategory() {
                return category;
        }

        public void setCategory(Category category) {
                this.category = category;
        }

        public void inputData(Category[] categories) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập mã sách (bắt đầu bằng 'B', độ dài 4 kí tự): ");
                setId(scanner.nextLine());
                System.out.print("Nhập tiêu đề sách (6-50 kí tự): ");
                setTitle(scanner.nextLine());
                System.out.print("Nhập tên tác giả: ");
                setAuthor(scanner.nextLine());
                System.out.print("Nhập năm xuất bản: ");
                setYear(scanner.nextInt());
                scanner.nextLine(); // consume newline
                System.out.print("Nhập mô tả sách: ");
                setDescription(scanner.nextLine());

                System.out.println("Chọn thể loại sách từ danh sách dưới đây:");
                for (Category category : categories) {
                        if (category != null) {
                                category.displayData();
                        }
                }
                System.out.print("Nhập ID thể loại: ");
                int categoryId = scanner.nextInt();
                for (Category category : categories) {
                        if (category != null && category.getId() == categoryId) {
                                setCategory(category);
                                break;
                        }
                }
        }

        public void displayData() {
                System.out.println("ID: " + id + ", Tiêu đề: " + title + ", Tác giả: " + author + ", Năm xuất bản: " + year + ", Mô tả: " + description + ", Thể loại: " + category.getName());
        }
}

