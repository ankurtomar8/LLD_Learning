package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q34_Calculate_Cartesian_Product_of__Two_list {
    public static void main(String[] args){
       
    // Cartesian Product of two Lists
    // Cartesian product -- multiply everything from list 1 to list 2
   
        List<Integer> list1=Arrays.asList(1,2,3);
        List<Integer> list2=Arrays.asList(1,2,3);

        List<String> cartesianProduct = list1.stream()
        .flatMap(
            i -> list2.stream().map(
                j -> "("+i+","+j+")"))

            .collect(Collectors.toList());
     System.out.print("Cartesian Product is : \n "+cartesianProduct);

     //Output 
     // Cartesian Product is : 
     // [(1,1), (1,2), (1,3), (2,1), (2,2), (2,3), (3,1), (3,2), (3,3)]

    }
    
}
