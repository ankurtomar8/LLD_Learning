package SomeProblems;

public class SumOfDigits_R {
    
    public static void main(String[] args){

        int n =  12345;
        int result = SumOfDigitsHelper(n);
        System.out.println(result);

    }

    public static int SumOfDigitsHelper(int n){  
        if(n == 0){
            return 0; 
        }
        int lastDigit = n % 10;
        int reduce = n/10;
        return lastDigit+SumOfDigitsHelper(reduce);
    }

}
