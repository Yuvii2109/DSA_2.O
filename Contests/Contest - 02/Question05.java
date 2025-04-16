/*
    Take the following as input - 
        A number (N1)
        A number (N2)
    Write a function which returns the GCD of N1 and N2. Print the value returned.

    Input Format - Two integers seperated by a new line.
    Constraints - 0 < N1 < 1000000000, 0 < N2 < 1000000000
    Output Format - Output a single integer which is the GCD of the given integers.
        Sample Input - 
            16 
            24
        Sample Output - 8
        Explanation - The largest number that divides both N1 and N2 is called the GCD of N1 and N2.
*/

import java.util.Scanner;

public class Question05 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number 1 - ");
            int n = sc.nextInt();
            System.out.print("Enter number 2 - ");
            int m = sc.nextInt();
            int gcd = 0;
            if(m < n){
                int temp = n;
                n = m;
                m = temp;
            }
            if(m%n == 0){
                gcd = n;
            }else{
                for(int i = 1; i <= n/2; i++){
                    if(n%i == 0 && m%i == 0){
                        gcd = i;
                    }
                }
            }
            System.out.println("Greatest common divisor of " + n + ", " + m + " is - " + gcd);
        }
    }
}