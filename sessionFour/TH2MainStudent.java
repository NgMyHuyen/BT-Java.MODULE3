package sessionFour;

import java.util.Scanner;

public class TH2MainStudent {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        
    System.out.print("Input student ID: ");
    String studentId=input.nextLine();
    System.out.print("Input student name: ");
    String studentName=input.nextLine();
    System.out.print("Input student sexual: ");
    String sex=input.nextLine();
     TH2Student student= new TH2Student(studentId, studentName, sex );
    System.out.println("Student's information: \n" + student.display());
    }
    }
    

