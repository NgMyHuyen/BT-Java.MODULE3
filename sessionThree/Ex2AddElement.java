/* Them phan tu vao mang (them dc chu & so) */
// package sessionThree;

// import java.util.Scanner;

// public class Ex2AddElement{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter the initial size of the array: ");
//         int initialSize = input.nextInt();
//         int[] arr = new int[initialSize];
//         int currentSize = 0;

//         // Adding initial elements to the array
//         for (int i = 0; i < initialSize; i++) {
//             System.out.println("Enter element " + (i + 1) + ": ");
//             arr[i] = input.nextInt();
//             currentSize++;
//         }

//         System.out.println("Array before adding: ");
//         printArray(arr, currentSize);

//         // Prompting user to add more elements
//         System.out.println("Do you want to add more elements? (yes/no)");
//         String response = input.next();
//         while ("yes".equals(response)) {
//             // Check if the array is full
//             if (currentSize == arr.length) {
//                 // Create a new array with double the size
//                 int[] newArr = new int[arr.length +1];
//                 // Copy elements from the old array to the new array
//                 for (int i = 0; i < arr.length; i++) {
//                     newArr[i] = arr[i];
//                 }
//                 arr = newArr;
//             }

//             System.out.println("Enter the element to add: ");
//             arr[currentSize] = input.nextInt();
//             currentSize++;

//             System.out.println("Do you want to add more elements? (yes/no)");
//             response = input.next();
//         }

//         System.out.println("Array after adding: ");
//         printArray(arr, currentSize);
//     }

//     private static void printArray(int[] arr, int size) {
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }



// import java.util.Scanner;
// public class Ex2AddElement {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.println("Độ dài của mảng: ");
//         int size = input.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("Nhập số " + (i + 1));
//             int element = input.nextInt();
//             arr[i] = element;
//         }

//         System.out.println("Trước khi thêm: ");
//         for (int i = 0; i < size; i++) {
//             System.out.println(arr[i] + " ");
//         }

//         System.out.println("Nhập phần tử cần thêm (số/chữ cái): ");
//         int newElement = input.nextInt();
//         arr = addElement(arr, size, newElement);
//         size++;

//         System.out.println("Sau khi thêm: ");
//         for (int i = 0; i < size; i++) {
//             System.out.println(arr[i] + " ");
//         }
//     }

//     private static int[] addElement(int[] arr, int size, int element) {
//         int[] newArray = new int[size + 1];
//         System.arraycopy(arr, 0, newArray, 0, size);
//         newArray[size] = element;
//         return newArray;
//     }
// }

