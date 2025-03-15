public class SpaceIncreasingByTwoDouble {
    public static void main(String[] args) {
        int stars = 5;
        int spacesAfter = 4;
        int spacesBefore = 0;
        int i = 1;
        while(i <= 5){
            int y = 0;
            while(y < spacesBefore){
                System.out.print("  ");
                y++;
            }
            int j = 1; 
            while(j <= stars){
                System.out.print("* ");
                j++;
            }
            int k = 1;
            while(k <= spacesAfter){
                System.out.print("  ");
                k++;
            }
            System.out.println();
            spacesBefore += 2;
            spacesAfter--;
            stars--;
            i++;
        }
        i = 5;
        spacesBefore = 6;
        spacesAfter++;
        stars = 2;
        while(i > 1){
            int y = 0;
            while(y < spacesBefore){
                System.out.print("  ");
                y++;
            }
            int k = 1;
            while(k <= stars){
                System.out.print("* ");
                k++;
            }
            int j = 1;
            while(j <= spacesAfter){
                System.out.print("  ");
                j++;
            }
            System.out.println();
            spacesBefore -= 2;
            spacesAfter++;
            stars++;
            i--;
        }
        System.out.println("\nSirji Method - ");
        int row = 1;
        int numberOfStars = 5;
        int numberOfSpaces = 0;
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
                numberOfSpaces += 2;
                numberOfStars--;
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