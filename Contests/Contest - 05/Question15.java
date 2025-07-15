/*
    Given a row-wise sorted matrix of size R × C, find the median of the matrix. The median is defined as the middle element of the sorted matrix if its size is odd, or the Largest of the two middle elements if its size is even.

    Input Format - The first line contains two integers, R (number of rows) and C (number of columns). The next R lines each contain C space-separated integers, representing the rows of the matrix.

    Constraints - 
        1 ≤ R, C ≤ 500
        1 ≤ matrix[R][C] ≤ 109
        The matrix is row-wise sorted, i.e., matrix[R][C] ≤ matrix[R][C+1] for all valid R, C.
    Output Format - Output a single integer, the median of the matrix.
    Sample Input - 
        3 3
        1 3 5
        2 6 9
        3 6 9
    Sample Output - 5
    Explanation - The flattened matrix is [1, 2, 3, 3, 5, 6, 6, 9, 9]. The median is the middle element, 5.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Question15 {
    public static int findMedian(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int res[] = new int[m * n];
        int k = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                res[k] = arr[i][j];
                k++;
            }
        }
        Arrays.sort(res);
        int y = res.length;
        if(y % 2 != 0){
            int median = res[y / 2];
            return median;
        }else{
            int median = res[(y / 2)];
            return median;
        }
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr[][] = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int median = findMedian(arr);
            System.out.println(median);
        }
    }
}