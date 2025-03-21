import java.util.Scanner;

public class Question1 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                System.out.print("* ");
            }
            System.out.println();
            int row = 1;
            int numberOfSpaces = 1;
            int numberOfStars = n/2;
            while(row <= n-2){
                int x = 1, y = 1, z = 1;
                while(x <= numberOfStars){
                    System.out.print("* ");
                    x++;
                }
                while(y <= numberOfSpaces){
                    System.out.print("  ");
                    y++;
                }
                while(z <= numberOfStars){
                    System.out.print("* ");
                    z++;
                }
                if(row < n/2){
                    numberOfStars--;
                    numberOfSpaces += 2;
                }else{
                    numberOfStars++;
                    numberOfSpaces -= 2;
                }
                row++;
                System.out.println();
            }
            for(int i = 0; i < n; i++){
                System.out.print("* ");
            }
        }
    }
}