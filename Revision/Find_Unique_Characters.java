package Revision;

import java.util.HashSet;
import java.util.Set;

public class Find_Unique_Characters {
    public static void main(String[] args){

        char[] array = {'a','a','b','c','d','e','g','e','f','r','r','c'};

        Set<Character> checkChar = new HashSet<>();
        Set<Character> uniqueSet = new HashSet<>();

        for(Character ch : array){
            if(checkChar.add(ch)){
                uniqueSet.add(ch);
            }
        }
        System.out.println(uniqueSet);

    }
}
