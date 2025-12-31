package JavaFeature_StreamAPI_100;

import java.util.*;
import java.util.stream.Collectors;

public class Q1_EvenOdd {
    public static void main(String[] args){


     List<Integer> list = Arrays.asList(1,2,3,4,5,6,9,10,12,14,16,17,19,21,22,24);

     // Even List
     List<Integer> evenList = list.stream()
     .filter(n -> n % 2 == 0)
     .collect(Collectors.toList());
    
     System.out.println("Even List "+evenList);

    // Odd list
    List<Integer> oddList = list.stream()
    .filter(n -> n % 2 != 0)
    .collect(Collectors.toList());

     System.out.println("odd List "+oddList);
    

    }

}
