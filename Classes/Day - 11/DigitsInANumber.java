import java.util.Scanner;

public class DigitsInANumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
            int n = sc.nextInt();
            int digit = 0;
            while(n != 0){
                n /= 10;
                digit++;
            }
            System.out.println("Number of digits in entered number - " + digit);
        }
    }
}