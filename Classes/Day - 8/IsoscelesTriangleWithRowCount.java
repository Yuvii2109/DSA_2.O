public class IsoscelesTriangleWithRowCount {
    public static void main(String[] args) {
        int row = 1;
        int numberOfSpaces = 4;
        int numberOfNumbers = 1;
        int number = 1;
        while(row <= 5){
            int i = 1;
            while(i <= numberOfSpaces){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= numberOfNumbers){
                System.out.print(number + " ");
                j++;
            }
            numberOfSpaces--;
            numberOfNumbers += 2;
            number++;
            System.out.println();
            row++;
        }
    }
}

/*
    Output -

            1 
          2 2 2
        3 3 3 3 3
      4 4 4 4 4 4 4
    5 5 5 5 5 5 5 5 5
*/