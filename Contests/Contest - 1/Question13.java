import java.util.Scanner;

public class Question13 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int triangle[][] = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j <= i; j++){
                    if(j == 0 || i == j){
                        triangle[i][j] = 1;
                    }else{
                        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j <= i; j++){
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

/*
    Output -

        Enter the number of rows - 5
        
        1 
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
*/