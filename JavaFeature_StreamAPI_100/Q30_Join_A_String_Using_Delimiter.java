package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q30_Join_A_String_Using_Delimiter {
    public static void main(String[] args){
        List<String> listStr = Arrays.asList(
            "user","local","bin"
        );

        String joined = listStr.stream()
        .collect(Collectors.joining("-"));

        System.out.println("Joined String is : \n "+joined);
        //Output 
        // Joined String is : 
        //  user-local-bin

    }
}
