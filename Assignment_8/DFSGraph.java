import java.util.*;

public class DFSGraph {

    int vertices;
    LinkedList<Integer>[] adj;

    DFSGraph(int v) {

        vertices = v;

        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    void DFS(int node, boolean visited[]) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbor : adj[node]) {

            if (!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        DFSGraph g = new DFSGraph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        boolean visited[] = new boolean[5];

        System.out.println("DFS Traversal:");

        g.DFS(0, visited);
    }
}