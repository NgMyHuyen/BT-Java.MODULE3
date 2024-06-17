package Ses8_ThBt.TH7.rikkei.academy;

public class Student { private String name;
    private int rollNo;
    private static String college="BBDIT";

    Student(int r, String n){
        rollNo=r;
        name=n;
    }

    static void change(){
        college="RIKKEI";
    }
    void display(){
        System.out.println("rollNo: "+""+name+""+college);
    }
}
