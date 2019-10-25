package graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int MAX_VERTS=20;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int nVerts;
    private Queue<Integer> queue;

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        queue = new LinkedList<>();
        nVerts=0;
    }

    public void addVertex(char label){
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v){
        System.out.println(vertexList[v].getLabel());
    }

    public int getAdjUnvistedVertex(int v){
        for(int j=0; j<nVerts; j++){
            if(adjMat[v][j] == 1 && vertexList[j].isVisited() == false){
                return j;
            }
        }
        return -1;
    }

    public void bfs(){
        vertexList[0].setVisited(true);
        queue.add(0);
        displayVertex(0);
        int v2;
        while (!queue.isEmpty()){
            int v1 = queue.remove();
            while ((v2=getAdjUnvistedVertex(v1)) != -1){
                vertexList[v2].setVisited(true);
                displayVertex(v2);
                queue.add(v2);
            }
        }
    }
}
