package sessionFour;

public class TH2Student {
    String studentId, studentName,sex, className, addrress;
    int age;

      public TH2Student(String studentId, String studentName, String sex){
    this.sex=sex;
    this.studentName=studentName;
    this.studentId=studentId;

    }
    
    public String display(){
    return "Student {" +"studentId=" + studentId + ",studentName=" + studentName + ",sex=" + sex +"}";
    }
}
