import java.util.Scanner;

public class CountComponentsOfAGraph {
    public static void countComponents(int[][] adjMatrix){
        int vertices = adjMatrix.length;
        boolean[] visited = new boolean[vertices];
        int componentCount = 0;

        for(int v = 0; v < vertices; v++){
            if(!visited[v]){
                componentCount++;
                dfs(adjMatrix, v, visited);
            }
        }
        System.out.println(componentCount);
    }
    private static void dfs(int[][] adjMatrix, int curr, boolean[] visited){
        visited[curr] = true;

        for(int i = 0; i < adjMatrix.length; i++){
            if(adjMatrix[curr][i] == 1 && !visited[i]){
                dfs(adjMatrix, i, visited);
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
            System.out.println("\nNumber Of Components - ");
            countComponents(adjMatrix);
        }
    }
}