import java.util.Scanner;

public class LinearStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars - ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        sc.close();
    }
}