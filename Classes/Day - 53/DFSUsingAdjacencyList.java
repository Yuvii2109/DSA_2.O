import java.util.Scanner;

public class DFSUsingAdjacencyList {
    static void dfs(int[][] adjMatrix){
        int vertices = adjMatrix.length;
        boolean[] visited = new boolean[vertices];
        dfsUtil(adjMatrix, 0, visited);
    }
    private static void dfsUtil(int[][] adjMatrix, int curr, boolean[] visited){
        visited[curr] = true;
        System.out.print(curr + " ");

        for(int i = 0; i < adjMatrix.length; i++){
            if(adjMatrix[curr][i] == 1 && !visited[i]){
                dfsUtil(adjMatrix, i, visited);
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

            System.out.println("\nDepth First Search in Graph - ");
            dfs(adjMatrix);
        }
    }
}