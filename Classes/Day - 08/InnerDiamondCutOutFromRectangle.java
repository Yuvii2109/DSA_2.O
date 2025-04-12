public class InnerDiamondCutOutFromRectangle {
    public static void main(String[] args) {
        int row = 1;
        int numberOfSpaces = 1;
        int numberOfStars = 3;
        int x = 1, v = 1;
        while(x <= 7){
            System.out.print("* ");
            x++;
        }
        System.out.println();
        while(row <= 5){
            int w = 1, y = 1, z = 1;
            while(w <= numberOfStars){
                System.out.print("* ");
                w++;
            }
            while(y <= numberOfSpaces){
                System.out.print("  ");
                y++;
            }
            while(z <= numberOfStars){
                System.out.print("* ");
                z++;
            }
            if(row < 3){
                numberOfStars--;
                numberOfSpaces += 2;
            }else{
                numberOfSpaces -= 2;
                numberOfStars++;
            }
            row++;
            System.out.println();
        }
        while(v <= 7){
            System.out.print("* ");
            v++;
        }
    }
}

/*
    Output -

    * * * * * * * 
    * * *   * * *
    * *       * *
    *           *
    * *       * *
    * * *   * * *
    * * * * * * *
*/