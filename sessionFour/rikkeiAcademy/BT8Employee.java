package sessionFour.rikkeiAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class BT8Employee {
    private int age, employeeId;
    private double rate, salary;
    private String employeeName, gender;

    public BT8Employee(){};
    public BT8Employee(int employeeId,String employeeName,int age,  String gender, double rate ){
        this.employeeId=employeeId;
        this.age=age;
        this.employeeName=employeeName;
        this.gender=gender;
        this.rate=rate;
        
    }

    public int getAge(){
        return age;
    }
     public int getEmployeeId(){
        return employeeId;
    }
     public double getRate(){
        return rate;
    }
     public double getSalary(){
        return salary;
    }
     public String getEmployeeName(){
        return employeeName;
    }
     public String getGender(){
        return gender;
    }

    public void setAge(int age){
        this.age=age;
    }
      public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
      public void setRate(double rate){
        this.rate=rate;
    }
      public void setSalary(double salary){
        this.salary=salary;
    }
      public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
      public void setGender(String gender){
        this.gender=gender;
    }

      public BT8Employee inputData(Scanner scanner) {

        System.out.print("Nhập mã nhân viên: ");
        int employeeId = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên nhân viên: ");
        String employeeName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập giới tính: ");
        String gender =  scanner.nextLine();

        System.out.print("Nhập hệ số lương: ");
        double rate = Double.parseDouble(scanner.nextLine());
      
        return new BT8Employee(employeeId,employeeName,age,gender,rate);
    }

      public void calSalary(double salary) {
         salary = rate * 1300000;
    }

    // Khoi tao mang
    // BT8Employee [] employees = new BT8Employee[5]; 
    // method create employee
    // public void addEmployee(Scanner scanner){
    //     System.out.println("Nhập thông tin cho nhân viên moi") ;
    //         BT8Employee employee = inputData(scanner);
    //         BT8Employee[] employees2 = new BT8Employee[6]; 

    //         for(int i=0; i<employees2.length; i++){              
    //             employees2[employees2.length-1] = employee;
    //         System.out.println(employees2[i]);

    //         }
    //     //       for(int i = 0; i< employees.length;i++){
    //     //     System.out.println(employees[i]);
    //     // }
    // } 

      // Khoi tao mang
    ArrayList<BT8Employee >employees = new ArrayList<>(); 
    // method create employee
    public void addEmployee(Scanner scanner){
        System.out.println("Nhập thông tin cho nhân viên moi:") ;
            BT8Employee employee = inputData(scanner);
            employees.add(employee);
    } 

    public void displayData(){
        // for(int i = 0; i < employees.size();i++){
        //     System.out.println(employees.get(i));
        // }
        for(BT8Employee employee : employees ){
            System.out.println(employee);
        }
    }

    public void removeEmployee(Scanner scanner){
        System.out.println("Nhap id can xoa:");
        int idDelete = Integer.parseInt(scanner.nextLine()); // 255
        // int index  = employees.indexOf(idDelete);
        for(int i = 0 ; i < employees.size();i++){
            if(idDelete == employees.get(i).getEmployeeId()) employees.remove(i);
        }
        // employees.remove(index);
    }

      public String toString(){
        return employeeId + " " + employeeName + " " + age+ " " +gender+ " " +rate;
    }
}
