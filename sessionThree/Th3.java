//TH3: so lon nhat

package sessionThree;

import java.util.Scanner;

public class Th3 {
    public static void main(String[] args) {
        
    System.out.println("Enter a size");
    Scanner input=new Scanner(System.in);
    int size= input.nextInt();

    if(size>20){
        System.out.println("Size should not exceed 20");
    }while (size>20);

    int [] array=new int[size];

for(int i=0; i<array.length; i++){
    System.out.println("Enter element " + (i+1) + ":");
        array[i]=input.nextInt();
}
System.out.println("Property list:");
for(int j=0; j<array.length; j++){
    System.out.print(array[j] + "\t");
}

int max=array[0];
int index=1;
for(int j=0; j<array.length; j++){
    if(array[j]>max){
        max=array[j];
        index=j+1;
    }
}
System.out.println("The largest property value in the list is " + max + ", at position " + index);
    }
}
