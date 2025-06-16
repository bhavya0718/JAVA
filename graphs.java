Graph:
1.Adjacency Matrix&Adjacency List:
import java.util.List;
import java.util.ArrayList;

public class Graph{
    private int vertices;
    private int[][] adjacencyMatrix;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices){
        this.vertices=vertices;
        adjacencyMatrix=new int[vertices][vertices];
        adjacencyList=new ArrayList<>(vertices);
        for(int i=0;i<vertices;i++){
            adjacencyList.add(new ArrayList<>());
        }
    }    

    public void addEdge(int src,int dst){
        
        adjacencyMatrix[src][dst]=1;
        adjacencyMatrix[dst][src]=1;

        adjacencyList.get(src).add(dst);
        adjacencyList.get(dst).add(src);
    }   

    public void printAdjacencyMatrix(){
        System.out.println("Adjacency Matrix is:");
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void printAdjacencyList(){
        System.out.println("Adjacency List is:");
        for(int i=0;i<vertices;i++){
            System.out.print(i +": ");
            for(int j:adjacencyList.get(i)){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        
        graph.printAdjacencyMatrix();
        graph.printAdjacencyList();
        
    }
}
output:
Adjacency Matrix is:
0 1 0 0 1 
1 0 1 1 1 
0 1 0 1 0 
0 1 1 0 1 
1 1 0 1 0 
Adjacency List is:
0: 1 4 
1: 0 2 3 4 
2: 1 3 
3: 1 2 4 
4: 0 1 3 
2.DFS:
import java.util.List;
import java.util.ArrayList;

public class Graph{
    private int vertices;
    private int[][] adjacencyMatrix;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices){
        this.vertices=vertices;
        adjacencyMatrix=new int[vertices][vertices];
        adjacencyList=new ArrayList<>(vertices);
        for(int i=0;i<vertices;i++){
            adjacencyList.add(new ArrayList<>());
        }
    }    

    public void addEdge(int src,int dst){
        
        adjacencyList.get(src).add(dst);
        adjacencyList.get(dst).add(src);
    }   
    private void dfsUtil(int vertex,boolean[] visited){
        visited[vertex]=true;
        System.out.println(vertex +" ");
        for(int adj:adjacencyList.get(vertex)){
            if(!visited[adj]){
                dfsUtil(adj,visited);
            }
        }
    }
       public void dfs(int startVertex) {
       boolean[] visited = new boolean[vertices];
       System.out.print("DFS traversal starting from vertex " + startVertex + ": ");
       dfsUtil(startVertex, visited);
       System.out.println();
   }
   

   
    public static void main(String[] args){
        
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.dfs(0);
        
        
        
    }
}
output:
DFS traversal starting from vertex 0: 
0 
1
2
3
4

