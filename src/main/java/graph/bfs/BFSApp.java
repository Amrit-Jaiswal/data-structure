package graph.bfs;

public class BFSApp {
    public static void main(String args[]){
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(1,4);
        graph.addEdge(4,5);

        System.out.println("Visited");
        graph.bfs();
    }
}
