import java.util.Scanner;

public class ReverseANumber {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number you wish to reverse - ");
            int n = sc.nextInt();
            int rev = 0;
            int temp = n;
            while(temp != 0){
                int rem = temp%10;
                rev = rev*10 + rem;
                temp /= 10;
            }
            System.out.println("Reverse of " + n + " is - " + rev);
        }
    }
}