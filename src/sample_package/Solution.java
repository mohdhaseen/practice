package sample_package;

import java.util.*;

public class Solution {
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        // code here
        int[] result = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int oldCount;
        for (int j : arr) {
            oldCount = result[j];
            result[j] = oldCount + 1;
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 1) {
                arrayList.add(i);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(-1);
        }

        return arrayList;
       /* ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[arr[i]%n]+=n;
        }
        for(int i=0;i<n;i++){
            if(arr[i]/n >1){
                result.add(i);
            }
        }

        if(result.isEmpty()){
            result.add(-1);
        }
        return result;*/
    }
}