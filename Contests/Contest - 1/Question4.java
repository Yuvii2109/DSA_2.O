import java.util.Scanner;

public class Question4 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int row = 1;
            int number = 1;
            int numberOfElements = 1;
            while(row <= n){
                int i = 1;
                while(i <= numberOfElements){
                    System.out.print(number + " ");
                    i++;
                    number++;
                }
                System.out.println();
                numberOfElements++;
                row++;
            }
        }
    }
}