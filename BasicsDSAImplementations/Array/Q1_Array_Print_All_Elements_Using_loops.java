package BasicsDSAImplementations.Array;

public class Q1_Array_Print_All_Elements_Using_loops {
    public static void main(String[] args){
        // Q1 Array Print All array elements 

        char[] charArray = {'a','b','c','d','e','f','g','e','h','i'
            ,'z','y','x','w'
        }; 

        for(int i=0; i<charArray.length; i++){
            System.out.print(" "+charArray[i]); // a b c d e f g e h i z y x w
        }

        System.out.println("");
         for(char variable: charArray){
            System.out.print(variable +" "); // a b c d e f g e h i z y x w 
         }

        System.out.println("\n");
        int[] intArray = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1};
         for(int i=0; i<intArray.length; i++){
            System.out.print(" "+intArray[i]); // 1 2 3 4 5 6 7 8 9 9 8 7 6 5 4 3 2 1
            
        } 
    }
}
