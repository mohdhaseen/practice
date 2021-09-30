package sample_package;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       /* System.out.println(Solution.duplicates(new int[]{1, 0, 0, 3, 5, 2, 9, 4, 9, 5, 3, 3},12 ));

        Map<Integer,Integer> map= new HashMap<>();*/
      //System.out.println(SampleTest.sumofSAndL(new Integer[]{1,2,1,2,3,3,3,1}));
        System.out.println(Arrays.toString(SegregateEvenOdd.segregate(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 3, 3})));
    }
}
