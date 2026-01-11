package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;

public class Q27_Calculate_the_sum_of_Squares_of_Even_Odd_Number {
    public static void main(String[] s){
        List<Integer> list = Arrays.asList(
            1,2,3,4,5,6
        );

        Integer evenSum = list.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(n -> n*n)
        .sum();

        System.out.println("sum of Squares of Even Number : \n" +evenSum);
        // Output:sum of Squares of Even Number : 56
        
        Integer oddSum = list.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n*n)
        .sum();

        System.out.println("sum of Squares of Odd Number : \n" +oddSum);
        // Output sum of Squares of Odd Number : 35
    }
}
