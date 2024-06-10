package sessionThree;
import java.util.Scanner;

public class Ex7DiagonalLineSum {
    public static void main(String[] args) {
        int n;
        int sum=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the line of the array: ");
        n = scanner.nextInt();

        int array [][]= new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++){
                   System.out.print("array["+i+"]["+j+"]");
            array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++){
            System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}

