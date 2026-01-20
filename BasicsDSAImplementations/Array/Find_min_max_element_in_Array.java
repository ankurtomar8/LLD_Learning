package BasicsDSAImplementations.Array;

public class Find_min_max_element_in_Array {
    public static void main(String[] args){

        int[] numArray = {20,30,4,6,2,7,8,90,60,3,40};
        int n = numArray.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n ;i++){
            if(numArray[i] >= max ){
                max = numArray[i];
            }

             if(numArray[i] < min ){
                min = numArray[i];
            }
        }
          System.out.println("\nFinal max value : \n"+max); 
          // Final max value : 90
          System.out.println("\nFinal min value : \n"+min); 
          // Final min value : 2


    }
}
