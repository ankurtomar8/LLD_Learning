package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q23_Reverse_Each_String_In_List {
    public static void main(String[] s){

        List<String> listStr = Arrays.asList(
            "Java","aman","naman","nitin","kakkak","level"
            ,"HelloWorld","Hello"
        );

        List<String> reverseStr = listStr.stream()
        .map(word -> new StringBuilder(word).reverse().toString())
        .collect(Collectors.toList());
        
        System.out.println("Reverse String \n"+reverseStr);
        
        // Output 
        // Reverse String 
        // [avaJ, nama, naman, nitin, kakkak, level, dlroWolleH, olleH]

    }
}
