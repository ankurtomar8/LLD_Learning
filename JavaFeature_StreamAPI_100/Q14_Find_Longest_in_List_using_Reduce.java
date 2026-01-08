package JavaFeature_StreamAPI_100;

import java.util.*;

public class Q14_Find_Longest_in_List_using_Reduce {
    public static void main(String[] s){
        List<String> listStr = Arrays.asList("Software","Hardware"
            ,"ManagerBkc","NewWordsEngineering"
        );

        // logic 
        // s1.length > s2 length 
        String longestStr = listStr.stream()
        .reduce((s1,s2) -> s1.length() > s2.length() ? s1:s2)
        .orElse("String is Empty");

        System.out.println(longestStr);
        // Output  NewWordsEngineering

    }
}
