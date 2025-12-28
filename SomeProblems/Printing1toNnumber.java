package SomeProblems;

public class Printing1toNnumber {
        public static void main(String[] args){

            int n = 10;
            printing1toNnumberHelper(n);
            System.out.println();
            printingNto1numberHelper(n);
        }

        public static void printing1toNnumberHelper(int n){
            if(n==0){
                return ;
            }
          
            printing1toNnumberHelper(n-1);
            System.out.print(n + " ");
        }

          public static void printingNto1numberHelper(int n){
            if(n==0){
                return ;
            }
           System.out.print(n + " ");
            printingNto1numberHelper(n-1);
           
        }

}
