package BasicsDSAImplementations.Array;

public class Q4_Array_Linear_Search {
    public static void main(String[] args){
        int[] array = {10,20,30,50,40,90,34,65,96,75,85};

        int key = 75;
        for(int i=0; i < array.length; i++){
            if(array[i] == key){
                System.out.print("Key Found at index "+i);
                break; // Key Found at index 9
            }
        } 
    }
}
