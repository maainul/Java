package dataStructureAndAlgorithm.graph.bfs;

import java.util.ArrayList;

public class GraphMainSolution {

	// A utility function to add an edge in an
	// undirected graph
	private void addEdge(ArrayList<ArrayList<Integer>> arrayList, int i, int j) {
		arrayList.get(i).add(j);
		arrayList.get(j).add(i);
	}

	// A utility function to print the adjacency list
	// representation of graph
	private void printGraph(ArrayList<ArrayList<Integer>> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("\nAdjacency list of vertex " + i);
			System.out.print("head-->");
			for (int j = 0; j < arrayList.get(i).size(); j++) {

				System.out.print("-->" + arrayList.get(i).get(j));
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int vertex = 5;

		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < vertex; i++) {
			arrayList.add(new ArrayList<Integer>());
		}
		System.out.println(arrayList);

		GraphMainSolution graphMainSolution = new GraphMainSolution();

		graphMainSolution.addEdge(arrayList, 0, 1);
		graphMainSolution.addEdge(arrayList, 0, 4);
		graphMainSolution.addEdge(arrayList, 1, 2);
		graphMainSolution.addEdge(arrayList, 1, 3);
		graphMainSolution.addEdge(arrayList, 1, 4);
		graphMainSolution.addEdge(arrayList, 2, 3);
		graphMainSolution.addEdge(arrayList, 3, 4);

		graphMainSolution.printGraph(arrayList);
	}

}
/*
 * Adjacency list of vertex 0 head -> 1-> 4
 * 
 * Adjacency list of vertex 1 head -> 0-> 2-> 3-> 4
 * 
 * Adjacency list of vertex 2 head -> 1-> 3
 * 
 * Adjacency list of vertex 3 head -> 1-> 2-> 4
 * 
 * Adjacency list of vertex 4 head -> 0-> 1-> 3
 */
