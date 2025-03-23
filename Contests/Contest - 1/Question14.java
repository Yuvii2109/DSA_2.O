import java.util.Scanner;

public class Question14 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the value of n - ");
            int n = sc.nextInt();
            int rows = 1;
            int centralNumber = 0;
            int numberOfSpaces = 0;
            int startingNumber = n;
            while(rows <= 2*n+1){
                int x = 1, y = startingNumber;
                while(x <= numberOfSpaces){
                    System.out.print("  ");
                    x++;
                }
                while(y >= centralNumber){
                    System.out.print(y + " ");
                    y--;
                }
                y = 1;
                while(y <= startingNumber){
                    System.out.print(y + " ");
                    y++;
                }
                if(rows < n+1){
                    numberOfSpaces++;
                    startingNumber--;
                }else{
                    numberOfSpaces--;
                    startingNumber++;
                }
                rows++;
                System.out.println();
            }
        }
    }
}

/*
    Output -

        Enter the value of n - 5
        
        5 4 3 2 1 0 1 2 3 4 5 
          4 3 2 1 0 1 2 3 4 
            3 2 1 0 1 2 3 
              2 1 0 1 2 
                1 0 1 
                  0 
                1 0 1
              2 1 0 1 2
            3 2 1 0 1 2 3 
          4 3 2 1 0 1 2 3 4
        5 4 3 2 1 0 1 2 3 4 5
*/