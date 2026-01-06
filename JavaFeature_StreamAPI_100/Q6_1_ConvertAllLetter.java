package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6_1_ConvertAllLetter {
          public static void main(String[] args) {

       List<String> words = Arrays.asList("Software","Hardware","Code","Learner");

       List<String> toLowerCase = words.stream()
       .map(String::toLowerCase)
       .collect(Collectors.toList());

       System.out.println("List : \n"+toLowerCase);
       //Output 
       // List :
       //  [software, hardware, code, learner]

        List<String> toString = words.stream()
       .map(String::toString)
       .collect(Collectors.toList());

       System.out.println("List : \n"+toString);

    }

}
