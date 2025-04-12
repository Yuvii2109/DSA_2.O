public class EquilateralTriangle {
    public static void main(String[] args) {
        int side = 5;
        int spacesBefore = 4;
        int i = 1;
        int stars = 1;
        while(i <= side){
            for(int j = 1; j <= spacesBefore; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= stars; k++){
                if(k%2 != 0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            spacesBefore--;
            stars += 2;
            i++;
        }
    }
}

/*
    Output -

            * 
          *   *
        *   *   *
      *   *   *   *
    *   *   *   *   *
*/