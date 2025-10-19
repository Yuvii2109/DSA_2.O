import java.util.Scanner;

public class CountNodesInComponents {
    public static int dfs(boolean[][] graph, boolean[] visited, int node) {
        visited[node] = true;
        int count = 1; // Count the current node
        for(int neighbor = 0; neighbor < graph.length; neighbor++) {
            if(graph[node][neighbor] && !visited[neighbor]) {
                count += dfs(graph, visited, neighbor);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean[][] graph = new boolean[n][n];
            for(int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph[u][v] = true;
                graph[v][u] = true;
            }
            boolean[] visited = new boolean[n];
            for(int i = 0; i < n; i++) {
                if(!visited[i]) {
                    int count = dfs(graph, visited, i);
                    System.out.println("Component starting at node " + i + " has " + count + " nodes.");
                }
            }
        }
    }
}