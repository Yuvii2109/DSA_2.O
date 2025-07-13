import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(21);
        al.add(23);
        al.add(16);
        al.add(19);
        al.add(5);
        int i = 0, j = al.size() - 1;
        while(i <= j){
            Integer temp1 = al.get(i);
            Integer temp2 = al.get(j);
            al.set(i, temp2);
            al.set(j, temp1);
            i++;
            j--;
        }
        System.out.println(al);
    }
}