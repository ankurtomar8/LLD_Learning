package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q21_Find_Nth_Largest_Element {
    public static void main(String[] s){
        List<Integer> list = Arrays.asList(
            10,20,30,40,60
        );

        // n == 3
        System.out.println("Original List \n"+list);

        Integer nthLargestNumber = list.stream()
        .sorted(Comparator.reverseOrder())
        .skip(2)
        .findFirst()
        .orElseThrow();

        System.out.println("Nth Largerst "+nthLargestNumber);
        // Original List 
        // Original List 
        // [10, 20, 30, 40, 60]
        //   Nth Largerst 30
          

    }
}
