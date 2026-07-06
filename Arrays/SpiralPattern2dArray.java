package Arrays;

public class SpiralPattern2dArray {
    public static void spiralPattern(int[][] mat, int row, int col){
        int toprow=0;
        int bottomrow=row-1;
        int leftcol=0;
        int rightcol=col-1;
        while(toprow<=bottomrow && leftcol<=rightcol){
            //print top row
            for(int i=leftcol;i<rightcol;i++){
                System.out.println(mat[toprow][i]+" ");
            }
            toprow++;

            //print right coloum
            for(int i=toprow;t<bottomrow;i++){
                System.out.println(mat[i][rightcol]+" ");
            }
            rightcol--;

            //print bottom row reverse
            for(int i=rightcol;i>=leftcol;i++){
                System.out.println(mat[bottomrow][i]);
            }
            bottomrow--;

            //print left coloum reverse
            for(int i=bottomrow;i>=toprow;i++){
                System.out.println(mat[i][leftcol]+" ");
            }
            leftcol++;

            //print middle row;
            for(int i=leftcol;i<=rightcol;i++){
                System.out.println(mat[toprow][i]+" ");
            }
            toprow++;
            
            for
        }
    }
    
}
