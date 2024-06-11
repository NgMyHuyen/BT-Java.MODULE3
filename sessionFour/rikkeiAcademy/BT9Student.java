package sessionFour.rikkeiAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class BT9Student {
     String gender, address, studentName;
     int age, phone, id;
     public static int nextId=1;

     public BT9Student(){}
     public BT9Student(String studentName,int age, String gender,int phone, String address){
        this.id=nextId++;
        this.studentName=studentName;
        this.age=age;
        this.gender=gender;
        this.phone=phone;
        this.address=address;
     }

    public int getId() { return id; }
    public int getAge() { return age; }
    public int getPhone() { return phone; }
    public String getStudentName() { return studentName; }
    public String getAddress() { return address; }
    public String getGender() { return gender; }

    public void setId(int id) { this.id = id; }
    public void setAge(int age) { this.age = age; }
    public void setPhone(int phone) { this.phone = phone; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setAddress(String address) { this.address = address; }
    public void setGender(String gender) { this.gender = gender; }

    Scanner scanner=new Scanner(System.in);
    public BT9Student inputData (){
        System.out.print("Nhập tên HS: ");
        this.studentName=scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age=Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập giới tính: ");
        this.gender=scanner.nextLine();

  System.out.print("Nhập số điện thoại HS: ");
  this.phone=Integer.parseInt(scanner.nextLine());

         System.out.print("Nhập địa chỉ: ");
         this.address=scanner.nextLine();
        return new BT9Student(studentName,age,gender,phone,address);
    }
    //  public void displayData() {
    //     System.out.println("ID HS: " + this.id);
    //     System.out.println("Tên HS: " + this.studentName);
    //     System.out.println("Tuổi: " + this.age);
    //     System.out.println("Giới tính: " + this.gender);
    //     System.out.println("Số điện thoại: " + this.phone);
    //     System.out.println("Địa chỉ: " + this.address);
    // }
    public void displayData() {
    if(!students.isEmpty()){
    for(BT9Student student : students) System.out.println(student);
    } else System.out.println("K co HS");
    }
    ArrayList<BT9Student> students=new ArrayList<>();

    public void addStudent(){
        System.out.println("Nhập thông tin cho HS mới: ");
        // BT9Student student=new BT9Student();
        BT9Student student=inputData();
        students.add(student);
    }

    public void delete(){System.out.println("Nhap id can xoa: ");
        int idDelete=Integer.parseInt(scanner.nextLine());
        // int index= students.indexOf(idDelete);
        for(int i=0; i<students.size(); i++){
            if(idDelete==students.get(i).getId()) students.remove(i);
            return;
        }
    }

    public void update(){System.out.println("Nhap id can sua thong tin: ");
        int idUpdate=Integer.parseInt(scanner.nextLine());
        // students.set(idUpdate, null);
        for(int i=0; i<students.size(); i++){
            if(idUpdate==students.get(i).getId()) {
                students.set(i, inputData());
                return;
            }else {System.out.println("Id not exist");}
        }
    }

    @Override
    public String toString(){
      return "Student {" +"studentId=" + id + ",studentName=" + studentName +", age="+age+ ",gender=" + gender + ", phone="+phone+ ", address=" + address+ "}";
    }
}


