import java.util.Scanner;

public class SolidSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length - ");
        int n = sc.nextInt();
        System.out.println("\nPattern using for - ");
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nPattern using while - ");
        int row = 0;
        while(row < n){
            int col = 0;
            while(col < n){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}