
package session16.sort;

import java.util.Arrays;
import java.util.Comparator;


public class Sorting {
    public static void bubbleSort(int[] arr){
        // tối ưu thuật toán
        boolean isNext = true;
        for(int i=0; i< arr.length-1 && isNext; i++){ // duyệt đến phần tử gần cuối
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< arr.length-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
                if (arr[j] > arr[j+1]){
                    // đổi vị trí 2 phần tử
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isNext = true; // nếu như có sự đổi chỗ 2 phâ ử thì mảng vẫn cần được sắp xếp
                }
            }
        }
    }
    public static <T extends Comparable<T>> void bubbleSort2(T[] arr){
        boolean isNext = true;

        for(int i=0; i< arr.length-1 && isNext; i++){
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< arr.length-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
                if (arr[j].compareTo(arr[j+1]) >0){
                    // đổi vị trí 2 phần tử
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isNext = true; // nếu như có sự đổi chỗ 2 phânf tử thì mảng vẫn cần được sắp xếp
                }
            }
        }
    }
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator){
        boolean isNext = true;
        for(int i=0; i< arr.length-1 && isNext; i++){
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< arr.length-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
                if (comparator.compare(arr[j], arr[j+1])>0){
                    // đổi vị trí 2 phần tử
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isNext = true; // nếu như có sự đổi chỗ 2 phâ ử thì mảng vẫn cần được sắp xếp
                }
            }
        }
    }


    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int indexInsert = i;
            for (int k = i - 1; k >= 0 && currentValue < arr[k]; k--) {
                arr[k + 1] = arr[k];
                indexInsert = k;
            }
            arr[indexInsert] = currentValue;
        }
    }


    public static void main(String[] args){
//        int[] arr = {1,9,3,8,5,2,7};
//        insertSort(arr);
//        System.out.println(Arrays.toString(arr));
        Person[] people = {new Person(1,"Lan"),new Person(2,"mai"),new Person(3,"trung")};
        selectionSort(people,(o1, o2) -> o2.getId()-o1.getId());
        System.out.println(Arrays.toString(people));

        selectionSort(people,Comparator.comparing(Person::getName));
        System.out.println(Arrays.toString(people));

        Integer [] numbers={1,45,3,6,2,8,4,9};
        bubbleSort2(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}