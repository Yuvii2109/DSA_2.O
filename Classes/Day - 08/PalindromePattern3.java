public class PalindromePattern3 {
    public static void main(String[] args) {
        int numberOfSpaces = 4;
        int row = 1;
        int numberOfNumbers = 1;
        while(row <= 5){
            int i = 1;
            while(i <= numberOfSpaces){
                System.out.print("  ");
                i++;
            }
            for(int j = 1; j <= numberOfNumbers; j++){
                if(j == 1 || j == numberOfNumbers){
                    System.out.print(row + " ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
            row++;
            numberOfNumbers += 2;
            numberOfSpaces--;
        }
    }
}

/*
    Output -

            1 
          2 0 2
        3 0 0 0 3
      4 0 0 0 0 0 4
    5 0 0 0 0 0 0 0 5
*/