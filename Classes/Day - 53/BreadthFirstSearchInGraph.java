import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchInGraph {
    public static class Edge{
        @SuppressWarnings("unused")
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    static void createGraph(List<List<Edge>> graph){
        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));

        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 3));

        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 4));

        graph.get(3).add(new Edge(3, 1));
        graph.get(3).add(new Edge(3, 5));

        graph.get(4).add(new Edge(4, 2));
        graph.get(4).add(new Edge(4, 5));

        graph.get(5).add(new Edge(5, 3));
        graph.get(5).add(new Edge(5, 4));
        graph.get(5).add(new Edge(5, 6));

        graph.get(6).add(new Edge(6, 5));

        /*
            The graph structure is as follows -

                0
               / \
              1   2
              |   |
              3---4
               \ /
                5
                |
                6
        */
    }
    public static void bfs(List<List<Edge>> graph){
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.print(curr + " ");
            for(Edge e : graph.get(curr)){
                if (!visited[e.dest]) {
                    visited[e.dest] = true;
                    queue.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int vertices = 7;
        List<List<Edge>> graph = new ArrayList<>(vertices);

        // Important - add empty lists so graph.get(i) is valid
        for(int i = 0; i < vertices; i++){
            graph.add(new ArrayList<>());
        }
        createGraph(graph);
        System.out.println("Breadth First Search in Graph - ");  
        bfs(graph);      
    }
}