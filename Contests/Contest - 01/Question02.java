import java.util.Scanner;

public class Question02 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int row = 1;
            int numberOfSpaces = n-1;
            int centralElement = 1;
            while(row <= n){
                int i = 1;
                while(i <= numberOfSpaces){
                    System.out.print("  ");
                    i++;
                }
                int j = row;
                while(j <= centralElement){
                    System.out.print(j + " ");
                    j++;
                }
                int k = centralElement-1;
                while(k >= row){
                    System.out.print(k + " ");
                    k--;
                }
                row++;
                numberOfSpaces--;
                centralElement += 2;
                System.out.println();
            }
        }
    }
}

/*
    Output -

        Enter the number of rows - 5

                1 
              2 3 2
            3 4 5 4 3 
          4 5 6 7 6 5 4
        5 6 7 8 9 8 7 6 5
*/