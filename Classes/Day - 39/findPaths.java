public class findPaths {
    public static void printPaths(int[][] matrix, int currentRow, int currentCol, int destinationRow, int destinationCol, String result){
        if(currentRow == destinationRow && currentCol == destinationCol){
            System.out.println(result);
            return;
        }
        if(currentRow > destinationRow || currentCol > destinationCol){
            return;
        }
        printPaths(matrix, currentRow, currentCol + 1, destinationRow, destinationCol, result + "R");
        printPaths(matrix, currentRow + 1, currentCol, destinationRow, destinationCol, result + "D");
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        int[][] matrix = new int[n][m];
        printPaths(matrix, 0, 0, n - 1, m - 1, "");
    }
}