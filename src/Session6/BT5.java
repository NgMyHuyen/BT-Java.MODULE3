package Session6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Product {
    private String productid;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private String catalogName;
    private int productStatus;

    public Product() {}

    public Product(String productid, String productName, float price, String description, Date created, String catalogName, int productStatus) {
        this.productid = productid;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogName = catalogName;
        this.productStatus = productStatus;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm (4 ký tự, bắt đầu với C, S hoặc A): ");
        this.productid = scanner.nextLine();
        while (!this.productid.matches("^[CSA]{1}.{3}$")) {
            System.out.println("Mã sản phẩm không hợp lệ. Nhập lại: ");
            this.productid = scanner.nextLine();
        }

        System.out.println("Nhập tên sản phẩm (10-50 ký tự): ");
        this.productName = scanner.nextLine();
        while (this.productName.length() < 10 || this.productName.length() > 50) {
            System.out.println("Tên sản phẩm không hợp lệ. Nhập lại: ");
            this.productName = scanner.nextLine();
        }

        System.out.println("Nhập giá sản phẩm (>0): ");
        this.price = scanner.nextFloat();
        while (this.price <= 0) {
            System.out.println("Giá sản phẩm không hợp lệ. Nhập lại: ");
            this.price = scanner.nextFloat();
        }

        scanner.nextLine();  // Consume newline left-over

        System.out.println("Nhập mô tả sản phẩm: ");
        this.description = scanner.nextLine();

        System.out.println("Nhập ngày nhập sản phẩm (dd/MM/yyyy): ");
        String createdStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.created = sdf.parse(createdStr);
        } catch (ParseException e) {
            System.out.println("Ngày không hợp lệ. Mặc định là ngày hiện tại.");
            this.created = new Date();
        }

        System.out.println("Nhập tên danh mục: ");
        this.catalogName = scanner.nextLine();

        System.out.println("Nhập trạng thái sản phẩm (0: Đang bán, 1: Hết hàng, 2: Không bán): ");
        this.productStatus = scanner.nextInt();
        while (this.productStatus < 0 || this.productStatus > 2) {
            System.out.println("Trạng thái sản phẩm không hợp lệ. Nhập lại: ");
            this.productStatus = scanner.nextInt();
        }
    }

    public void displayData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Mã sản phẩm: " + this.productid);
        System.out.println("Tên sản phẩm: " + this.productName);
        System.out.println("Giá sản phẩm: " + this.price);
        System.out.println("Mô tả sản phẩm: " + this.description);
        System.out.println("Ngày nhập sản phẩm: " + sdf.format(this.created));
        System.out.println("Tên danh mục: " + this.catalogName);
        System.out.println("Trạng thái sản phẩm: " + (this.productStatus == 0 ? "Đang bán" : (this.productStatus == 1 ? "Hết hàng" : "Không bán")));
    }
}

public class BT5 {
    public static void main(String[] args) {
        Product product = new Product();
        product.inputData();
        product.displayData();
    }
}
