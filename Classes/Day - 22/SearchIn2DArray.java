import java.util.Scanner;

public class SearchIn2DArray {
    public static boolean search(int[][] arr, int k){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == k){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean sortedSearch(int[][] arr, int k){
        // Used if the array is sorted row-wise as well as columns-wise
        // Example - {
        //     {1, 2, 3}, 
        //     {2, 3, 4},
        //     {5, 6, 7}
        // }
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == k){
                return true;
            }else if(k < arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static boolean specialCase(int arr[][], int k){
        // Used for special cases like -
        // Example - {
        //     {1, 2, 3}, 
        //     {4, 5, 6},
        //     {7, 8, 9}
        // }
        int n = arr.length - 1, m = arr[0].length - 1;
        int left = 0, right = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid][m] == k){
                return true;
            }else if(arr[mid][m] < k){
                left++;
            }else if(arr[mid][m] > k){
                m--;
            }else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter rows - ");
            int n = sc.nextInt();
            System.out.print("Enter columns - ");
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print("Enter arr[" + i + "][" + j + "] - ");
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter target value - ");
            int target = sc.nextInt();
            System.out.println(search(arr, target));
        }
    }
}