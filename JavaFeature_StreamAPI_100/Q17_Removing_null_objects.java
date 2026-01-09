package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Q17_Removing_null_objects {
    
    public static void main(String[] s){

        List<String> words = Arrays.asList(
            "Java",null,null,"collection",null,
            "learning",null,"is",null,"fun"
        );

        List<String> newWordList = words.stream()
        .filter(Objects::nonNull)
        .collect(Collectors.toList());
        System.out.println(newWordList );

    }
}
