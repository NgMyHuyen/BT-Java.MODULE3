//BT 10- C & S tam giac

package sessionTwo;

import java.util.Scanner;

public class Ex10Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
             System.out.println("Nhập cạnh a của tam giác: ");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh b của tam giác: ");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh c của tam giác: ");
            int c = scanner.nextInt();

            if(a<=0||b<=0||c<=0){
                System.out.println("3 canh phai lon hon 0 va tong 2 canh lon hon chieu dai canh con lai ");
            }else if(a>0 && b>0 && c>0){
                if(a+b>c && a+c>b && b+c>a){
                       System.out.println("Chu vi tam giác là: " + (a + b + c));
                        double p = (a + b + c) / 2;
                        System.out.println("Diện tích tam giác là: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                }else{  System.out.println("Đây không phải là tam giác.");}
            }
        }
       

            
    }
}
