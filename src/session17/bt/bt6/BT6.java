package session17.bt.bt6;
import session17.bt.bt1.CheckedException;

import java.io.IOException;
import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double result=0.0;
        int numerator = extracted(sc, 1);
        int denominator= extracted(sc, 2);
        try{
            if(isDenominator(denominator)) result=(double)numerator/denominator;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }

    public static boolean isDenominator(int num) throws CheckedException {
        if(num==0) throw new CheckedException("Denominator != zero");
        return true;
    }

    public static int extracted(Scanner sc, int index) {
        int num=0 ;
        boolean isCheck=true;
        while (isCheck) {
            try{
                System.out.println("Input num" + index + ": ");
                num = Integer.parseInt(sc.nextLine());
                isCheck=false;
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return num;
    }
}
