import java.io.*;
import java.util.*;

public class BFSShortestReach {
//	static boolean[][] adj; //[node][connection]
//	static int[] distance;
	static int length = 6;
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int queries = scan.nextInt();
		while(queries-->0){
			int nodes = scan.nextInt();
			int edges = scan.nextInt();
			boolean[][] adj = new boolean[nodes][nodes];
			for(int i = 0; i < edges; i++){
				int start = scan.nextInt()-1;
				int end = scan.nextInt()-1;
				adj[start][end] = true;
				adj[end][start] = true;
			}  //adjacency matrix now filled out.
			int[] distance = new int[nodes];
			for(int i = 0; i < distance.length; i++){
				distance[i] = -1;
			}
			int start = scan.nextInt();
			flood(start-1, 0, adj, distance);
			for(int i = 0; i < distance.length; i++){
				if(i != start-1){
					System.out.print(distance[i] + " ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
	
	/**
	 * Flood search the graph, stopping when hitting a node that was previously reached faster
	 * @param node current node
	 * @param dist distance traveled so far, in nodes
	 */
	static void flood(int node, int dist, boolean[][] adj, int[] distance){
		if(distance[node] < 0 || dist < distance[node]){ //not visited || visited it faster
			distance[node] = dist;
			for(int i = 0; i < adj[node].length; i++){
				if(adj[node][i]){
					flood(i, dist+length, adj, distance);
				}
			}
		}
	}

}
