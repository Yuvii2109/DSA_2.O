public class SpaceIncreasingByTwoDoubleReverse {
    public static void main(String[] args) {
        int numberOfSpaces = 4;
        int numberOfStars = 5;
        int row = 1;
        while(row <= 9){
            int x = 1, y = 0;
            while(y < numberOfSpaces){
                System.out.print("  ");
                y++;
            }
            while(x <= numberOfStars){
                System.out.print("* ");
                x++;
            }
            if(row < 5){
                numberOfSpaces--;
                numberOfStars--;
            }else{
                numberOfSpaces++;
                numberOfStars++;
            }
            row++;
            System.out.println();
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
      * *
        * * *
          * * * *
            * * * * *
*/