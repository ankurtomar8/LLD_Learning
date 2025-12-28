package SearchingBinary;

public class BinarySearch {
 
    public static void main(String[] args){

        // Array Must be sorted 
        int[] nums = {10,20,30,40,60,70,90,140,170,200,210,220};
       
        // find this in array num
        int target = 60;

        BinarySearchHelper(nums,target);
    }

    public static void BinarySearchHelper(int[] arr, int target){
        // two pointers low , high 
        int low = 0; int high = arr.length-1;
       // int mid = (low+high) / 2 ; overflow condition

         int newMid =  0;

        while(low <= high){
        int mid = low+(high-low)/2;

        if(arr[mid] == target){
            newMid =  mid;
            // System.out.print(" Index is "+newMid);
        }
        if(arr[mid] < target ){
          low = mid+1;
        }else {
            high = mid - 1;
        }

    }
            System.out.print(" Index is "+newMid);
        //return low;
    }
    

}
