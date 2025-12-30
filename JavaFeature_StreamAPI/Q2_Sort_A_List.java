package JavaFeature_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q2_Sort_A_List {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(45,5,69,7,1,714,5,36,71,26,36,4,74,52);

        // Ascending Order 
        List<Integer> sortedListAsc = list.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());

       
         System.out.println("Sorted List  in natural order\n " +sortedListAsc);
         System.out.println("\n -------------------------- ");

        // Descending order

        List<Integer> sortedListDesc = list.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

         System.out.println("Sorted List  in Reverse order\n " +sortedListDesc);



    }
}
