package dataStructureAndAlgorithm.graph._1_AdjacencyMatrixOfUndirectedGraph;

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

	public static void main(String[] agrs) {
		Graph obj = new Graph(4);
		obj.addEdge(0, 1);
		obj.addEdge(1, 2);
		obj.addEdge(2, 3);
		obj.addEdge(3, 0);
		obj.printGraph();
		obj.removeEdge(1, 2);
		obj.printGraph();

	}

}

/*
Graph: (Adjacency Matrix)

0 1 0 1 
1 0 1 0 
0 1 0 1 
1 0 1 0 

Vertex 0 is connected to:1 3 
Vertex 1 is connected to:0 2 
Vertex 2 is connected to:1 3 
Vertex 3 is connected to:0 2 
 
 
*/




