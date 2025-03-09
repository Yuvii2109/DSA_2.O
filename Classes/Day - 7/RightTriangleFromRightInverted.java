public class RightTriangleFromRightInverted {
    public static void main(String[] args) {
        int n = 5;
        int numberOfStar = n;
        int numberOfSpace = 0;
        int i = 0;
        while(i < n){
            int k = 0;
            while(k < numberOfSpace){
                System.out.print("  ");
                k++;
            }
            int j = 0;
            while(j < numberOfStar){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            numberOfStar--;
            numberOfSpace++;
            i++;
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