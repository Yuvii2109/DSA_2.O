import java.util.ArrayList;
import java.util.Scanner;

public class UsingArrayOfArrayList {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of edges - ");
            int edges = sc.nextInt();
            System.out.print("Enter number of vertices - ");
            int vertices = sc.nextInt();
            @SuppressWarnings("unchecked")
            ArrayList<Integer>[] adjList = (ArrayList<Integer>[]) new ArrayList[vertices];
            for(int i = 0; i < vertices; i++){
                adjList[i] = new ArrayList<>();
            }
            System.out.println("Enter edges (u v) - ");
            for(int i = 0; i < edges; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                adjList[u].add(v);
                adjList[v].add(u); // For undirected graph
            }
            System.out.println("Adjacency List Representation - ");
            for(int i = 0; i < vertices; i++){
                System.out.print(i + " -> ");
                for(int neighbor : adjList[i]){
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }
}