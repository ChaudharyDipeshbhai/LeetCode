class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int cols = mat[0].length;
        if((row*cols) != r*c) return mat;
        int [][] output = new int[r][c];
        int op_row = 0;
        int op_col = 0;

        for(int i=0;i<row;i++){
            for(int j=0; j<cols; j++){
                output[op_row][op_col] = mat[i][j];
                op_col++;

                if(op_col == c){
                    op_col = 0;
                    op_row++;
                }
            }
        }
        return output;
    }
}