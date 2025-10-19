import java.util.Scanner;

public class EdgeListGraphs {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int edges = sc.nextInt();

            int[][] edgeList = new int[edges][2];

            for(int i = 0; i < edges; i++){
                edgeList[i][0] = sc.nextInt();
                edgeList[i][1] = sc.nextInt();
            }

            System.out.println("Edge List Representation -");
            for(int i = 0; i < edges; i++){
                System.out.println(edgeList[i][0] + " - " + edgeList[i][1]);
            }
        }
    }
    
}