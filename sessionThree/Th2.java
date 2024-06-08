//TH2- Tim vi tri ten input dung thu may trong mang

package sessionThree;

import java.util.Scanner;

public class Th2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] students={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        System.out.println("Input name you want to find");
        String inputName=sc.nextLine();
        boolean isExit=false;

    for(int i=0; i<students.length; i++){
    if(students[i].equals(inputName)){
        System.out.println("Ten nay nam o vi tri thu " + i +" trong list");
        isExit=true;
        break;
    }
    }
if(!isExit){
    System.out.println("Not found " + inputName + " in list");
}
    }
}
