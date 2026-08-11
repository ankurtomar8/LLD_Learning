package Revision;

public class Add2DMatrices {
    public static void main(String[] args){
        
        int[][] arr = {{2,5},{3,6},{8,9}};
        int[][] arr2 = {{2,5},{3,6},{8,9}};
        int[][] arr3 = new int[arr.length][arr[0].length];
        for(int i = 0; i<arr.length;i++){
            System.out.println();
            for(int j = 0; j<arr[i].length;j++){
               arr3[i][j] = arr[i][j]+arr2[i][j];
               System.out.print(" "+arr3[i][j]);
            }
        }    

    }
}
