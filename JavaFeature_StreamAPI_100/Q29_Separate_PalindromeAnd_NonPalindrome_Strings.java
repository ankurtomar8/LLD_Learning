package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q29_Separate_PalindromeAnd_NonPalindrome_Strings {
    public static void main(String[] s){
        List<String> listStr = Arrays.asList(
            "naman","aman","nitin"
        ,"jatin","level","travel"
        );

        Map<Boolean,List<String>> separateVariable = listStr.stream()
        .collect(Collectors.partitioningBy(
            n -> n.equals(new StringBuilder(n).reverse().toString()
        )));
        System.out.println("Separated palindromes are : \n "+separateVariable);

        // Output Separated palindromes are : 
        // {false=[aman, jatin, travel], true=[naman, nitin, level]}
        
    }
}
