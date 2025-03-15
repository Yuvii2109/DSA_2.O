public class VerticalIsoscelesTriangleInverse {
    public static void main(String[] args) {
        int stars = 1;
        int spaces1 = 4;
        int maxStars = 5;
        int i = 1;
        while(i <= maxStars){
            for(int k = spaces1; k >= 1; k--){
                System.out.print("  ");
            }
            for(int y = 1; y <= stars; y++){
                System.out.print("* ");
            }
            System.out.println();
            i++;
            stars++;
            spaces1--;
        }
        int spaces2 = 1;
        int j = maxStars-1;
        while(j >= 1){
            for(int y = 1; y <= spaces2; y++){
                System.out.print("  ");
            }
            for(int k = j; k >= 1; k--){
                System.out.print("* ");
            }
            System.out.println();
            j--;
            spaces2++;
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
      * * * *
        * * *
          * *
            *
*/