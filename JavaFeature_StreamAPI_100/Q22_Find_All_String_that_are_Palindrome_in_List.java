package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q22_Find_All_String_that_are_Palindrome_in_List {
    public static void main(String[] s){

        List<String> listStr = Arrays.asList(
            "Java","aman","naman","nitin","kakkak","level"
            ,"HelloWorld","Hello"
        );
         System.out.println("List Strings are "+listStr);

        List<String> palindromeList = listStr.stream()
        .filter(
            word -> word.equals( 
                new StringBuilder(word).reverse().toString())
        ).collect(Collectors.toList());

        System.out.println("Palindrome Strings are "+palindromeList);
        //output
        // List Strings are [Java, aman, naman, nitin, kakkak, level]
        // Palindrome Strings are [naman, nitin, kakkak, level]

    }
}
