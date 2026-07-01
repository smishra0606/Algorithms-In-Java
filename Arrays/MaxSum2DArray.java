package Arrays;

public class MaxSum2DArray {
    public static void sum(int[][] mat, int row, int col) {
        int totalSum = 0;
        int index=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            int rowSum = 0;

            for (int j = 0; j < col; j++) {
                totalSum += mat[i][j];
                rowSum += mat[i][j];
                if(maxSum<rowSum){
                    maxSum=rowSum;
                    index=i;
                }
                if(index<=i){
                    index=i;
                }
            }
        }
        System.out.println("maxsum is: " + maxSum + " at row index: " + index);
        // for (int j = 0; j < col; j++) {
        //     int colSum = 0;
        //     for (int i = 0; i < row; i++) {
        //         colSum += mat[i][j];
        //     }
        //     System.out.println("Sum of column " + j + " is: " + colSum);
        // }
        // System.out.println("Sum of 2D array is: " + totalSum);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };        
        int row = mat.length;
        int col = mat[0].length;
        sum(mat, row, col);
    }
}
