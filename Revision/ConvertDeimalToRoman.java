package Revision;

import java.util.Scanner;

public class ConvertDeimalToRoman {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //mapping
        String[] symbols = {"L","X","IX","V","IV","I"};
        int[] value  = {40,10,9,5,4,1};

        StringBuilder strBuilder = new StringBuilder();
        if (num <= 0 || num > 50) {
            throw new IllegalArgumentException("Roman numerals only represent integers between 1 and 3999.");
        }
        for(int i = 0; i < value.length ; i++){
            while(num >=value[i]){
                strBuilder.append(symbols[i]);if (num <= 0 || num > 3999) {
            throw new IllegalArgumentException("Roman numerals only represent integers between 1 and 3999.");
        }
                 num -= value[i];   
            }

        }
    System.out.println(" "+strBuilder);
    }
    
}
