public class RightTriangleFromRight {
    public static void main(String[] args) {
        int n = 5;
        int numberOfStar = 1;
        int space = n - 1;
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k <= numberOfStar){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            space--;
            numberOfStar++;
            i++;
        }
    }
}

/*
    Output -
    
            * 
          * * 
        * * * 
      * * * * 
    * * * * * 
*/