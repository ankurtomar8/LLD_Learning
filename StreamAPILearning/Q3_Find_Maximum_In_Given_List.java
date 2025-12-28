package StreamAPILearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Q3_Find_Maximum_In_Given_List {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(-1,5,4,6,8,7,3,67,52);

        int maxElement = list.stream()
        .max(Integer::compare)
        .orElse(null);

        System.out.println("Max element: " + maxElement);

        int minElement = list.stream()
        .min(Integer::compare)
        .orElse(null);
        System.out.println("Min element: " + minElement);

    }
}
