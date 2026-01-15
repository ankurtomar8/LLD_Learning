import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem {
    
    public static void main(String[] args){

        // c,d,e,o,d,c,o,e,d,c,d,e,o,o,c,d
        char[] array = {'c','d','e','o','d','c'
        ,'o','e','d','c','d','e','o','o','c','d'};

        // how many time code made uniquely 

        // c o d e

        // globally can you do it ??  // HashSet 

        //Map<Character,Integer> intList = new HashMap<>();

       List<Character> intList = Arrays.asList('c','d','e','o','d','c'
        ,'o','e','d','c','d','e','o','o','c','d');

        //     List<Integer> intList = Arrays.asList(
        //     1,2,3,7,1,4,2,3,4,8
        //     ,4,5,6,4,4,7,2,6,8,8
        //     ,1,7,5,6,7,2,39,9,9,9,7
        // );

        Map<Character,Long> frequencyMap = intList.stream()
        .collect(Collectors.groupingBy(n -> n,Collectors.counting())
        );
        System.out.println("Frequency of Characters: ");
        frequencyMap.forEach((num, count) -> 
          System.out.println(num + " : " + count + " times"));
    
        
    }
}
