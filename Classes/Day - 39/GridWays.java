public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        // Base cases
        if (i == n - 1 && j == m - 1) {
            // Condition for last cell
            return 1;
        }else if(i == n || j == m){
            // Condition for boundary cross
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
    /*
        public int factorial(int num){
            // Permuations ka use kiya jaa skta hai... so we have to make use of (n-1)Downs and (m-1)Rights. So total (n+m-2) moves. Now the number of arrangements that can be made with (n+m-2) items is (n+m-2)!/(n-1)!*(m-1)! ab yeh isliye kiya. Let the n be 3 and m be 3 as well... now => we have toh arrange 2 Downs and 2 Rights in 4 places... so we have 4!/2!*2! = 24/4 = 6 as DDRR is an approach. Or agr hme permutations ke basics aate hain toh we'll know that 2 same elements can be arranged in 2!/2! = 1 way... so we have to divide (n+m-2)! by (n-1)!*(m-1)! to get the number of ways to reach from (0,0) to (n-1,m-1) in an n x m grid, where we can move either right or down. So we have to make use of permutation to get the answer in O(n+m) time complexity.
            if(num == 0){
                return 1;
            }else{
                return num*factorial(num-1);
            }
        }
        public int optimisedGridWays(int m, int n) {
            return factorial(m + n - 2)/(factorial(m - 1)*factorial(n - 1));
        }
    */
    // Aaj ka din hi thoda aisa hai yaar... let's write the code which can perform calculations for very high factorials...
    public static int optimisedGridWays(int m, int n) {
        // Using the combinations is a better approach than using permuations 
        int N = (m + n - 2);
        int R = Math.min((m - 1), (n - 1));
        long result = 1; // long using to prevent overflow
        for(int i = 1; i <= R; i++){
            result *= (N - R + i) / i; 
            // NCR = ((N - R + 1) * (N - R + 2) * ...(N)) / R!
            // Example - 4C3 = 4 * 3 * 2 / 3 * 2 * 1
        }
        return (int)result;
    }
    public static void main(String args[]){
        System.out.println(optimisedGridWays(3, 7));
    }
}