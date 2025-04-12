public class SpaceIncreasingByTwo {
    public static void main(String[] args) {
        int n = 5;
        int numberOfStar = n;
        int numberOfSpace = 0;
        int i = 0;
        while (i < n) {
            int j = 0;
            while(j < numberOfSpace){
                System.out.print("  ");
                j++;
            }
            int k = 0;
            while(k < numberOfStar){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
            numberOfStar--;
            numberOfSpace += 2;
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