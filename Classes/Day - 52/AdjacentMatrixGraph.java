import java.util.Scanner;

public class AdjacentMatrixGraph {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of vertices - ");
            int vertices = sc.nextInt();

            System.out.print("Enter number of edges - ");
            int edges = sc.nextInt();

            int[][] adjMatrix = new int[vertices][vertices];

            for(int i = 0; i < edges; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();

                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }

            System.out.println("Adjacency Matrix Representation -");
            for(int i = 0; i < vertices; i++){
                for(int j = 0; j < vertices; j++){
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}