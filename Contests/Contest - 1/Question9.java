import java.util.Scanner;

public class Question9 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int row = 1;
            int numberOfSpaces = 2*n - 3;
            while(row <= n){
                int x = 1, y = 1, z = row;
                while(x <= row){
                    System.out.print(x + "\t");
                    x++;
                }
                while(y <= numberOfSpaces){
                    System.out.print(" \t");
                    y++;
                }
                if(row == n){
                    z = row-1;
                }
                while(z >= 1){
                    System.out.print(z + "\t");
                    z--;
                }
                numberOfSpaces -= 2;
                row++;
                System.out.println();
            }
        }
    }
}