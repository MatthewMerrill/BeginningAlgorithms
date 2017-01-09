import java.util.*;

/**
 * Created by merrillm on 12/27/16.
 */
class MinimumCost {
    
    public static class Node {
        public int id;
        public List<Edge> edges = new ArrayList<>();
        public int runningCost = -1;
        
        public Node(int id) {
            this.id = id;
        }
    }
    
    public static class Edge {
        public Node from;
        public Node to;
        public int cost;
        
        public Edge(Node from, Node to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
    
    /*
    6 8
    6 1 20
    6 3 5
    3 4 2
    4 1 1
    1 4 1
    1 2 1
    2 5 10
    4 5 40
    6 5
    
    >> We expect: 19
    
    
    6 8
    6 1 95
    6 3 42
    3 4 100
    4 1 84
    1 4 40
    1 2 72
    2 5 76
    4 5 35
    6 5
    
    >> We expect: 170
    
     */
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        // Number of Nodes
        int N = scn.nextInt();
        // Number of Edges
        int E = scn.nextInt();
    
        Node[] nodes = new Node[N];
        for (int n = 0; n < N; n++) {
            nodes[n] = new Node(n);
        }
    
        for (int i = 0; i < E; i++) {
            // Read in from
            int from = scn.nextInt()-1;
            // Read in to
            int to = scn.nextInt()-1;
            // Read in cost
            int cost = scn.nextInt();
        
            Edge edge = new Edge(nodes[from], nodes[to], cost);
            nodes[from].edges.add(edge);
        }
    
        Node startingNode = nodes[scn.nextInt()-1];
        Node endingNode = nodes[scn.nextInt()-1];
        
        System.out.println(minimumCost(startingNode, endingNode));
    }
    
    public static int minimumCost(Node from, Node to) {
        ArrayList<Node> queue = new ArrayList<>();
        queue.add(from);
        from.runningCost = 0;
        
        while (!queue.isEmpty()) {
            Node current = queue.remove(0);
            
            if (current.id == to.id) {
                return current.runningCost;
            }
            
            List<Edge> edgesToConsider = current.edges;
            for (Edge edge : edgesToConsider) {
                Node next = edge.to;
                
                if (next.runningCost == -1 ||
                        (current.runningCost + edge.cost) < next.runningCost) {
                    
                    next.runningCost = current.runningCost + edge.cost;
                    queue.add(next);
                }
            }
            Collections.sort(queue, Comparator.comparingInt((Node node) -> node.runningCost));
        }
        
        return -1;
    }
    
}
