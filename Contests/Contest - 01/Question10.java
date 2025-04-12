import java.util.Scanner;

public class Question10 {
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int row = 1;
            int numberOfStars = n-1;
            int numberOfSpaces = 1;
            for(int i = 1; i <= 2*n-1; i++){
                System.out.print("* ");
            }
            System.out.println();
            while(row <= 2*n-3){
                for(int i = 1; i <= numberOfStars; i++){
                    System.out.print("* ");
                }
                for(int j = 1; j <= numberOfSpaces; j++){
                    System.out.print("  ");
                }
                for(int k = 1; k <= numberOfStars; k++){
                    System.out.print("* ");
                }
                System.out.println();
                row++;
                if(row < n){
                    numberOfSpaces += 2;
                    numberOfStars--;
                }else{
                    numberOfSpaces -= 2;
                    numberOfStars++;
                }
            }
            for(int i = 1; i <= 2*n-1; i++){
                System.out.print("* ");
            }
        }
    }
}

/*
    Output -

        Enter the number of rows - 5
        
        * * * * * * * * * 
        * * * *   * * * *
        * * *       * * *
        * *           * *
        *               * 
        * *           * *
        * * *       * * *
        * * * *   * * * *
        * * * * * * * * *
*/