public class DiamondCutOutFromRectangle {
    public static void main(String[] args) {
        int row = 1;
        int numberOfSpaces = 1;
        int numberOfStars = 3;
        while(row <= 7){
            int x = 1, y = 1, z = 1;
            while(x <= numberOfStars){
                System.out.print("* ");
                x++;
            }
            while(y <= numberOfSpaces){
                System.out.print("  ");
                y++;
            }
            while(z <= numberOfStars){
                System.out.print("* ");
                z++;
            }
            if(row < 4){
                numberOfStars--;
                numberOfSpaces += 2;
            }else{
                numberOfSpaces -= 2;
                numberOfStars++;
            }
            row++;
            System.out.println();
        }
    }
}

/*
    Output -

    * * *   * * * 
    * *       * * 
    *           * 

    *           * 
    * *       * * 
    * * *   * * * 
*/