public class StarDollarPattern {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        System.out.println("Method 1 - ");
        while(i < n){
            int j = n-2;
            int k = 0;
            while(j >= i){
                System.out.print("$ ");
                j--;
            }
            while(k <= i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println("\nMethod 2 - ");
        int row = 1; 
        while(row <= n){
            int col = 1;
            while(col <= n){
                if(col <= n-row){
                    System.out.print("$ ");
                }else{
                    System.out.print("* ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println("\nRelative Concept - ");
        // 1. Always observe the first row.
        // 2. Work for the first row.
        // 3. Work for the second row (Doosri row ko pehli row ki nazron se dekho).
        int y = 1;
        int numberOfStar = 1;
        int numberOfDollar = 4;
        while(y <= n){
            int k = 1;
            int r = 1;
            while(r <= numberOfDollar){
                System.out.print("$ ");
                r++;
            }
            while(k <= numberOfStar){
                System.out.print("* ");
                k++;
            }
            numberOfStar++;
            numberOfDollar--;
            System.out.println();
            y++;
        }
    }
}

/*
    Prints pattern - 

    $ $ $ $ * 
    $ $ $ * * 
    $ $ * * * 
    $ * * * * 
    * * * * * 
*/