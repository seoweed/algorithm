import java.io.*;
import java.util.PriorityQueue;

public class Main {
    static int[] parent;
    static PriorityQueue<Edge> pq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int v = Integer.parseInt(str[0]);
        int E = Integer.parseInt(str[1]);
        parent = new int[v + 1];
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }
        pq = new PriorityQueue<>((x, y) -> {
            return x.w - y.w;
        });
        for (int i = 0; i < E; i++) {
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            Edge edge = new Edge(c, a, b);
            pq.add(edge);
        }

        int useEdge = 0;
        int result = 0;
        while (useEdge != (v - 1)) {
            Edge eg = pq.poll();
            int i = find(eg.s);
            int j = find(eg.e);
            if (i != j) {
                union(eg.s, eg.e);
                result += eg.w;
                useEdge++;
            }
        }
        System.out.println(result);
    }

    private static void union(int v, int e) {
        v = find(v);
        e = find(e);
        if (v != e) parent[e] = v;
    }

    private static int find(int v) {
        if (v == parent[v]) return v;
        return parent[v] = find(parent[v]);
    }

    private static class Edge {
        private int w;
        private int s;
        private int e;

        public Edge(int w, int s, int e) {
            this.w = w;
            this.s = s;
            this.e = e;
        }
    }
}