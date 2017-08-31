package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class CloneGraph {
   public static GraphNode cloneGraph(GraphNode g) {
      if(g == null) {
         return null;
      }
      
      Map<GraphNode, GraphNode> nodeMap = new HashMap<>();
      Queue<GraphNode> bfsQ = new LinkedList<>();
      bfsQ.add(g);
      nodeMap.put(g, new GraphNode(g.data));
      while(!bfsQ.isEmpty()) {
         GraphNode v = bfsQ.remove();
         for(GraphNode t : v.edges) {
            if (!nodeMap.containsKey(t)) {
               nodeMap.put(t,new GraphNode(t.data));
               bfsQ.add(t);
            }
            nodeMap.get(v).edges.add(nodeMap.get(t));
         }
      }
      return nodeMap.get(g);
   }
}
