package algo;
import java.util.*;

public class 다익스트라 {

    public static void main(String[] args) {
    	
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},        //   0, 1, 4     //  0,  7, 8
            {4, 0, 8, 0, 0, 0, 0, 11, 0},       //   1, 2, 8     //  1,  7, 11
            {0, 8, 0, 7, 0, 4, 0, 0, 2},       //    2, 3, 7     //  2 , 5, 4     //  2,8,2
            {0, 0, 7, 0, 9, 14, 0, 0, 0},      //    3, 4, 9     //  3 , 5, 14  
            {0, 0, 0, 9, 0, 10, 0, 0, 0},      //    4, 5 , 10
            {0, 0, 4, 14, 10, 0, 2, 0, 0},     //    5, 6, 2
            {0, 0, 0, 0, 0, 2, 0, 1, 6},       //    6, 7, 1  //    6, 8, 6
            {8, 11, 0, 0, 0, 0, 1, 0, 7},      //    7, 8, 7
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        
        dijkstra(graph, 0);
    }

    public static void dijkstra(int[][] graph, int start) {
    	
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        
        //초기화
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        dist[start] = 0;

        for (int count = 0; count < V - 1; count++) {
        	//방문하지 않은것중에 가장 작은 값은 있는 순번
            int u = minDistance(dist, visited);
            visited[u] = true;
                                           // u -> v  ,   시작 -> 도착
            for (int v = 0; v < V; v++) {  // 0  1  2  3  4  5  6  7  8 
            	
            	//방문했거나  ,  0의 값을 가지고 있다면  패스
                if ( visited[v]  ||  graph[u][v] == 0  )
                	continue;                
                
                if( dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // 최단 경로 출력
        System.out.println("노드\t최단 거리");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t" + dist[i]);
        }
    }

    public static int minDistance(int[] dist, boolean[] visited) {
        int V = dist.length;
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
}

