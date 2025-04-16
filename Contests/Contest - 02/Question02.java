/*
    Take the following as input.
        A number
        A digit
    Write a function that returns the number of times digit is found in the number. Print the value returned.

    Input Format - Integer (A number) Integer (A digit)
    Constraints - 0 <= N <= 1000000000 0 <= Digit <= 9

    Output Format - Integer (count of times digit occurs in the number)

    Sample Input - 
        5433231 
        3
    Sample Output - 3
    Explanation - The digit can be from 0 to 9. Assume decimal numbers. In the given case digit 3 is occurring 3 times in the given number.
*/

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
            int n = sc.nextInt();
            System.out.print("Enter the target digit - ");
            int digit = sc.nextInt();
            int digCount = 0;
            while(n != 0){
                int rem = n%10;
                if(rem == digit){
                    digCount++;
                }
                n /= 10;
            }
            System.out.println(digit + " is present " + digCount + " times in the entered number.");
        }
    }
}