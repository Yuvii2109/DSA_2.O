import java.util.Scanner;

public class Question08 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int fib0 = 0, fib1 = 1;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(fib0 + " ");
                    int next = fib0 + fib1;
                    fib0 = fib1;
                    fib1 = next;
                }
                System.out.println();
            }
        }
    }
}

/*
    Output -

        Enter the number of rows - 4
        
        0 
        1 1
        2 3 5
        8 13 21 34
*/