public class VCutOutPattern {
    public static void main(String[] args) {
        int row = 1;
        int leftStar = 1;
        int rightStar = 1;
        int numberOfSpaces = 7;
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
            if(row == 5){
                k = 2; // To skip an extra star in the last row
            }
            while(k <= rightStar){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            leftStar++;
            rightStar++;
            numberOfSpaces -= 2;
            row++;
        }
    }
}

/*
    Output -

    *               * 
    * *           * *
    * * *       * * *
    * * * *   * * * *
    * * * * * * * * *
*/