package RevisionMorning;

import java.util.HashMap;
import java.util.Map;

public class Find_Frequency_of_characters_in_Character_Array {
    public static void main(String[] args){

        char[] array = {'z','z','z','z','b','b','b','b',
            'e','e','e','e','n','n'
        };

        Map<Character,Integer> freqMap = new HashMap<>();

        for(Character ch : array){
            if(freqMap.containsKey(ch)){
                freqMap.put(ch, freqMap.get(ch)+1);
        }else{
            freqMap.put(ch, 1);
        }

    }
    System.out.println(freqMap);
    // {b=4, e=4, z=4, n=2}
    }
}
