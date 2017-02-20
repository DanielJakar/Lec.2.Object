package course.Daniel.Java;

/**
 * Created by Jakars on 31/01/2017.
 */
public class Matrices {
    static int [] diagonal (int [][] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i][i];

        }
        return result;
    }
    static int [] reverseDiagonal (int [][] arr){
        int[] result = new int[arr.length];
        for (int row = 0, col = arr.length-1; row < arr.length; row++, col--) {
            result[row] = arr[row][col];

        }
        return result;
    }
    static Boolean repeatLine (int[][] arr,int k,int j){
        Boolean repeatLine = false;
        for (int i = j; i < arr.length; i++) {
            if (arr [k][i] == arr [k+1][i]){
                repeatLine = true;
            }
            else{
                repeatLine = false;
            }

        }
        return repeatLine;
    }

}
