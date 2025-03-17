public class PalindromePattern2 {
    public static void main(String[] args) {
        int row = 1;
        int numberOfSpaces = 4;
        int centralNumber = 1;
        while(row <= 5){
            int j = 1;
            while(j <= numberOfSpaces){
                System.out.print("  ");
                j++;
            }
            int i = row;
            int number = row;
            while(i <= centralNumber){
                System.out.print(number + " ");
                number++;
                i++;
            }
            int k = centralNumber-1;
            while(k >= row){
                System.out.print(k + " ");
                k--;
            }
            row++;
            number++;
            System.out.println();
            numberOfSpaces--;
            centralNumber += 2;
        }
    }
}

/*
    Output -

            1 
          2 3 2
        3 4 5 4 3 
      4 5 6 7 6 5 4
    5 6 7 8 9 8 7 6 5
*/