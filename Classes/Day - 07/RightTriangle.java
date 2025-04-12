import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first side of the right triangle - ");
        int n = sc.nextInt();
        System.out.println("\nPatter using for loop - ");
        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nPatter using while loop - ");
        int row = 0;
        while(row < n) {
            int col = 0; 
            while(col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}

/*
    Output -
    
    *
    * *
    * * *
    * * * *
    * * * * *
*/