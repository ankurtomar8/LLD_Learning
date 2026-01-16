package Revision;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicates_Elements {
 
    public static void main(String[] args){
    
    char[] array = {'a','a','b','c','d','e','g','g','e','f','r','r','c'};

     Set<Character> checkSet  = new HashSet<>();
     Set<Character> duplicateSet  = new HashSet<>();

     for(Character ch : array){
        if(checkSet.contains(ch)){
            duplicateSet.add(ch);
        }else{
            checkSet.add(ch);
        }
     }
     System.out.println(duplicateSet);
 // [a, r, c, e, g]


    }
    
}
