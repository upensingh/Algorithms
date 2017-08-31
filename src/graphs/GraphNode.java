package graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
   int data;
   List<GraphNode> edges;
   
   public GraphNode(int data2) {
      // TODO Auto-generated constructor stub
      this.data = data2;
      edges = new ArrayList<>();
   }
}
