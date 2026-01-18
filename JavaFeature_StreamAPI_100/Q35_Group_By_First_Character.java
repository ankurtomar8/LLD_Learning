package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q35_Group_By_First_Character {

    public static void main(String[] args){
    List<String> fruits = Arrays.asList(
        "apple","avocado",
        "blueberry","banana","cherry","chiku","notAFruit","afruit"
    );

    Map<Character,List<String>> mapResult = fruits.stream()
    .collect(Collectors.groupingBy(word -> word.charAt(0)));

    System.out.print("Filtered List is : "+ mapResult );
    // Output
    // Filtered List is : {a=[apple, avocado, afruit], b=[blueberry, banana], c=[cherry, chiku], n=[notAFruit]}
    
    }
}
