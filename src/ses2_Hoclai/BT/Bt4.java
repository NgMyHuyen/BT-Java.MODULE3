package ses2_Hoclai.BT;
import java.util.Scanner;
public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Math score : ");
        float math = scanner.nextFloat();

        System.out.print("English score : ");
        float eng = scanner.nextFloat();

        System.out.print("Physic score : ");
        float physic = scanner.nextFloat();

        System.out.print("Literature score : ");
        float literature = scanner.nextFloat();

        System.out.println("Chemistry score : ");
        float chemistry = scanner.nextFloat();

        float mediumScore = (math + eng + physic + literature + chemistry)/5;

        if (mediumScore >= 9) {
            System.out.println(mediumScore + " => Xuất sắc");
        }
        else if (mediumScore >= 8 && mediumScore < 9) {
            System.out.println(mediumScore + " => Giỏi");
        }
        else if (mediumScore >= 6.5 && mediumScore < 8) {
            System.out.println(mediumScore + " => Khá");
        }
        else if (mediumScore >= 5 && mediumScore < 6.5) {
            System.out.println(mediumScore + " => TB");
        }
        else if (mediumScore >= 0 && mediumScore <5) {
            System.out.println(mediumScore + "  => Học sinh Yếu");
        }
        else {
            System.out.println("Điểm không hợp lệ");
        }

    }
}
