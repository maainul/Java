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
## Complexity
```
Time Complexity is O(1).
Space Complexity is O(n*n).
```

## Pros of adjacency matrix
```
1. The basic operations like adding an edge, removing an edge and checking whether 	
there is an edge from vertex i to vertex j are extremely time efficient, constant time operations.

2. If the graph is dense and the number of edges is large, 
adjacency matrix should be the first choice. 
Even if the graph and the adjacency matrix is sparse, 
we can represent it using data structures for sparse matrices.

3. The biggest advantage however, comes from the use of matrices.The recent advances
in hardware enable us to perform even expensive matrix operations on the GPU.

4.By performing operations on the adjacent matrix,we can get important insights 
into the nature of the graph and the relationship between its vertices.
```
## Cons of adjacency matrix
```
1. The VxV space requirement of the adjacency matrix makes it a memory hog. 
Graphs out in the wild usually don't have too many connections and 
this is the major reason why adjacency lists are the better choice for most tasks.

2. While basic operations are easy,operations like 
inEdges and outEdges are expensive when using the adjacency matrix representation.
```
## Adjacency Matrix representation in Java
```.java
package graph._1_AdjacencyMatrixOfUndirectedGraph;

public class Graph {

	int[][] adjMatrix;
	int nodes;

	public Graph(int nodes) {
		this.nodes = nodes;
		this.adjMatrix = new int[nodes][nodes];
	}

	private void addEdge(int i, int j) {
		this.adjMatrix[i][j] = 1;
		this.adjMatrix[j][i] = 1;

	}

	private void removeEdge(int i, int j) {
		this.adjMatrix[i][j] = 0;
		this.adjMatrix[j][i] = 0;

	}

	public void printGraph() {
		System.out.println("Graph: (Adjacency Matrix)");
		for (int i = 0; i < nodes; i++) {
			for (int j = 0; j < nodes; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < nodes; i++) {
			System.out.print("Vertex " + i + " is connected to:");
			for (int j = 0; j < nodes; j++) {
				if (adjMatrix[i][j] == 1) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

	public static void rotateDigit(String[] agrs) {
		Graph obj = new Graph(4);
		obj.addEdge(0, 1);
		obj.addEdge(1, 2);
		obj.addEdge(2, 3);
		obj.addEdge(3, 0);
		obj.printGraph();

	}

}
```
```.java
Graph: (Adjacency Matrix)
0 1 0 1 
1 0 1 0 
0 1 0 1 
1 0 1 0 
Vertex 0 is connected to:1 3 
Vertex 1 is connected to:0 2 
Vertex 2 is connected to:1 3 
Vertex 3 is connected to:0 2 
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
## Complexity
```
Time Complexity is O(|v| + |E|).
Space Complexity is O(|v| + |E|).).
```


## Adjacency List representation in Java

### Linked List Representation
```.java

package graph._2_AdjacencyListOfUndirectedGraphLinkedListImplementation;

import java.util.LinkedList;

public class Graph {

	int vertex;
	LinkedList<Integer> list[];

	public Graph(int vertex) {
		this.vertex = vertex;
		list = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			list[i] = new LinkedList<>();
		}
	}

	private void addEdge(int i, int j) {
		list[i].addFirst(j);
		list[j].addFirst(i);

	}
	private void printGraph() {
		for (int i = 0; i < vertex; i++) {
			if (list[i].size() > 0) {
				System.out.print("Vertex " + i + " is connected to: ");
				for (int j = 0; j < list[i].size(); j++) {
					System.out.print(list[i].get(j) + " ");
				}
				System.out.println();
			}
		}
	}



	public static void rotateDigit(String[] args) {
		Graph graph = new Graph(5);

		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
	}
}
```

```.java
Vertex 0 is connected to: 4 1 
Vertex 1 is connected to: 4 3 2 0 
Vertex 2 is connected to: 3 1 
Vertex 3 is connected to: 4 2 1 
Vertex 4 is connected to: 3
```
### ArrayList Representation

```.java
package graph._2_AdjacencyListOfUndirectedGraphArrayImplementation;

import java.util.*;

public class Graph {
	int vertex;
	ArrayList<ArrayList<Integer>> am;

	public Graph(int vertex) {
		this.vertex = vertex;
		am = new ArrayList<ArrayList<Integer>>(vertex);
		for (int i = 0; i < vertex; i++) {
			am.add(new ArrayList<Integer>());
		}
	}

	// Add edge
	public void addEdge(int s, int d) {
		am.get(s).add(d);
		am.get(d).add(s);
	}

	// Print the graph
	public void printGraph() {
		for (int i = 0; i < am.size(); i++) {
			System.out.println("\nVertex " + i + ":");
			for (int j = 0; j < am.get(i).size(); j++) {
				System.out.print(" -> " + am.get(i).get(j));
			}
			System.out.println();
		}
	}

	public static void rotateDigit(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
	}

}
```
```.java
Vertex 0:
 -> 1 -> 4

Vertex 1:
 -> 0 -> 2 -> 3 -> 4

Vertex 2:
 -> 1 -> 3

Vertex 3:
 -> 1 -> 2 -> 4

Vertex 4:
 -> 0 -> 1 -> 3
```
### Other ArrayList Representation

```.java
import java.util.*;

class Graph {

  // Add edge
  static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }

  public static void rotateDigit(String[] args) {

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
