public class HollowDiamond {
    public static void main(String[] args) {
        int numberOfSpacesBefore = 2, numberOfSpacesAfter = 1;
        int numberOfStars = 1, row = 1;
        for(int i = 1; i <= 4; i++){
            if(i < 4){
                System.out.print("  ");
            }else{
                System.out.print("* ");
            }
        }
        System.out.println();
        while(row <= 5){
            int i = 1;
            while(i <= numberOfSpacesBefore){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= numberOfStars){
                System.out.print("* ");
                j++;
            }
            int k = 1;
            while(k <= numberOfSpacesAfter){
                System.out.print("  ");
                k++;
            }
            int l = 1;
            while(l <= numberOfStars){
                System.out.print("* ");
                l++;
            }
            if(row < 3){
                numberOfSpacesBefore--;
                numberOfSpacesAfter += 2;
            }else{
                numberOfSpacesAfter -= 2;
                numberOfSpacesBefore++;
            }
            System.out.println();
            row++;
        }
        for(int i = 1; i <= 4; i++){
            if(i < 4){
                System.out.print("  ");
            }else{
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}

/*
    Output -

          * 
        *   *
      *       *
    *           *
      *       *
        *   *
          *
*/