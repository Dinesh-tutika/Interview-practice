class Graph{
    static int graph[][];
    Graph(int v){
        graph=new int[v][v];
    }
    void addEdge(int s,int e,int w){
        graph[s][e]=w;
        graph[e][s]=w;
    }
    void display(){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class Graph1 {
    public static void main(String[] args) {
        Graph ob=new Graph(5);
        ob.addEdge(0, 1,5);
        ob.addEdge(0, 2,3);
        ob.addEdge(1, 3,6);
        ob.addEdge(1, 4,7);
        ob.addEdge(2, 3,2);
        ob.addEdge(3, 4,1);
        ob.display();
    }
}
