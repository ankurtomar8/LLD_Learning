package BasicsDSAImplementations.Array;

public class Is_Array_Sorted {
    public static void main(String[] args){

        int[] nums = {10,20,30,0,50,60};

        boolean isSorted = true;
        int Inspector = 0;

        for(int i=0;i<nums.length-1;i++){
            Inspector = i;
            if(nums[i] > nums[i+1]){
                Inspector = i;
                isSorted = false;
                break;
            }

        }if(isSorted == true){
            System.out.println("Array is sorted");
        }else{
            System.out.println(" Array is not sorted");
            System.out.println("Inspector caught violation at:"+Inspector);
        }


    }
}
