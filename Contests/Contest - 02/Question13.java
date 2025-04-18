/*
    Take the following as input.
        A number (N1)
        A number (N2)
    Write a function which prints all armstrong numbers between N1 and N2 (inclusive). 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3
    Input Format - Constraints - 0 < N1 < 100 N1 < N2 < 10000
    Output Format - 
        Sample Input - 
            400
            1000
        Sample Output - 407
        Explanation - Each number in output is in separate line.
*/

import java.util.Scanner;

public class Question13 {
    public static boolean isArmstrong(int n){
        int temp = n;
        int digCounter = n;
        int sum = 0;
        int digits = 0;
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
            System.out.print("Enter the number to begin search with - ");
            int n1 = sc.nextInt();
            System.out.print("Enter the number to end search with - ");
            int n2 = sc.nextInt();
            for(int i = n1; i <= n2; i++){
                if(isArmstrong(i)){
                    System.out.println(i + " lies in the range");
                }
            }
        }
    }
}