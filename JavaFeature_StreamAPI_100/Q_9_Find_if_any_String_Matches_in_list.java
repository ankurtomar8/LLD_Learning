package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Q_9_Find_if_any_String_Matches_in_list {
    public static void main(String[] args){

        List<String> listStr = Arrays.asList
        ("API","LearningNewAPI","NeedtodevepNewAPI","whatiswhat");

        List<String> match = listStr.stream()
        .filter(s -> s.contains("API"))
        .collect(Collectors.toList());
        System.out.print(match);

        String convert =  String.join(" ",match);
        System.out.print(" : \n"+convert);

        // Output  API, LearningNewAPI, NeedtodevepNewAPI


    }
}
