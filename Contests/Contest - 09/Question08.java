import java.util.Scanner;

/*
    Any programmer worth his salt would be familiar with the famous Longest Common Subsequence problem. Mancunian was asked to solve the same by an incompetent programmer. As expected, he solved it in a flash. To complicate matters, a twist was introduced in the problem.

    In addition to the two sequences, an additional parameter k was introduced. A k-ordered LCS is defined to be the LCS of two sequences if you are allowed to change atmost k elements in the first sequence to any value you wish to. Can you help Mancunian solve this version of the classical problem?

    Input Format - The first line contains three integers N, M and k, denoting the lengths of the first and second sequences and the value of the provided parameter respectively. The second line contains N integers denoting the elements of the first sequence. The third line contains M integers denoting the elements of the second sequence.
    Constraints - 
        1 <= N, M <= 2000
        1 <= k <= 5
        1 <= element in any sequence <= 109
    Output Format - Print the answer in a new line.
    Sample Input - 
        5 5 1
        1 2 3 4 5
        5 3 1 4 2
    Sample Output - 3
*/

public class Question08 {
    private static void kOrderedLCS(int N, int M, int K, int[] A, int[] B){
        int[][][] dp = new int[N + 1][M + 1][K + 1];
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= M; j++){
                for(int k = 0; k <= K; k++){
                    if(A[i - 1] == B[j - 1]){
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k];
                    }else{
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i][j - 1][k]);
                        if(k > 0){
                            dp[i][j][k] = Math.max(dp[i][j][k], 1 + dp[i - 1][j - 1][k - 1]);
                        }
                    }
                }
            }
        }
        System.out.println(dp[N][M][K]);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[M];
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }
            for(int i = 0; i < M; i++){
                B[i] = sc.nextInt();
            }
            kOrderedLCS(N, M, K, A, B);
        }
    }
}