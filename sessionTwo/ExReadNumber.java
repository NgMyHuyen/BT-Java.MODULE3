package sessionTwo;

import java.util.Scanner;

public class ExReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number");
        int number = Integer.parseInt(sc.nextLine());
        String result="";
        // String teen="teen";

        if(number >0 && number<=13){
            System.out.println(readNumber(number, true));

        }else if(number>=13 && number<=19){
            int donvi=number%10;
            System.out.println(readNumber(donvi, false) + "teen");

        }else if( number <100){
            int chuc=number/10;
            if(number%10==0){
                System.out.println(readNumber(chuc, false) + "ty");
            }else{
                int donvi=number%10;
                System.out.println(readNumber(chuc, false) + "ty" + readNumber(donvi, true));
            }



        }else if(number<1000){
            int tram=number/100;
            int chucdonvi=number%100;
            String text=readNumber(tram, true) + "hundred ";
            if(number%100!=0){
                text += "and ";

        if(chucdonvi >0 && chucdonvi<=13){
            text += readNumber(chucdonvi, true);

        }else if(chucdonvi>=13 && chucdonvi<=19){
            int donvi=chucdonvi%10;
            text += readNumber(donvi, false) + "teen";

        }else {
            int chuc=chucdonvi/10;
            if(chucdonvi%10==0){
                text += readNumber(chuc, false) + "ty";
            }else{
                int donvi=chucdonvi%10;
                text += readNumber(chuc, false) + "ty" + readNumber(donvi, true);
            }

        }
            }
            System.out.println(text);

        }else{System.out.println("Qua lon, khong the doc");}

        System.out.println(result);   
}

    public static String readNumber(int num, boolean check) {
        switch (num) {
            case 1:return "one";
            case 2:return check?"two":"Twen";
            case 3:return check?"three":"Thir";
            case 4:return "four";
            case 5:return check?"five":"Fif";
            case 6:return "six";
            case 7:return "seven";
            case 8:return "eight";
            case 9:return "nine";
            case 10:return "ten";
            case 11:return "eleven";

            default:
                return "";
        }
        }
}