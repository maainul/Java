package Algrothims1._2_AdjacencyListOfUndirectedGraphArrayImplementation;

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
 * Vertex 0: -> 1 -> 4
 * 
 * Vertex 1: -> 0 -> 2 -> 3 -> 4
 * 
 * Vertex 2: -> 1 -> 3
 * 
 * Vertex 3: -> 1 -> 2 -> 4
 * 
 * Vertex 4: -> 0 -> 1 -> 3
 * 
 */