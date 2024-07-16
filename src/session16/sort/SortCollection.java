package session16.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class SortCollection {
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
    public static <T extends Comparable<T>> void bubbleSort2(List<T> list){
        boolean isNext = true;
        for(int i=0; i< list.size()-1 && isNext; i++){
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< list.size()-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
//                if (list[j].compareTo(list[j+1]) >0){
//                    // đổi vị trí 2 phần tử
//                    T temp = list[j];
//                    list[j] = list[j+1];
//                    list[j+1] = temp;
//                    isNext = true; // nếu như có sự đổi chỗ 2 phânf tử thì mảng vẫn cần được sắp xếp
                if(list.get(j).compareTo(list.get(j+1))>0){
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    isNext = true;
                }
            }
        }
    }

    public static <T> void selectionSort(List<T> list, Comparator<T> comparator){
        boolean isNext = true;
        for(int i=0; i< list.size()-1 && isNext; i++){
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< list.size()-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
//                if (comparator.compare(list[j], list[j+1])>0){
//                    // đổi vị trí 2 phần tử
//                    T temp = list[j];
//                    list[j] = list[j+1];
//                    list[j+1] = temp;
//                    isNext = true; // nếu như có sự đổi chỗ 2 phâ ử thì mảng vẫn cần được sắp xếp
                if(comparator.compare(list.get(j), list.get(j+1))>0){
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    isNext = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person(1, "Lan"));
        peopleList.add(new Person(2, "Mai"));
        peopleList.add(new Person(3, "Trung"));

        selectionSort(peopleList, Comparator.comparing(Person::getName));
        System.out.println(peopleList);

        selectionSort(peopleList, (o1,o2)->o2.getId()-o1.getId());
        System.out.println(peopleList);
    }
}