package Revision;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {
    
    public static void main(String[] args){

        String name = "Hi I am bad developer";

        List<String> convertStr = Arrays.asList(name.split(" "));

        // Join 
        Collections.reverse(convertStr);

        String reverseStr = String.join(" ",convertStr);
        System.out.print(reverseStr);

    }

}
