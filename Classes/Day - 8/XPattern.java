public class XPattern {
    public static void main(String[] args) {
        int n = 5;
        int matrix[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    matrix[i][j] = 1;
                }else if(i+j == n-1){
                    matrix[i][j] = 1;
                }
            }
        }
        for(int k = 0; k < n; k++){
            for(int y = 0; y < n; y++){
                if(matrix[k][y] == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
    Output -

    *       * 
      *   *   
        *     
      *   *   
    *       *
*/