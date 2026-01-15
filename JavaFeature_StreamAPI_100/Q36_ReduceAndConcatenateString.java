package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;

public class Q36_ReduceAndConcatenateString {
    public static void main(String[] args){

        List<String> myString = Arrays.asList(
            "?","I","am","Software","Engineer"
        );

        String resultString = myString.stream()
        .reduce((w1,w2) -> w2 + " "+w1)
        .orElse("");

        System.out.println("Reverse and Concatenated "+resultString);
        // output
        // Reverse and Concatenated Engineer Software am I ?

    }
    
}
