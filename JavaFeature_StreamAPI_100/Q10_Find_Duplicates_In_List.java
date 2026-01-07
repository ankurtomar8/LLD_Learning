package JavaFeature_StreamAPI_100;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q10_Find_Duplicates_In_List {
    public static void main(String[] args){

        List<Integer> intList = Arrays.asList(
            1,2,3,7,1,4,2,3,4,8
            ,4,5,6,4,4,7,2,6,8,8
            ,1,7,5,6,7,2,39,9,9,9,7
        );

        List<String> duplicateStr = Arrays.asList(
            "abc","abb","abcd","abc","bac","abcd"
        );

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> setNew = intList.stream()
       .filter(n -> !uniqueElements.add(n))
        .collect(Collectors.toSet());

       System.out.println("Original List \n"+ intList);
       System.out.println("Duplcates Elements \n"+ setNew);

    // Original List 
    //[1, 2, 3, 7, 1, 4, 2, 3, 4, 8, 4, 5, 6, 4, 4, 7, 2, 6, 8, 8, 1, 7, 5, 6, 7, 2, 39, 9, 9, 9, 7]
    //Unique Elements 
        //[1, 2, 3, 4, 5, 6, 7, 8, 9]


         Set<String> uniqueStr = new HashSet<>();

        Set<String> setStrNew = duplicateStr.stream()
       .filter(n -> !uniqueStr.add(n))
        .collect(Collectors.toSet());

       System.out.println("Original List \n"+ uniqueStr);
       System.out.println("Duplicates Elements \n"+ setStrNew);

       //  Original List 
       //[abb, abc, bac, abcd]
       //Duplicates Elements 
       //[abc, abcd]


    }
    
}