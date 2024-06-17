package Ses8_ThBt.TH5.rikkei.academy;

public class MainTH5 {
    public static void main(String[] args) {
        System.out.println("Name: " + StaticMethod.name);
        System.out.println("Age: " + StaticMethod.age);

        StaticMethod.showInfo();
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("Name2: " + staticMethod.name);
        System.out.println("Age2: " + staticMethod.age);
        staticMethod.showInfo();
    }
}