package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q11_Find_Count_Frequency {
    public static void main(String[] args){

         List<Integer> intList = Arrays.asList(
            1,2,3,7,1,4,2,3,4,8
            ,4,5,6,4,4,7,2,6,8,8
            ,1,7,5,6,7,2,39,9,9,9,7
        );

        Map<Integer,Long> frequencyMap = intList.stream()
        .collect(Collectors.groupingBy(n -> n,Collectors.counting())
        );

        System.out.println("Frequency of Integers: ");
        frequencyMap.forEach((num, count) -> 
          System.out.println(num + " : " + count + " times"));

    }
}
