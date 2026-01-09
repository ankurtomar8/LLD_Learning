package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q16_Create_a_custom_collectors {
    public static void main(String[] s){

        List<String> list = Arrays.asList("Artficical","Intelligence",
            "Engineering","Learning");
    
         String joined = list.stream().collect(Collectors.joining("_"));
         System.out.println(joined);   

    }
}
