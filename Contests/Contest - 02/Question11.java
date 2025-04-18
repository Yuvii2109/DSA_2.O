/*
    Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t. Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.


    Input Format - The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.


    Constraints - x <= 100000000000000000
    Output Format - Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.
        Sample Input - 4545
        Sample Output - 4444
        Explanation - There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it.
*/

import java.util.Scanner;

public class Question11 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number - ");
            long n = sc.nextLong();
            long inverted = 0;
            long placevalue = 1;
            long temp = n;
            while(temp != 0){
                if(temp < 10){
                    long rem = temp%10;
                    if(rem == 9){
                        inverted += rem*placevalue;
                    }else{
                        if(rem < 9-rem){
                            inverted += rem*placevalue;
                        }else{
                            inverted += (9-rem)*placevalue;
                        }
                    }
                }else{
                    long rem = temp%10;
                    if(rem < 9-rem){
                        inverted += rem*placevalue;
                    }else{
                        inverted += (9-rem)*placevalue;
                    }
                }
                placevalue *= 10;
                temp /= 10;
            }
            System.out.println(n + " gets inverted to - " +inverted);
        }
    }
}

/*
    We’re given a positive integer x (up to 10^18) and allowed to “invert” any of its decimal digits t by replacing it with (9 − t). Our goal is to make the resulting number as small as possible, subject to two rules - You may invert each digit independently—you can choose to invert some digits and leave others alone. The final number must not have a leading zero. In particular, if the most significant digit of x is 9, you’re allowed to invert it (9 → 0) only if it’s not in the first position, otherwise inverting it would introduce a leading zero. 

    Walk‑through on the sample - 
        Input - 4545
        Digits - 4 5 4 5
        Process each digit -
            First digit 4 → invert to 9−4=5? 5>4, so leave it as 4.
            Next digit 5 → invert to 9−5=4? 4<5, so change it to 4.
            Next digit 4 → invert to 5? 5>4, leave it as 4.
            Last digit 5 → invert to 4? 4<5, change it to 4.
        Result - 4444
*/