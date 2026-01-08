package JavaFeature_StreamAPI_100;

import java.util.Map;
import java.util.stream.Collectors;

public class Q15_Count_the_frequencyof_character_a_String {

    public static void main(String[] args){

        String inputWord = "Bookkeeeper";

        Map<Character,Long> frequencyMap = inputWord.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(frequencyMap+"\n");
        

    }
    
}
