/*
    Faculty at CodingBlocks loves to purchase smartphones and decides to play a game. Aayush and Harshit decides to shop for smartphones. Aayush purchases 1 smartphone, then Harshit purchases 2 smartphones, then Aayush purchases 3 smartphones, then Harshit purchases 4 smartphones, and so on. Once someone can't purchase more smartphones, he loses. Aayush can purchase at most M smartphones and Harshit can purchase at most N smartphones. Who will win ? Print "Aayush" and "Harshit" accordingly.


    Input Format - The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows. Two integers M and N denoting the maximum possible number of smartphones Aayush and Harshit can purchase respectively.
    Constraints - 1 ≤ T ≤ 1000 1 ≤ M, N ≤ 10^6
    Output Format - For each test case, output a single line containing one string — the name of the winner i.e. Aayush or Harshit
        Sample Input - 
            2
            9 3    
            8 11
        Sample Output - 
            Aayush
            Harshit
        Explanation - 
            Test case 1. We have M = 9 and N = 3. Aayush shops for 1 smartphone, and then Harshit shops for 2 smartphones. Then Aayush shops for 3 smartphones and then Harshit shops for 4 smartphones but that would mean 2 + 4 = 6 smartphones in total. It's impossible because Harshit can shop for at most N smartphones, so he loses. Aayush wins, and so we print "Aayush".
            Test case 2. Now we have M = 8 and N = 11. Aayush shops for 1 smartphone first, and then Harshit shops for 2 smartphones, then Aayush shops for 3 smartphones. Now Harshit shops for 4 smartphones (he has 2 + 4 = 6 smartphones in total, which is allowed because it doesn't exceed N). Then Aayush tries to shop for 5 smartphones but he can't because 1 + 3 + 5 = 9 which is greater than M. Aayush loses and Harshit is the winner.
*/

import java.util.Scanner;

public class Question16 {
    public static String findWinner(int a, int b){
        int aayushSum = 0, harshitSum = 0;
        int i = 1;
        while(true){
            if(i%2 != 0){
                if(aayushSum + i > a){
                    return "Harshit";
                }
                aayushSum += i;
            }else{
                if(harshitSum + i > b){
                    return "Aayush";
                }
                harshitSum += i;
            }
            i++;
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of testcases - ");
            int T = sc.nextInt();
            while(T-- > 0){
                System.out.print("Enter the number of smartphones Aayush can purchase - ");
                int aayushS = sc.nextInt();
                System.out.print("Enter the number of smartphones Harshit can purchase - ");
                int harshitS = sc.nextInt();
                System.out.println(findWinner(aayushS, harshitS));
            }
        }
    }
}