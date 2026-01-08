package JavaFeature_StreamAPI_100;

import java.util.*;

public class Q13_Find_the_longest_String_in_word {
    public static void main(String[] args){

        List<String> words = Arrays.asList("Software","Engineering", "BhaiBhai",
            "KyaHai"
        );

        String longestStr = words.stream()
        .max(Comparator.comparingInt(String::length))
        .orElse("List Empty");

        System.out.println("Max Length word: "+longestStr);
        // output  Max Length word: Engineering

    }
    
}
