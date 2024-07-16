package baithu;

public class SuperInJava {
    public static void main(String[] args) {
        Child child = new Child();
        child.display1();
        child.display2();
    }
}
class Parent{
    public String name = "bien lop cha";
    public String address = "Ha Noi";
    public Parent() {}
}

class Child extends Parent{
    public String name = "bien lop con";
    public Child(){}

    public void  display1(){
        System.out.println("Dung super goi bien name:" + super.name);
        System.out.println("K dung super:"+name);
    }
    public void display2(){
        System.out.println("Noi o:" + address);
    }
}