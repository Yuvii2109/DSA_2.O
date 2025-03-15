public class IsoscelesTriangle {
    public static void main(String[] args) {
        int spacesBefore = 4;
        int stars = 1;
        int i = 1;
        int n = 5;
        while(i <= n){
            for(int j = 1; j <= spacesBefore; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= stars; k++){
                System.out.print("* ");
            }
            System.out.println("");
            spacesBefore--;
            stars += 2;
            i++;
        }
    }
}

/*
    Output -

            * 
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
*/