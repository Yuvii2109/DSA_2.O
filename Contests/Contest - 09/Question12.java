/*
    Given n integer intervals of the form [li, ri], determine the size of the smallest interval such that intersection with each given interval contains at least 2 integers. Size of interval [l, r] is given by r - l + 1. Note - It is guaranteed that each interval contains at least two integers.

    Input Format - The first line contains an integer n, the number of intervals. The next n lines contains two integers : li and ri, the start and end points of the intervals.
    Constraints - 
        1 ≤ n ≤ 105
        1 ≤ li , ri ≤ 109
    Output Format - Output a single integer, the length of the smallest interval such that intersection with each of the interval contains at least two integers.
    Sample Input - 
        3
        0 2
        1 3
        2 4
    Sample Output - 3
    Explanation - The smallest interval satisfying the condition is [1, 3]
        [1, 3] ∩ [0, 2] = [1, 2] which contains two integers 1 and 2
        [1, 3] ∩ [1, 3] = [1, 3] which contains three integers 1, 2, and 3
        [1, 3] ∩ [2, 4] = [2, 3] which contains two integers 2 and 3
        Each intersection contains atleast 2 integers. It can be shown that there is no smaller valid interval.
*/

import java.util.Scanner;

public class Question12 {
    private static void lengthOfSmallestInterval(int n, Scanner sc){
        long maxL = Long.MIN_VALUE;
        long minR = Long.MAX_VALUE;

        for(int i = 0; i < n; i++){
            long l = sc.nextLong();
            long r = sc.nextLong();
            if(l > maxL) maxL = l;
            if(r < minR) minR = r;
        }

        long s = maxL - minR + 3;
        if(s < 2) s = 2;
        System.out.println(s);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            lengthOfSmallestInterval(n, sc);
        }
    }
}