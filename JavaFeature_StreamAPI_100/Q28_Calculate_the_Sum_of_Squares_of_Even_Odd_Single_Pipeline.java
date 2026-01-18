package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q28_Calculate_the_Sum_of_Squares_of_Even_Odd_Single_Pipeline {
    
    public static void main(String[] s){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);

        Map<Boolean,Integer> separated_sum = list.stream()
        .collect(Collectors.partitioningBy(
            n -> n % 2==0,
            Collectors.summingInt(n-> n*n)
        ));
          System.out.println("Even Odd "+separated_sum);
          System.out.println("Even Sum : "+separated_sum.get(true));
          System.out.println("Odd Sum : "+separated_sum.get(false));
// Output
// Even Odd {false=35, true=56}
// Even Sum : 56
// Odd Sum : 35
    }

}
