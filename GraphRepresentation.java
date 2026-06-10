import java.util.ArrayList;

public class GraphRepresentation {

    public static void main(String[] args) {

        char[] vertices = {'A','B','C','D','E','F','G','H','I','J','K','L'};
        int n = vertices.length;

        
        int[][] matrix = new int[n][n];

   
        ArrayList<Character>[] list = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

       
        addEdge(matrix, list, vertices, 'A', 'B');
        addEdge(matrix, list, vertices, 'A', 'H');

        addEdge(matrix, list, vertices, 'B', 'C');
        addEdge(matrix, list, vertices, 'B', 'D');
        addEdge(matrix, list, vertices, 'B', 'K');

        addEdge(matrix, list, vertices, 'C', 'I');

        addEdge(matrix, list, vertices, 'D', 'E');
        addEdge(matrix, list, vertices, 'D', 'F');
        addEdge(matrix, list, vertices, 'D', 'H');
        addEdge(matrix, list, vertices, 'D', 'K');

        addEdge(matrix, list, vertices, 'E', 'G');

        addEdge(matrix, list, vertices, 'F', 'G');
        addEdge(matrix, list, vertices, 'F', 'I');

        addEdge(matrix, list, vertices, 'G', 'J');

        addEdge(matrix, list, vertices, 'I', 'J');
        addEdge(matrix, list, vertices, 'I', 'K');

        addEdge(matrix, list, vertices, 'H', 'L');

       
        System.out.println("Adjacency Matrix:");

        System.out.print("   ");
        for (char v : vertices) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + "  ");

            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("\nAdjacency List:");

        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + " -> ");

            for (char neighbour : list[i]) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }

    static void addEdge(int[][] matrix,
                        ArrayList<Character>[] list,
                        char[] vertices,
                        char u,
                        char v) {

        int i = indexOf(vertices, u);
        int j = indexOf(vertices, v);

        
        matrix[i][j] = 1;
        matrix[j][i] = 1;

        list[i].add(v);
        list[j].add(u);
    }

    static int indexOf(char[] vertices, char ch) {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}