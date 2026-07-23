class Solution {
    public int[][] transpose(int[][] matrix) {
        /* matrix.length → Number of rows
        matrix[0].length → Number of columns
        Create a new matrix with swapped dimensions */
        int transMat[][]=new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++){//Traverse each row of the original matrix
            for(int j=0;j<matrix[0].length;j++){//Traverse each column of the current row
                transMat[j][i]=matrix[i][j];//Swap the row and column indices--->matrix[row][column] → answer[column][row]
            }
        }
        return transMat;
    }
}
