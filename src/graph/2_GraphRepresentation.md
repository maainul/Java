# Graph Representation

Graphs are commonly represented in two ways:

1. Adjacency Matrix
2. Adjacency List

# 1.Adjacency Matrix
```
The size of the matrix is VxV where V is the number of vertices in the graph 
and the value of an entry Aij is either 1 or 0 depending on 
whether there is an edge from vertex i to vertex j.
```
![3 GraphRepresentationAdjacentMatrix](https://user-images.githubusercontent.com/37740006/85916280-1c125480-b871-11ea-96e9-3357c401e5d6.jpg)
## Pros of adjacency matrix
```
1. The basic operations like adding an edge, removing an edge and checking whether 	
there is an edge from vertex i to vertex j are extremely time efficient, constant time operations.

2. If the graph is dense and the number of edges is large, adjacency matrix should be the first choice. 
Even if the graph and the adjacency matrix is sparse, 
we can represent it using data structures for sparse matrices.

3. The biggest advantage however, comes from the use of matrices. 
The recent advances in hardware enable us to perform even expensive matrix operations on the GPU.

4.By performing operations on the adjacent matrix, 
we can get important insights into the nature of the graph and the relationship between its vertices.
```
## Cons of adjacency matrix
```
1. The VxV space requirement of the adjacency matrix makes it a memory hog. 
Graphs out in the wild usually don't have too many connections and 
this is the major reason why adjacency lists are the better choice for most tasks.

2. While basic operations are easy, 
operations like inEdges and outEdges are expensive when using the adjacency matrix representation.
```
## Adjacency Matrix representation in Java
```.java
public class Graph {
  private boolean adjMatrix[][];
  private int numVertices;

  // Initialize the matrix
  public Graph(int numVertices) {
    this.numVertices = numVertices;
    adjMatrix = new boolean[numVertices][numVertices];
  }

  // Add edges
  public void addEdge(int i, int j) {
    adjMatrix[i][j] = true;
    adjMatrix[j][i] = true;
  }

  // Remove edges
  public void removeEdge(int i, int j) {
    adjMatrix[i][j] = false;
    adjMatrix[j][i] = false;
  }

  // Print the matrix
  public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < numVertices; i++) {
      s.append(i + ": ");
      for (boolean j : adjMatrix[i]) {
        s.append((j ? 1 : 0) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);

    System.out.print(g.toString());
  }
}
```
# 2. Adjacency List
```
An adjacency list represents a graph as an array of linked lists.

The index of the array represents a vertex and each element in its linked list 
represents the other vertices that form an edge with the vertex.
```
![4 GraphRepresentationAdjacentList](https://user-images.githubusercontent.com/37740006/85918003-c9d92f80-b880-11ea-9417-a937584ab639.jpg)

## Adjacency List Java
We use Java Collections to store the Array of Linked Lists.
```.java
class Graph
{
    private int numVertices;
    private LinkedList<integer> adjLists[];
}
```
```
The type of LinkedList is determined by what data you want to store in it. 
For a labeled graph, you could store a dictionary instead of an Integer
```

## Adjascency List representation in Java
```.java
import java.util.*;

class Graph {

  // Add edge
  static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }

  public static void main(String[] args) {

    // Create the graph
    int V = 5;
    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      am.add(new ArrayList<Integer>());

    // Add edges
    addEdge(am, 0, 1);
    addEdge(am, 0, 2);
    addEdge(am, 0, 3);
    addEdge(am, 1, 2);

    printGraph(am);
  }

  // Print the graph
  static void printGraph(ArrayList<ArrayList<Integer>> am) {
    for (int i = 0; i < am.size(); i++) {
      System.out.println("\nVertex " + i + ":");
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print(" -> " + am.get(i).get(j));
      }
      System.out.println();
    }
  }
}
```
