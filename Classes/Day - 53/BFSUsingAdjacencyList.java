import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSUsingAdjacencyList {
    static void bfs(int[][] adjMatrix){
        int vertices = adjMatrix.length;
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.print(curr + " ");

            for(int i = 0; i < vertices; i++){
                if(adjMatrix[curr][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
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
            System.out.println("\nBreadth First Search in Graph - ");
            bfs(adjMatrix);
        }
    }
}