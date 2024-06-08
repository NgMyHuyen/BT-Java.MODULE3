// /*Xoa phan tu khoi mang */

// package sessionThree;

// import java.util.Scanner;

// public class Ex1DeleteNum {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);

//         System.out.println("The length of number list: ");
//         int size=input.nextInt();
//         int arr[]=new int[size];

//         for(int i=0; i<arr.length; i++){
//             System.out.println("Input number" + (i+1));
//             arr[i]=input.nextInt();
//         }

//        int n=size;
//        System.out.println("Before delete: ");
//        for(int i=0; i<n; i++){
//         System.out.println(arr[i] + " ");
//        }
       
//        System.out.println("Enter number to delete: ");
//        int x=input.nextInt();
//        n=delete(arr, n, x);
//        System.out.println("After delete: ");
//        for(int i=0; i<n; i++){
//         System.out.println(arr[i]+ " ");
//        }
//     }

//     static int delete(int arr[], int n, int key){
//         int pos=searchElement(arr, key);
//         if(pos==-1){
//             System.out.println("Not find out need to delete number");
//             return n;
//         }
//         for(int i=pos; i<n-1; i++){
//             arr[i]=arr[i+1];
//         }
//         return n-1;
//     }

//      static int searchElement(int[]arr, int x){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==x) {
//                 return i;
//             }
//         }
//         return -1;
//        }
// }
