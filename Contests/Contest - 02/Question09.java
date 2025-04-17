/*
    Take the following as input.
        A number (N1)
        A number (N2)
    Write a function which returns the LCM of N1 and N2. Print the value returned.

    Input Format - 
    Constraints -
        0 < N1 < 1000000000
        0 < N2 < 1000000000
    Output Format - 
    Sample Input - 
        4 
        6
    Sample Output - 12
    Explanation - The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.
*/

import java.util.Scanner;

public class Question09 {
    public static int greatestCommonDivisor(int a, int b){
        while(b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the first number - ");
            int n1 = sc.nextInt();
            System.out.print("Enter the second number - ");
            int n2 = sc.nextInt();
            if(n1 == 0 || n2 == 0){
                System.out.println(0);
                return;
            }
            // LCM = a*b/greatestCommonDivisor(a, b)
            int gcd = greatestCommonDivisor(n1, n2);
            long lcm = n1*n2/gcd;
            System.out.println("LCM of " + n1 + " and " + n2 + " is - " + lcm);
        }
    }
}