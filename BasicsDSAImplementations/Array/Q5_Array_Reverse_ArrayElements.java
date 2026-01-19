package BasicsDSAImplementations.Array;

public class Q5_Array_Reverse_ArrayElements {
    public static void main(String[] args){
        int[] array = {10,20,30,96,7,4,50,60,70,80,90};
        int n = array.length;

        for(int i = n-1; i>=0 ; i--){
            System.out.print(" "+array[i]); //  90 80 70 60 50 4 7 96 30 20 10
        }
        System.out.println();
        // While loop approach
       int i = 0; int j = array.length-1;
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
            
        }
        for(int k = 0; k <array.length;k++){
            System.out.print(" "+array[k]);
            // 90 80 70 60 50 4 7 96 30 20 10
        }

    }
}
