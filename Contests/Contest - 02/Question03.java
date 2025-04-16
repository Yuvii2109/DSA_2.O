/*
    Take N as input, Calculate it's reverse also Print the reverse. 

    Input Format - Constraints - 0 <= N <= 1000000000

    Output Format - 
        Sample Input - 123456789
        Sample Output - 987654321
        Explanation - You've to calculate the reverse in a number, not just print the reverse.
*/

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
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