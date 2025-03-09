public class InvertedRightStar {
    public static void main(String[] args) {
        int n = 5;
        int i = n;
        System.out.println("Method 1 -");
        while(i > 0){
            int j = 1;
            while(j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
        System.out.println("\nMethod 2 -");
        int row = 1;
        int numberOfStar = n;
        while(row <= n){
            int k = 1;
            while(k <= numberOfStar){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            row++;
            numberOfStar--;
        }
    }
}

/*
    Output -

    * * * * * 
    * * * * 
    * * * 
    * * 
    * 
*/