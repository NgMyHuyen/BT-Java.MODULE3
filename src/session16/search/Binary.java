package session16.search;

public class Binary {

    public int BinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (start - end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] arr, int key, int start, int end) {
        if (start <= end) {
            int mid = start + (start - end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                // mangr been tay trais
                return binarySearchRecursive(arr, key, start, mid - 1);
            }
            return binarySearchRecursive(arr, key, mid + 1, end);
        }
        return -1;
    }
}