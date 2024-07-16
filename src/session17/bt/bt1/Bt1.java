
package session17.bt.bt1;

import session17.Exception.CheckedException;

import java.util.Scanner;

public class Bt1 {


    public static void main(String[] args) throws CheckedException {
        Scanner sc = new Scanner(System.in);
        int num1=0;
        int num2=0;
        boolean isCheck=true;
        while(isCheck){
            try{
                System.out.println("Num1: ");
                num1=Integer.parseInt(sc.nextLine());
                isCheck=false;

            }catch(NumberFormatException e){
                System.out.println(e.getMessage());;
            }
        }

        boolean isCheck2=true;
        while(isCheck2){
            try{
                System.out.println("Num2: ");
                num2=Integer.parseInt(sc.nextLine());
                isCheck2=false;

            }catch(Exception e){
                System.out.println(e.getMessage());;
            }
        }
        int sum=num1+num2;
        System.out.println("Sum: "+sum);
    }
}