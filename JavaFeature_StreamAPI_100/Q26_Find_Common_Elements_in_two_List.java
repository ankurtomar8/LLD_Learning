package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q26_Find_Common_Elements_in_two_List {
    public static void main(String[] s){

        List<Integer> listOne = Arrays.asList(
            1,2,3,4,5
        );

        List<Integer> listTwo = Arrays.asList(5,4,7,8,3);

        List<Integer> commonList = listOne.stream()
        .filter(listTwo::contains)
        .collect(Collectors.toList());

        System.out.println("Common Elements "+commonList);

        // Output  Common Elements [3, 4, 5]

    }
}
