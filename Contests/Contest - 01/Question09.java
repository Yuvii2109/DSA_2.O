import java.util.Scanner;

public class Question09 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int row = 1;
            int numberOfSpaces = 2*n - 3;
            while(row <= n){
                int x = 1, y = 1, z = row;
                while(x <= row){
                    System.out.print(x + " ");
                    x++;
                }
                while(y <= numberOfSpaces){
                    System.out.print("  ");
                    y++;
                }
                if(row == n){
                    z = row-1;
                }
                while(z >= 1){
                    System.out.print(z + " ");
                    z--;
                }
                numberOfSpaces -= 2;
                row++;
                System.out.println();
            }
        }
    }
}

/*
    Output -

        Enter the number of rows - 5
        
        1               1 
        1 2           2 1
        1 2 3       3 2 1
        1 2 3 4   4 3 2 1
        1 2 3 4 5 4 3 2 1 
*/