import java.util.Scanner;

public class Recursion {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int smallerProblem = factorial(n - 1);
        int biggerProblem = n * smallerProblem;
        return biggerProblem;
    }
    public static int sumOfFirstNNaturalNumbers(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfFirstNNaturalNumbers(n - 1);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter value of n - ");
            int n = sc.nextInt();
            int result = sumOfFirstNNaturalNumbers(n);
            System.out.println("Sum of first " + n + " natural numbers is - " + result);
        }
    }
}