import java.util.Scanner;

public class SumOfOddEvenDigits {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
            int n = sc.nextInt();
            int oddSum = 0, evenSum = 0;
            while(n != 0){
                int rem = n%10;
                if(rem%2 == 0){
                    evenSum += rem;
                }else{
                    oddSum += rem;
                }
                n /= 10;
            }
            System.out.println("Even digit sum - " + evenSum);
            System.out.println("Odd digit sum - " + oddSum);
        }
    }
}