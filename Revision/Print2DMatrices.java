package Revision;

public class Print2DMatrices {
    public static void main(String[] args){
        
        int[][] arr = {{2,5},{3,6},{8,9}};

        for(int i = 0; i<arr.length;i++){
            System.out.println();
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]);
            }
        }    

    }
    
}
