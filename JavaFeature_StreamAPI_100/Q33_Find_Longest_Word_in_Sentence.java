package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.Comparator;

public class Q33_Find_Longest_Word_in_Sentence {
    public static void main(String[] args){
        String givenSentence = "I am Software Development Engineer";

        String result = Arrays.stream(givenSentence.split(" "))
        .max(Comparator.comparingInt(String::length))
        .orElse(null);

        System.out.println("Longest word in sentence: "+result);
        // Output
        // Longest word in sentence: Development


    }
}
