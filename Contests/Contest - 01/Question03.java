import java.util.Scanner;

public class Question03 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int numberOfSpaces = n/2;
            int numberOfStars = 1;
            int row = 1;
            while(row <= n){
                int x = 1, y = 1;
                while(x <= numberOfSpaces){
                    System.out.print("  ");
                    x++;
                }
                while(y <= numberOfStars){
                    System.out.print("* ");
                    y++;
                }
                if(row < (n+1)/2){
                    numberOfSpaces--;
                    numberOfStars += 2;
                }else{
                    numberOfSpaces++;
                    numberOfStars -= 2;
                }
                row++;
                System.out.println();
            }
        }
    }
}

/*
    Output -

        Enter the number of rows - 7
        
              * 
            * * *
          * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
*/