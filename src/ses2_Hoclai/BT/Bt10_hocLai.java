package ses2_Hoclai.BT;

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Bt10_hocLai {
//    public static Integer getInt(){
//        while(true){
//            try{
//                return getScanner().nextInt();
//            }catch (InputMismatchException e){
//                System.out.println("Enter an integer");
//            }
//        }
//    }
//
//    private static Scanner getScanner() {
//        return new Scanner(System.in);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter an integer");
//        int n = getInt();
//    }
//}


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bt10_hocLai {

    public static class DataEntry {
        private Scanner scanner;

        public DataEntry() {
            scanner = new Scanner(System.in);
        }

        public int getInt(String prompt) {
            while (true) {
                try {
                    System.out.print(prompt);
                    return scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Enter an integer.");
                    scanner.next();
                }
            }
        }

        public double getDouble(String prompt) {
            while (true) {
                try {
                    System.out.print(prompt);
                    return scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Enter a double.");
                    scanner.next();
                }
            }
        }

        public boolean getBoolean(String prompt) {
            while (true) {
                try {
                    System.out.print(prompt + " (true/false): ");
                    return scanner.nextBoolean();
                } catch (InputMismatchException e) {
                    System.out.println("Enter true or false.");
                    scanner.next();
                }
            }
        }

        public LocalDate getLocalDate(String prompt) {
            while (true) {
                try {
                    System.out.print(prompt + " (yyyy-MM-dd): ");
                    String input = scanner.next();
                    return LocalDate.parse(input);
                } catch (DateTimeParseException e) {
                    System.out.println("Enter a date in the format yyyy-MM-dd.");
                }
            }
        }
    }

    public static void main(String[] args) {
        DataEntry dataEntry = new DataEntry();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Enter an integer");
        System.out.println("2. Enter a double");
        System.out.println("3. Enter a boolean");
        System.out.println("4. Enter a date");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int intValue = dataEntry.getInt("Enter an integer: ");
                System.out.println("Integer: " + intValue);
                break;
            case 2:
                double doubleValue = dataEntry.getDouble("Enter a double: ");
                System.out.println("Double: " + doubleValue);
                break;
            case 3:
                boolean booleanValue = dataEntry.getBoolean("Enter a boolean: ");
                System.out.println("Boolean: " + booleanValue);
                break;
            case 4:
                LocalDate localDateValue = dataEntry.getLocalDate("Enter a date (yyyy-MM-dd): ");
                System.out.println("Date: " + localDateValue);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
