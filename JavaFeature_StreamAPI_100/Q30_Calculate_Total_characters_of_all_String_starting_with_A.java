package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q30_Calculate_Total_characters_of_all_String_starting_with_A {
    public static void main(String[] args){
        List<String> list =Arrays.asList("Apple","Banana","Apricot",
    "Avocado","Cherry","Afruit","A_Not");

    Map<Integer,List<String>> filteredList = list.stream()
    .filter(s -> s.startsWith("A"))
    .collect(Collectors.groupingBy(String::length));

    System.out.println("Filtered List "+filteredList);
     // Output    
     // Filtered List {5=[Apple, A_Not], 6=[Afruit], 7=[Apricot, Avocado]}


    }
}
