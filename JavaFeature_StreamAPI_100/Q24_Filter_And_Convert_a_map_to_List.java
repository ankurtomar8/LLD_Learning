package JavaFeature_StreamAPI_100;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q24_Filter_And_Convert_a_map_to_List {
    public static void main(String[] s){
       
          Map<String ,Integer> map=Map.of("Z",26,"A", 
        55, "B", 5, "C", 20, "D", 10);  

        List<String> myKeys = map.entrySet()
        .stream()
        .filter(entry -> entry.getValue() > 10)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
         System.out.println(myKeys);
        
         // Output 
         // [Z, C, A]

    }
}
