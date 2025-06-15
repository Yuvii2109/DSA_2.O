public class RotateANumber {
    public static int findLength(int num){
        int length = 0;
        while(num != 0){
            length++;
            num /= 10;
        }
        return length;
    }
    public static int rotate(int num, int k){
        int result = 0;
        int numLength = findLength(num);
        if(k < 0){
            k += numLength;
        }
        k %= numLength;
        int part1 = (int) (num % Math.pow(10, k));
        int part2 = (int) (num / Math.pow(10, k));
        result = (int) (part1 * Math.pow(10, numLength-k) + part2);
        return result;
    }
    public static void main(String[] args) {
        int num = -25416;
        int k = -3;
        int rotatedNum = rotate(num, k);
        System.out.println("Rotated Number is - " + rotatedNum);
    }
}