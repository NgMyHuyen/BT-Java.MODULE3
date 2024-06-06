package sessionTwo;

import java.util.Scanner;

public class Ex4Average {
     public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điểm Toán: ");
        float math = scanner.nextFloat();

        System.out.println("Điểm Lí: ");
        float physics = scanner.nextFloat();

        System.out.println("Điểm Hóa: ");
        float chemistry = scanner.nextFloat();

        System.out.println("Điểm Văn: ");
        float literature = scanner.nextFloat();

        System.out.println("Điểm Anh văn: ");
        float eng = scanner.nextFloat();

        float mediumScore = (math + physics + chemistry + literature + eng) / 5;

        if (mediumScore >= 9) {
            System.out.println(mediumScore + "  => Học sinh xuất sắc");
        } else if (mediumScore >= 8 && mediumScore < 9) {
            System.out.println(mediumScore + "  => Học sinh Giỏi");
        } else if (mediumScore >= 6.5 && mediumScore < 8) {
            System.out.println(mediumScore + "  => Học sinh Khá");
        }
        else if (mediumScore < 6.5 && mediumScore >= 5) {
            System.out.println(mediumScore + "  => Học sinh Trung Bình");
        }
        else if (mediumScore >= 0 && mediumScore <5) {
            System.out.println(mediumScore + "  => Học sinh Yếu");
        }
        else {
            System.out.println("Điểm không hợp lệ");
        }
    }
}
