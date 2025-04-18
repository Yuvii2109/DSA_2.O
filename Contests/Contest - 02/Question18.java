/*
    Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.

    Input Format - Constraints - 0 < N <= 1000000000, sb and db <= 10
    Output Format - 
        Sample Input - 
            8
            2 
            33
        Sample Output - 11011
        Explanation - All input output is as integers and in separate lines.
*/

import java.util.Scanner;

public class Question18 {
    public static int convertToDecimal(int sn, int sb){
        int decimal = 0;
        int placeValue = 1;
        while(sn != 0){
            int rem = sn%10;
            decimal += placeValue*rem;
            placeValue *= sb;
            sn /= 10;
        }
        return decimal;
    }
    public static int convertToDestination(int dec, int db){
        int number = 0;
        int placeValue = 1;
        while(dec != 0){
            int rem = dec%db;
            number += placeValue*rem;
            placeValue *= 10;
            dec /= db;
        }
        return number;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int sourceBase = sc.nextInt();
            int destinationBase = sc.nextInt();
            int sourceNumber = sc.nextInt();
            int destinationNumber;
            if(sourceBase == 10){
                destinationNumber = convertToDestination(sourceNumber, destinationBase);
            }else{
                int toDecimal = convertToDecimal(sourceNumber, sourceBase);
                destinationNumber = convertToDestination(toDecimal, destinationBase);
            }
            System.out.println(destinationNumber);
        }
    }
}