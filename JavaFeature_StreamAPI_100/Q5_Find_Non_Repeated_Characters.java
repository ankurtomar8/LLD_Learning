package JavaFeature_StreamAPI_100;

import java.util.Optional;

public class Q5_Find_Non_Repeated_Characters {
    public static void main(String[] args) {

        String str = "Bookkeeper";

        Optional<Character> firstNotRepeated = str.chars()
        .mapToObj(ch -> (char)ch)
        .filter(ch -> str.indexOf(ch)==str.lastIndexOf(ch))
        .findFirst();
        
        System.out.println("Last Non Repeating Chars \n:"+ firstNotRepeated);

    }
    
}
