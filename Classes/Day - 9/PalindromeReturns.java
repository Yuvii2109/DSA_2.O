public class PalindromeReturns {
    public static void main(String[] args) {
        int row = 1;
        int numberOfElements = 1;
        int numberOfSpaces = 9;
        while(row <= 10){
            int i = 1;
            while(i <= numberOfSpaces){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= numberOfElements){
                if(j <= numberOfElements/2){
                    System.out.print((numberOfSpaces+j) + " ");
                }else if(j == (numberOfElements/2+1)){
                    System.out.print("0 "); 
                }else{
                    System.out.print("");
                }
                j++;
            }
            int k = 1, number = 9;
            while(k < row){
                System.out.print(number + " ");
                number--;
                k++;
            }
            System.out.println();
            row++;
            numberOfElements += 2;
            numberOfSpaces--;
        }
    }
}

/*
    Output -
    
                      0 
                    9 0 9 
                  8 9 0 9 8 
                7 8 9 0 9 8 7 
              6 7 8 9 0 9 8 7 6
            5 6 7 8 9 0 9 8 7 6 5 
          4 5 6 7 8 9 0 9 8 7 6 5 4
        3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
      2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
    1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 
*/