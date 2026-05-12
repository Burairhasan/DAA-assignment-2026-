import java.util.*;

public class Main {
    private static void topologicalSortUtil(int v, List<List<Integer>> adj, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor, adj, visited, stack);
            }
        }
        stack.push(v);
    }

    public static void main(String[] args) {
        // Graph from assignment (vertices mapped: 0=m,1=n,... )
        int V = 14; // m to z
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        
        // Add edges based on the given graph (example mapping)
        // You can adjust indices as per your vertex mapping
        // For demonstration:
        adj.get(0).add(5); // m -> r etc. (full edges added in actual code)
        // ... (complete edges as per graph image)
        
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, adj, visited, stack);
            }
        }
        
        System.out.println("Topological Sort:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
