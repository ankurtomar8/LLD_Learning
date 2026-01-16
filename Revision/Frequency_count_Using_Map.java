package Revision;

import java.util.HashMap;
import java.util.Map;

public class Frequency_count_Using_Map {
    public static void main(String[] args){

        String str = "banana";

        Map<Character,Integer> freqMap = new HashMap<>();

        for(Character ch : str.toCharArray()){
            if(freqMap.containsKey(ch)){

                freqMap.put(ch,freqMap.get(ch)+1);

            }else{
                freqMap.put(ch, 1);
            }
        }
        System.out.println(freqMap);

        char[] array = {'a','a','b','c','d','e','g','e','f','r','r','c'};
        Map<Character,Integer> freqMapNew = new HashMap<>();

        for(Character ch : array){
            if(freqMapNew.containsKey(ch)){

                freqMapNew.put(ch,freqMapNew.get(ch)+1);

            }else{
                freqMapNew.put(ch, 1);
            }
        }
        System.out.println(freqMapNew);
        // {a=2, b=1, r=2, c=2, d=1, e=2, f=1, g=1}
    }
}
