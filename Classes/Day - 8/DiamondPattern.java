public class DiamondPattern {
    public static void main(String[] args) {
        int row = 1;
        int numberOfSpaces = 3;
        int numberOfStars = 1;
        while(row <= 7){
            int x = 1, y = 0;
            while(y < numberOfSpaces){
                System.out.print("  ");
                y++;
            }
            while(x <= numberOfStars){
                System.out.print("* ");
                x++;
            }
            if(row < 4){
                numberOfStars += 2;
                numberOfSpaces--;
            }else{
                numberOfSpaces++;
                numberOfStars -= 2;
            }
            row++;
            System.out.println();
        }
    }
}

/*
    Output -

          * 
        * * * 
      * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 
*/