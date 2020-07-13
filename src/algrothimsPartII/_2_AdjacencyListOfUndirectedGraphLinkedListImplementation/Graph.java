package algrothimsPartII._2_AdjacencyListOfUndirectedGraphLinkedListImplementation;

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

	public static void main(String[] args) {
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

/*
 * 
 * Vertex 0 is connected to: 4 1
 * 
 * Vertex 1 is connected to: 4 3 2 0
 * 
 * Vertex 2 is connected to: 3 1
 * 
 * Vertex 3 is connected to: 4 2 1
 * 
 * Vertex 4 is connected to: 3 1 0
 * 
 */
