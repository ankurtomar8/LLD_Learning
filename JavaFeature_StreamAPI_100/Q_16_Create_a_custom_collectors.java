package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_16_Create_a_custom_collectors {
    public static void main(String[] s){

           List<String> list = Arrays.asList("Artificial", "Intelligence", 
        "Engineering", "Learning");

        String joined = list.stream().collect(Collectors.joining(" "));
        System.out.println("String joined using : \n"+joined);
    
    }
    
}
