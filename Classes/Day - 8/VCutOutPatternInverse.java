public class VCutOutPatternInverse {
    public static void main(String[] args) {
        int row = 1;
        int leftStar = 5;
        int rightStar = 5;
        int numberOfSpaces = 0;
        while(row <= 5){
            int i = 1;
            while(i <= leftStar){
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j <= numberOfSpaces){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(row == 1){
                k = 2; // To skip an extra star in the last row
                numberOfSpaces--; // Second row main 2 ki jagah 1 space laane ke liye
            }
            while(k <= rightStar){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            leftStar--;
            rightStar--;
            numberOfSpaces += 2;
            row++;
        }
    }
}

/*
    Output -

    * * * * * * * * * 
    * * * *   * * * *
    * * *       * * *
    * *           * *
    *               *
*/