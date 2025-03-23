import java.util.Scanner;

public class Question15 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the value of n - ");
            int n = sc.nextInt();
            int rows = 1;
            int numberOfSpaces = 2*n-1;
            int startingNumber = n;
            while(rows <= 2*n+1){
                int x = n, y = numberOfSpaces, z = n;
                if(rows == n+1){
                    while(z >= 0){
                        System.out.print(z + " ");
                        z--;
                    }
                    z = 1;
                    while(z <= n){
                        System.out.print(z + " ");
                        z++;
                    }
                }else{
                    while(x >= startingNumber){
                        System.out.print(x + " ");
                        x--;
                    }
                    while(y >= 1){
                        System.out.print("  ");
                        y--;
                    }
                    int k = startingNumber;
                    while(k <= n){
                        System.out.print(k + " ");
                        k++;
                    }
                }
                if(rows <= n){
                    startingNumber--;
                    numberOfSpaces -= 2;
                }else{
                    startingNumber++;
                    numberOfSpaces += 2;
                }
                rows++;
                System.out.println();
            }
        }
    }
}

/*
    Output -

        Enter the value of n - 7
        
        7                           7 
        7 6                       6 7 
        7 6 5                   5 6 7 
        7 6 5 4               4 5 6 7 
        7 6 5 4 3           3 4 5 6 7 
        7 6 5 4 3 2       2 3 4 5 6 7 
        7 6 5 4 3 2 1   1 2 3 4 5 6 7 
        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
        7 6 5 4 3 2 1   1 2 3 4 5 6 7
        7 6 5 4 3 2       2 3 4 5 6 7
        7 6 5 4 3           3 4 5 6 7
        7 6 5 4               4 5 6 7
        7 6 5                   5 6 7 
        7 6                       6 7
        7                           7
*/