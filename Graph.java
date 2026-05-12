public class Main {
    public static void main(String[] args) {
        int V = 4;
        // Adjacency Matrix for K4
        int[][] adjMatrix = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i != j) {
                    adjMatrix[i][j] = 1;
                }
            }
        }
        
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Adjacency List for K4
        java.util.List<Integer>[] adjList = new java.util.ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new java.util.ArrayList<>();
            for (int j = 0; j < V; j++) {
                if (i != j) {
                    adjList[i].add(j);
                }
            }
        }
        
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + adjList[i]);
        }
    }
}
