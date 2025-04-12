public class StarExclamation {
    public static void main(String[] args) {
        int n = 5, i = 1;
        int stars = 1;
        int spaces = n - 1;
        while(i <= n){
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= stars; k++){
                if(k%2 != 0){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
            }
            System.out.println();
            i++;
            stars += 2;
            spaces--;
        }
    }
}

/*
    Output -

            * 
          * ! *
        * ! * ! *
      * ! * ! * ! *
    * ! * ! * ! * ! * 
*/