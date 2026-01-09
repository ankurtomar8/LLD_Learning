package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q19_Convert_List_of_Strings_Into_Map {
    public static void main(String[] s){

          //Convert a List of Strings to a Map and use string length as value

         List<String> words=Arrays.asList("Software","Java","Collection",
        "Learning","Stream");

        Map<String,Integer> map = words.stream()
        .collect(Collectors.toMap(word->word,String::length));

        System.out.print(" Map : \n "+map);

    }
}
