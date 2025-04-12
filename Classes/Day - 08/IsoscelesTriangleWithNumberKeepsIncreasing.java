public class IsoscelesTriangleWithNumberKeepsIncreasing {
    public static void main(String[] args) {
        int row = 1;
        int number = 1;
        int numberOfNumbers = 1;
        int numberOfSpaces = 4;
        while(row <= 5){
            int j = 1;
            while(j <= numberOfSpaces){
                System.out.print("  ");
                j++;
            }
            int i = 1;
            while(i <= numberOfNumbers){
                System.out.print(number + " ");
                number++;
                i++;
            }
            row++;
            System.out.println();
            numberOfNumbers += 2;
            numberOfSpaces--;
        }
    }
}

/*
    Output -

                1 
              2 3 4
            5 6 7 8 9
       10 11 12 13 14 15 16
    17 18 19 20 21 22 23 24 25
*/