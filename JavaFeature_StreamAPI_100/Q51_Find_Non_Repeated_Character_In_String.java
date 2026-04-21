import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q51_Find_Non_Repeated_Character_In_String {
    public static void main(String[] args){

        String input = " java articles are awesome";

        Character result;

        result = input.chars()
        .mapToObj(c-> (char) c)
        .collect(Collectors.groupingBy(c->c,
            LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream()
            .filter(entry->entry.getValue()==1)
            .map(Map.Entry::getKey)
            .findFirst()
            .get();

            System.out.println("first non-repeated character : \n"+result);
            //Output first non-repeated character : 
            // j
    }
}
