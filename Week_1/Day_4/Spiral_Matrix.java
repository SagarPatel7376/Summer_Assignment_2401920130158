class Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][] matrix){
        int top = 0, left = 0, right = matrix[0].length-1, bottom = matrix.length-1;
        ArrayList<Integer> Sag = new ArrayList<>();
        while(top <= bottom && left <= right){

            for(int i = left; i <= right; i++){
                Sag.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                Sag.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    Sag.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    Sag.add(matrix[i][left]);
                }
            }
            left++;
        }
        return Sag;
    }
}
