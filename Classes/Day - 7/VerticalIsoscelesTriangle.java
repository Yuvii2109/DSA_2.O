public class VerticalIsoscelesTriangle {
    public static void main(String[] args) {
        int stars = 1;
        int spaces1 = 4;
        int maxStars = 5;
        int i = 1;
        while(i <= maxStars){
            for(int j = 1; j <= stars; j++){
                System.out.print("* ");
            }
            for(int k = 1; k <= spaces1; k++){
                System.out.print("  ");
            }
            System.out.println();
            i++;
            stars++;
            spaces1--;
        }
        int j = maxStars-1;
        int spaces2 = 1;
        while(j >= 1){
            for(int k = 1; k <= j; k++){
                System.out.print("* ");
            }
            for(int y = 1; y <= spaces2; y++){
                System.out.print("  ");
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