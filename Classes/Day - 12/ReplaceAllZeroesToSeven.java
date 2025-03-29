public class ReplaceAllZeroesToSeven {
    public static void main(String[] args) {
        int n = 50030080;
        int replaced = 0;
        int temp = n;
        int placevalue = 1;
        while(temp != 0){
            int rem = temp%10;
            if(rem == 0){
                rem = 7;
            }
            replaced += rem*placevalue;
            placevalue *= 10;
            temp /= 10;
        }
        System.out.println(replaced);
    }
}