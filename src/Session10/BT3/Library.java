package Session10.BT3;
import java.util.Scanner;

public class Library {
    private static Category[] categories = new Category[100];
    private static Book[] books = new Book[100];
    private static int categoryCount = 0;
    private static int bookCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Quản lý Thể loại");
            System.out.println("2. Quản lý Sách");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manageCategories();
                    break;
                case 2:
                    manageBooks();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void manageCategories() {
        while (true) {
            System.out.println("===== QUẢN LÝ THỂ LOẠI =====");
            System.out.println("1. Thêm mới thể loại");
            System.out.println("2. Hiển thị danh sách theo tên thể loại A – Z");
            System.out.println("3. Thống kê thể loại và số sách có trong mỗi thể loại");
            System.out.println("4. Cập nhật thể loại");
            System.out.println("5. Xóa thể loại");
            System.out.println("6. Quay lại");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    displayCategories();
                    break;
                case 3:
                    statisticsCategories();
                    break;
                case 4:
                    updateCategory();
                    break;
                case 5:
                    deleteCategory();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void addCategory() {
        if (categoryCount < categories.length) {
            Category category = new Category();
            category.inputData();
            categories[categoryCount++] = category;
            System.out.println("Thêm thể loại thành công!");
        } else {
            System.out.println("Không thể thêm thể loại mới, danh sách đã đầy.");
        }
    }

    private static void displayCategories() {
        Category[] sortedCategories = new Category[categoryCount];
        System.arraycopy(categories, 0, sortedCategories, 0, categoryCount);

        for (int i = 0; i < categoryCount - 1; i++) {
            for (int j = i + 1; j < categoryCount; j++) {
                if (sortedCategories[i].getName().compareToIgnoreCase(sortedCategories[j].getName()) > 0) {
                    Category temp = sortedCategories[i];
                    sortedCategories[i] = sortedCategories[j];
                    sortedCategories[j] = temp;
                }
            }
        }

        for (Category category : sortedCategories) {
            category.displayData();
        }
    }

    private static void statisticsCategories() {
        for (Category category : categories) {
            if (category != null) {
                int count = 0;
                for (Book book : books) {
                    if (book != null && book.getCategory().getId() == category.getId()) {
                        count++;
                    }
                }
                System.out.println("Thể loại: " + category.getName() + ", Số sách: " + count);
            }
        }
    }
    private static void updateCategory() {
        System.out.print("Nhập ID thể loại cần cập nhật: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < categoryCount; i++) {
            if (categories[i].getId() == id) {
                categories[i].inputData();
                System.out.println("Cập nhật thể loại thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy thể loại với ID: " + id);
    }

    private static void deleteCategory() {
        System.out.print("Nhập ID thể loại cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < categoryCount; i++) {
            boolean hasBooks = false;
            for (Book book : books) {
                if (book != null && book.getCategory().getId() == id) {
                    hasBooks = true;
                    break;
                }
            }
            if (hasBooks) {
                System.out.println("Thể loại đang có sách, không thể xóa.");
                return;
            }
            if (categories[i].getId() == id) {
                categories[i] = categories[--categoryCount];
                categories[categoryCount] = null;
                System.out.println("Xóa thể loại thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy thể loại với ID: " + id);
    }

    private static void manageBooks() {
        while (true) {
            System.out.println("===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Cập nhật thông tin sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách sách theo nhóm thể loại");
            System.out.println("6. Quay lại");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    updateBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    searchBook();
                    break;
                case 5:
                    displayBooksByCategory();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void addBook() {
        if (bookCount < books.length) {
            Book book = new Book();
            book.inputData(categories);
            books[bookCount++] = book;
            System.out.println("Thêm sách thành công!");
        } else {
            System.out.println("Không thể thêm sách mới, danh sách đã đầy.");
        }
    }

    private static void updateBook() {
        System.out.print("Nhập mã sách cần cập nhật: ");
        String id = scanner.nextLine();
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals(id)) {
                books[i].inputData(categories);
                System.out.println("Cập nhật thông tin sách thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã: " + id);
    }

    private static void deleteBook() {
        System.out.print("Nhập mã sách cần xóa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals(id)) {
                books[i] = books[--bookCount];
                books[bookCount] = null;
                System.out.println("Xóa sách thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã: " + id);
    }

    private static void searchBook() {
        System.out.print("Nhập từ khóa tìm kiếm: ");
        String keyword = scanner.nextLine();
        for (Book book : books) {
            if (book != null && (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword))) {
                book.displayData();
            }
        }
    }

    private static void displayBooksByCategory() {
        for (Category category : categories) {
            if (category != null) {
                System.out.println("Thể loại: " + category.getName());
                for (Book book : books) {
                    if (book != null && book.getCategory().getId() == category.getId()) {
                        book.displayData();
                    }
                }
            }
        }
    }
}
