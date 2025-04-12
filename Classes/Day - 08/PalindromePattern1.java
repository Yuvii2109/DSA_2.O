public class PalindromePattern1 {
    public static void main(String[] args) {
        int row = 1;
        int numberOfSpaces = 4;
        while(row <= 5){
            int j = 1;
            while(j <= numberOfSpaces){
                System.out.print("  ");
                j++;
            }
            int i = 1;
            int centralNumber = row;
            while(i <= centralNumber){
                System.out.print(i + " ");
                i++;
            }
            int k = centralNumber-1;
            while(k >= 1){
                System.out.print(k + " ");
                k--;
            }
            row++;
            System.out.println();
            numberOfSpaces--;
        }
    }
}

/*
    Output -

            1 
          1 2 1
        1 2 3 2 1
      1 2 3 4 3 2 1
    1 2 3 4 5 4 3 2 1
*/