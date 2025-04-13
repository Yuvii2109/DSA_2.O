import java.util.Scanner;

public class Question07 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int rows = 1;
            int numberOfNumbers = 1;
            while(rows <= n){
                for(int i = 1; i <= numberOfNumbers; i++){
                    if(i == 1 || i == numberOfNumbers){
                        System.out.print(numberOfNumbers + " ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                numberOfNumbers++;
                System.out.println();
                rows++;
            }
        }
    }
}

/*
    Output -

        Enter the number of rows - 7
        
        1 
        2 2 
        3 0 3 
        4 0 0 4 
        5 0 0 0 5 
        6 0 0 0 0 6 
        7 0 0 0 0 0 7
*/