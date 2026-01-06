package JavaFeature_StreamAPI_100;

import java.util.stream.Collectors;
import java.util.*;

public class Q6_ConvertAllLettertoUpperCase {
    
     public static void main(String[] args) {

       List<String> words = Arrays.asList("Software","Hardware","Code","Learner");

       List<String> toUpperCase = words.stream()
       .map(String::toUpperCase)
       .collect(Collectors.toList());

       System.out.println("List : \n"+toUpperCase);
       
       // Output 
       // List : [SOFTWARE, HARDWARE, CODE, LEARNER]


    }


}
