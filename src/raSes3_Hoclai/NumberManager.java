package raSes3_Hoclai;

public class NumberManager {
    public static int[] arrayUnt = new int[10];
    public static int size = 0;

    public static void addNum(int num) {
        //logic them vao mang
        // neu mang full thi tang kich thuoc mang them 10
        if (size == arrayUnt.length) {
            //fulled thi tang kich thuoc len 10
            int[] newArray = new int[size + 10];
            //copy cac ptu mang cu sang mang moi
            for (int i = 0; i < arrayUnt.length; i++) {
                newArray[i] = arrayUnt[i];
            }
            //System.arraycopy(arrayUnt,0,newArray,0,arrayUnt.length);
            arrayUnt = newArray;
        }
        // arrayUnt[size++] = num;
        arrayUnt[size] = num;
        size++;
    }

    public static void removeNum(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        //  for(int i=index;i<arrayUnt.length;i++) {}
        for (int i = index; i < size - 1; i++) {
            arrayUnt[i] = arrayUnt[i + 1];
        }
//        arrayUnt[size-- -1]=0;
        arrayUnt[size - 1] = 0;
        size--;
    }

    public static void printArray() {
        for (int num:arrayUnt){
            System.out.print(num+" ");
        }
    }

    public static void updateNum(byte index, byte num){
        for (int i = index; i < size - 1; i++) {
            arrayUnt[i] = num;
        }
    }
    }

