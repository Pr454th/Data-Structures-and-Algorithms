//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class mColoringProblem{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] Nnodes=new int[n];
        return solve(0,graph,m,n,Nnodes);
    }
    boolean solve(int node,boolean[][] graph,int m,int n,int[] nodes){
        if(node==n) return true;
        for(int c=1;c<=m;c++){
            if(isSafe(node,c,n,graph,nodes)){
                nodes[node]=c;
                if(solve(node+1,graph,m,n,nodes)) return true;
                nodes[node]=0;
            }
        }
        return false;
    }
    boolean isSafe(int node,int color,int n,boolean[][] graph,int[] nodes){
        for(int i=0;i<n;i++){
            if(graph[node][i] && nodes[i]==color){
                return false;
            }
        }
        return true;
    }
}