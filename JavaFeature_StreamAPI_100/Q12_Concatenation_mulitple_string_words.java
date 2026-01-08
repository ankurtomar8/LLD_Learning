package JavaFeature_StreamAPI_100;

import java.util.*;

public class Q12_Concatenation_mulitple_string_words {
    public static void main(String[] args){
        List<String> strList = Arrays.asList(
            "Hi", "I am Ankur" , "Learning New to code","Do practice"
        );
        // Logic
        // s1 = s1+""+s2  
        // Writing lambda  (s1,s2) -> s1+s2

        String concatentatedStr = strList.stream()
        .reduce("",(s1,s2) -> s1+" "+s2).trim();

        System.out.println(concatentatedStr);
        // Output Hi I am Ankur Learning New to code Do practice

    }
}
