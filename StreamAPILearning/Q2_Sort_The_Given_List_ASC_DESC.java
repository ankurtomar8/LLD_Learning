package StreamAPILearning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q2_Sort_The_Given_List_ASC_DESC {
    
    public static void main(String[] args){
        
        List<Integer> list = Arrays.asList(1,22,3,44,5,67,7,8,9);

        List<Integer> ascSort = list.stream()
      //  .sorted()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
        System.out.println("Asc Sorted \n"+ascSort);

        List<Integer> descSort = list.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        System.out.println("Desc Sorted \n"+descSort);
        
        
    }

}
