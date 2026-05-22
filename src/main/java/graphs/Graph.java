package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<>();
    private int noOfVertices;
    public void addVertex(int vertex) {
        ArrayList<Integer> adjList = adjacencyList.get(vertex);
        if (adjList == null) { // if the vertex was previously not added
            adjacencyList.put(vertex, new ArrayList<>());
            noOfVertices++;
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        addVertex(vertex1);
        addVertex(vertex2);
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    public void printGraph() {
        for (Integer vertex : adjacencyList.keySet()) {
            System.out.println(vertex + " --> " + adjacencyList.get(vertex));
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(3,4);

        System.out.println("Number of vertices : " + graph.noOfVertices);
        graph.printGraph();
    }
}
