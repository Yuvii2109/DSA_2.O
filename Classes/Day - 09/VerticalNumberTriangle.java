public class VerticalNumberTriangle {
    public static void main(String[] args) {
        int row = 1, number = 1;
        int numberOfElements = 1;
        while(row <= 9){
            int i = 1;
            while(i <= numberOfElements){
                if(i%2 != 0){
                    System.out.print(number + " ");
                }else{
                    System.out.print("* ");
                }
                i++;
            }
            System.out.println();
            row++;
            if(row <= 5){
                number++;
                numberOfElements += 2;
            }else{
                number--;
                numberOfElements -= 2;
            }
        }
    }
}

/*
    Output -

    1 
    2 * 2
    3 * 3 * 3
    4 * 4 * 4 * 4
    5 * 5 * 5 * 5 * 5
    4 * 4 * 4 * 4
    3 * 3 * 3
    2 * 2 
    1
*/