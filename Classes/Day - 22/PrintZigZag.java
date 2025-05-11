public class PrintZigZag {
    public static void displayZigZag(int[][] arr){
        // Row-wise - 
        System.out.print("Row-wise - ");
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                for(int j = 0; j < arr[0].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j = arr[0].length - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        // Column-wise -
        System.out.print("\nColumn-wise - ");
        for(int j = 0; j < arr[0].length; j++){
            if(j%2 == 0){
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int i = arr.length - 1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        displayZigZag(arr);
    }   
}