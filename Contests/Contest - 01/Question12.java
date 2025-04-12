import java.util.Scanner;

public class Question12 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int row = 1;
            int numberOfSpacesBefore = n-1;
            int numberOfSpacesAfter = 1;
            for(int i = 1; i <= numberOfSpacesBefore; i++){
                    System.out.print("  ");
            }
            System.out.print(1 + " ");
            System.out.println();
            row++;
            int number = 2;
            numberOfSpacesBefore -= 2;
            while(row <= n-1){
                for(int j = 1; j <= numberOfSpacesBefore; j++){
                    System.out.print("  ");
                }
                for(int k = number; k >= 1; k--){
                    System.out.print(k + " ");
                }
                for(int l = 1; l <= numberOfSpacesAfter; l++){
                    System.out.print("  ");
                }
                for(int m = 1; m <= number; m++){
                    System.out.print(m + " ");
                }
                row++;
                if(row <= (n+1)/2){
                    number++;
                    numberOfSpacesAfter += 2;
                    numberOfSpacesBefore -= 2;
                }else{
                    number--;
                    numberOfSpacesAfter -= 2;
                    numberOfSpacesBefore += 2;
                }
                System.out.println();
            }
            if(n > 1){
                for(int i = 1; i <= numberOfSpacesBefore; i++){
                        System.out.print("  ");
                }
                System.out.print(1 + " ");
            }
        }
    }
}

/*
    Output -

        Enter the number of rows - 7
        
                    1 
                2 1   1 2 
            3 2 1       1 2 3
        4 3 2 1           1 2 3 4
            3 2 1       1 2 3
                2 1   1 2
                    1
*/