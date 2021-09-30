package sample_package;

public class BinarySearch {
    //10,11,12,13,14,15
    static int binarysearch(int arr[], int n, int k) {
        int mid = n / 2;
        if (arr[mid] == k) {
            return mid;
        }
        if (k < arr[mid]) {
            int[] newArr = provideArray(arr, 0, mid - 1);
          return   binarysearch(newArr, newArr.length, k);
        } else {
            int[] newArr = provideArray(arr, mid + 1, n);
          return   binarysearch(newArr, newArr.length, k);
        }
    }

    static int[] provideArray(int[] arr, int first, int last) {
        int size = last - first;
        int[] arr1 = new int[size + 1];
        for (int i = first; i <= last; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public static void main(String[] ar) {
        int[] arr = new int[]{12, 13, 14, 15, 16, 17, 18};
        int index = binarysearch(arr, arr.length, 18);
        System.out.print(index);
    }
}
