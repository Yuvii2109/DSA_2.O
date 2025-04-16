/*
    Take as input a number N, print "Prime" if it is prime if not Print "Not Prime". 

    Input Format - Constraints - 2 < N <= 1000000000
    Output Format - 
        Sample Input - 3
        Sample Output - Prime
        Explanation - The output is case specific
*/

import java.util.Scanner;

public class Question04 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            boolean isPrime = false;
            if(n == 2 || n == 3){
                isPrime = true;
            }else{
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n%i == 0){
                        isPrime = false;
                        break;
                    }else{
                        isPrime = true;
                    }
                }
            }
            if(isPrime){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
    }
}