package SomeProblems;

public class ReverseNumber {
    
         public static void main(String[] args){
        int n =  12345;
        reverseNumberHelper(n);
       
         }

    public static void reverseNumberHelper(int n){  
        if(n == 0){
            return ; 
        }
        int lastDigit = n % 10;
        System.out.print(lastDigit + " ");
        int reduce = n/10;
        reverseNumberHelper(reduce);
    }

}
