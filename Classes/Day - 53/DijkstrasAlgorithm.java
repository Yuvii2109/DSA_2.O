import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
    public static class Edge {
        @SuppressWarnings("unused")
        int src, dest, weight;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    static void createGraph(List<List<Edge>> graph) {
        graph.get(0).add(new Edge(0, 1, 4));
        graph.get(0).add(new Edge(0, 2, 1));

        graph.get(1).add(new Edge(1, 3, 1));

        graph.get(2).add(new Edge(2, 3, 2));
        graph.get(2).add(new Edge(2, 4, 5));

        graph.get(3).add(new Edge(3, 4, 3));

        /*
            The graph structure is as follows -

                (4)
            0 ------> 1
            |         |
           (1)       (1)
            ↓   (2)   ↓
            2 ------> 3
             \       /
           (5)\     /(3)
               \   /
                ↘↙
                 4
        */
    }
    public static void dijkstraNaive(List<List<Edge>> graph, int src) {
        System.out.println("\nDijkstra's Algorithm (Naive Implementation) - ");
        int V = graph.size();
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for(int iter = 0; iter < V; iter++){
            int u = -1;
            for(int j = 0; j < V; j++){
                if(!visited[j] && (u == -1 || dist[j] < dist[u])){
                    u = j;
                }
            }

            // If there's no reachable unvisited vertex left, stop.
            if(u == -1 || dist[u] == Integer.MAX_VALUE) break;

            visited[u] = true;

            for(Edge e : graph.get(u)){
                if(!visited[e.dest] && dist[u] + e.weight < dist[e.dest]){
                    dist[e.dest] = dist[u] + e.weight;
                }
            }
        }

        System.out.println("Vertex\t - \tDistance from Source");
        for(int i = 0; i < V; i++){
            if(dist[i] == Integer.MAX_VALUE){
                System.out.println(i + "\t - \tINF");
            }else{
                System.out.println(i + "\t - \t" + dist[i]);
            }
        }
    }

    public static class Pairs implements Comparable<Pairs>{
        // Pairs stores a vertex and its current shortest distance from the source. It implements Comparable<Pairs> to enable priority queue sorting based on distance.
        @SuppressWarnings("unused")
                int vertex;
        int distance;
        public Pairs(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
        @Override
        public int compareTo(Pairs path) {
            return Integer.compare(this.distance, path.distance); // path based sorting for the pairs
        }
    }
    public static void dijkstraOptimized(List<List<Edge>> graph, int src) {
        // Placeholder for optimized Dijkstra's implementation using a priority queue.
        // This method can be implemented similarly to the naive version but using a min-heap for efficiency.
        int n = graph.size();
        int[] dist = new int[n];
        for(int i = 0; i < n; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        // distance[i] stores the shortest distance from source to vertex i. Initially, all distances are set to infinity (Integer.MAX_VALUE), except src, which is set to 0.

        boolean[] visited = new boolean[n];
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        pq.add(new Pairs(src, 0)); // add source to priority queue

        while(!pq.isEmpty()){
            Pairs currentPair = pq.poll();
            int currentVertex = currentPair.vertex;
            // Remove the vertex with the shortest known distance from pq. This ensures that we always process the closest vertex first.  Greedy Choice - This is why Dijkstra's Algorithm is greedy, it picks the nearest unprocessed node at each step.

            if(visited[currentVertex]){
                continue; // Skip if already visited
            }
            visited[currentVertex] = true;

            for(Edge e : graph.get(currentVertex)){
                if(!visited[e.dest] && dist[currentVertex] + e.weight < dist[e.dest]){
                    dist[e.dest] = dist[currentVertex] + e.weight;
                    pq.add(new Pairs(e.dest, dist[e.dest])); // Add updated distance to priority queue
                }
            }
        }
        System.out.println("\nDijkstra's Algorithm (Optimized with Priority Queue) - ");
        System.out.println("Vertex\t - \tDistance from Source");
        for(int i = 0; i < n; i++){
            if(dist[i] == Integer.MAX_VALUE){
                System.out.println(i + "\t - \tINF");
            }else{
                System.out.println(i + "\t - \t" + dist[i]);
            }
        }
    }
    public static void main(String[] args) {
        int vertices = 5;
        List<List<Edge>> graph = new ArrayList<>(vertices);
        // Initialize graph with empty lists
        for(int i = 0; i < vertices; i++){
            graph.add(new ArrayList<>());
        }
        createGraph(graph);
        dijkstraOptimized(graph, 0);
    }
}