public class InvertedIsoscelesTriangle {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int spacesBefore = 0;
        int stars = 9;
        while(i <= n){
            for(int j = 0; j < spacesBefore; j++){
                System.out.print("  ");
            }
            for(int k = 0; k < stars; k++){
                System.out.print("* ");
            }
            System.out.println();
            spacesBefore++;
            stars -= 2;
            i++;
        }
    }
}

/*
    Output -

    * * * * * * * * * 
      * * * * * * *
        * * * * *
          * * *
            *
*/