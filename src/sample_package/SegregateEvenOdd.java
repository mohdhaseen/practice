package sample_package;

public class SegregateEvenOdd {
    public static Integer[] segregate(Integer[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++) {
            while (arr[i] % 2 == 0 && i < j) {
                i++;
            }
            while (arr[j] % 2 == 1 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }
}
