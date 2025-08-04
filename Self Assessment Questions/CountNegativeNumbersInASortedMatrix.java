/*
    Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

    Example 1 -
        Input - grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
        Output - 8
        Explanation - There are 8 negatives number in the matrix.

    Example 2 -
        Input - grid = [[3,2],[1,0]]
        Output - 0
*/

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        /*
            for(int i = 0; i < n; i++){
                int low = 0, high = m - 1;
                while(low <= high){
                    int mid = low + (high - low) / 2;
                    if(grid[i][mid] >= 0){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                }
                count += (m - low);
            }
            return count;
        */
        int row = 0, col = m - 1;
        while(row < n && col >= 0){
            if(grid[row][col] < 0){
                count += (n - row);
                col--;
            }else{
                row++;
            }
        }
        return count;
    }
}