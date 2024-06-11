package sessionFour;

import java.util.Scanner;

public class BT6Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter initial string:");
        String initialString = input.nextLine();
        
        BT6MyClass myObject = new BT6MyClass(initialString);

        System.out.println("First MyString: " + myObject.getMyString());
        
        System.out.println("Enter new string:");
        String newString = input.nextLine();
        myObject.setMyString(newString);
        System.out.println("MyString after change: " + myObject.getMyString());
    }
}
