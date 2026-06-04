class Reshape_Matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       if( (mat.length * mat[0].length) != r*c ){
            return mat;
        }
        int[][] arr = new int[r][c];
        int m = 0, n = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = mat[m][n];
                n++;
                if(n > mat[0].length-1){
                    n = 0;
                    m++;
                }
            }
        }
        return arr;
    }
}
