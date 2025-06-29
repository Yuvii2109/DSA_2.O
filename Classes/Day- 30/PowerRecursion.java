import java.util.Scanner;

public class PowerRecursion {
    public static int power(int base, int power){
        if(power == 0){
            return 1;
        }else if(power == 1){
            return base;
        }
        int smallProblem = power(base, power - 1);
        int bigProblem = base * smallProblem;
        return bigProblem;
    }
    public static int optimisePower(int base, int power){
        if(power == 0){
            return 1;
        }else if(power == 1){
            return base;
        }
        int halfPowerSquare = optimisePower(base, power/2) * optimisePower(base, power/2);
        if(power % 2 != 0){
            halfPowerSquare *= base;
        }
        return halfPowerSquare;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a - ");
            int a = sc.nextInt();
            System.out.print("Enter b - ");
            int b = sc.nextInt();
            int result = optimisePower(a, b);
            System.out.println(a + " to the power of " + b + " is - " + result);
        }
    }
}