import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
            int n = sc.nextInt();
            boolean isPrime = false;
            if(n == 1){
                System.out.println("1 is neither prime nor composite");
            }else if(n == 2 || n == 3){
                System.out.println(n + " is a prime number");
            }else{
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n%i == 0){
                        isPrime = false;
                        break;
                    }else{
                        isPrime = true;
                    }
                }
                if(isPrime){
                    System.out.println(n + " is a prime number");
                }else{
                    System.out.println(n + " is not a prime number");
                }
            }
        }
    }
}