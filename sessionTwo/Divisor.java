// TH3: Uoc so chung lon nhat

package sessionTwo;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a: ");
        int a = input.nextInt();
        
        System.out.println("Enter b: ");
        int b = input.nextInt();
        
        a = Math.abs(a);
        b = Math.abs(b);
        
        if (a==0&&b==0){
        System.out.println("No biggest divisor" );
        }
        
        // while (a != b ){
        // if(a>b){
        // a=a-b;
        // System.out.println("a=" + a);}
        
        // else {
        // b=b-a;
        // System.out.println("b=" + b);}
        // }
        
        int max=1;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0){
                max=i;
            }
        }
        System.out.println("The biggest divisor is: "+max);
        }  
    }
