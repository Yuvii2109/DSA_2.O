import java.util.Scanner;

public class Question5 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the length of the side - ");
            int n = sc.nextInt();
            int row = 1;
            int numberOfSpaces = n-1;
            int numberOfStars = n;
            while(row <= n){
                int x = 1, y = 1;
                while(x <= numberOfSpaces){
                    System.out.print(" ");
                    x++;
                }
                while(y <= numberOfStars){
                    if(row == 1 || row == n){
                        System.out.print("*");
                    }else{
                        if(y == 1 || y == n){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    y++;
                }
                row++;
                numberOfSpaces--;
                System.out.println();
            }
        }
    }
}