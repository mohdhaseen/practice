package sample_package;

import java.util.Map;
import java.util.TreeMap;

public class SampleTest {
    static public int sumofSAndL(Integer[] arr) {
        int sum = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != null) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Map.Entry<Integer, Integer> smallest = map.pollFirstEntry();
        Map.Entry<Integer, Integer> largest = map.pollLastEntry();
        System.out.println("smallest: " + smallest.getKey() + "times: " + smallest.getValue());
        System.out.println("largest: " + largest.getKey() + "times:" + largest.getValue());
        sum = smallest.getValue() + largest.getValue();
        return sum;
    }
}
