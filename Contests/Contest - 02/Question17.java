/*
    A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.

    Input Format - There will be only one line of input:N , the number which needs to be checked.
    Constraints - 1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)
    Output Format - 1 if the number is a Boston number. 0 if the number is a not Boston number.
        Sample Input - 378
        Sample Output - 1
        Explanation - Self Explanatory
*/

import java.util.Scanner;

public class Question17 {
    public static boolean isPrime(long x){
        if(x < 2) return false;
        if(x % 2 == 0) return (x == 2);
        for(long i = 3; i * i <= x; i += 2){
            if(x % i == 0) return false;
        }
        return true;
    }
    public static int digitSum(long x){
        int sum = 0;
        while(x > 0){
            sum += (int)(x % 10);
            x /= 10;
        }
        return sum;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
            long n = sc.nextLong();
            if(n == 1 || isPrime(n)){
                System.out.println(0);
                return;
            }
            int sumOfDigits = digitSum(n);
            int sumOfPrimeFactors = 0;
            long temp = n;
            // Factoring out 2s
            while(temp % 2 == 0){
                sumOfPrimeFactors += digitSum(2);
                temp /= 2;
            }
            // Factoring out odd primes
            for(long p = 3; p * p <= n; p += 2){
                while(temp % p == 0){
                    sumOfPrimeFactors += digitSum(p);
                    temp /= p;
                }
            }
            // If remainder > 1, it's a prime factor > sqrt(N) -> Just handling any edge cases
            if(temp > 1){
                sumOfPrimeFactors += digitSum(temp);
            }
            System.out.println(sumOfDigits == sumOfPrimeFactors ? 1 : 0);
        }
    }
}