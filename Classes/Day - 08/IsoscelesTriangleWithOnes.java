public class IsoscelesTriangleWithOnes {
    public static void main(String[] args) {
        int numberOfSpaces = 4;
        int numberOfOnes = 1;
        int row = 1;
        while(row <= 5){
            int i = 1;
            while(i <= numberOfSpaces){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= numberOfOnes){
                System.out.print("1 ");
                j++;
            }
            System.out.println();
            numberOfSpaces--;
            numberOfOnes += 2;
            row++;
        }
    }
}

/*
    Output -
    
            1 
          1 1 1
        1 1 1 1 1
      1 1 1 1 1 1 1
    1 1 1 1 1 1 1 1 1
*/