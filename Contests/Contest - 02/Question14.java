/*
    Take the following as input.
        A number
    Write a function which returns true if the number is an armstrong number and false otherwise, where Armstrong number is defined as follows. A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if - 
        abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….
        1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4
        371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

    Input Format - Single line input containing an integer.
    Constraints - 0 < N < 1000000000 
    Output Format - Print boolean output for each testcase.
    "true" if the given number is an Armstrong Number, else print "false".
        Sample Input - 371
        Sample Output - true
        Explanation - Use functions. Write a function to get check if the number is armstrong number or not. Numbers are armstrong if it is equal to sum of each digit raised to the power of number of digits.
*/

import java.util.Scanner;

public class Question14 {
    public static boolean isArmstrong(int n){
        int temp = n;
        int digCounter = n;
        int digits = 0;
        int sum = 0;
        while(digCounter != 0){
            digits++;
            digCounter /= 10;
        }
        while(temp != 0){
            int rem = temp%10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }
        if(sum == n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
            int n = sc.nextInt();
            if(isArmstrong(n)){
                System.out.println(n + "is an armstrong number.");
            }else{
                System.out.println(n + "is not an armstrong number.");
            }
        }
    }
}