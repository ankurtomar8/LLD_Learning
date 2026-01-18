package BasicsDSAImplementations.Array;

public class Q2_Array_Sum_average_using_loops {
    public static void main(String[] args){
        int[] arraySum = {1,2,3,4,5,6,7,8,9};

        int sum = 0;
        for(int sumCount : arraySum){
            sum += sumCount;
        }
        System.out.println(" "+sum);

         double b = arraySum.length;
         System.out.println("Sum is \n"+sum);
         double newAverage=(double)(sum/b);

         System.out.println("Average is "+newAverage);

    }
}
