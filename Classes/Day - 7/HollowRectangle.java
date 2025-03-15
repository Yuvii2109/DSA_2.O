public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("Method 1 -");
        int n = 5, i = 1;
        while(i <= n){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        i = 1;
        while(i <= n-2){
            for(int k = 1; k <= n; k++){
                if(k == 1 || k == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            i++;
        }
        i = 1;
        while(i <= n){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        System.out.println("\nMethod 2 - Using 2D Array");
        int[][] arr = new int[n][n];
        for(int k = 0; k < n; k++){
            for(int y = 0; y < n; y++){
                if(k == 0 || k == n-1 || y == 0 || y == n-1){
                    arr[k][y] = 1;
                }
            }
        }
        for(int k = 0; k < n; k++){
            for(int y = 0; y < n; y++){
                if(arr[k][y] == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}