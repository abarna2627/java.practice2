class Solution {
    public int maxDepth(Node root) {
      if(root == null) return 0;
      int max=0;
      for(Node X:root.children)
      max=Math.max(max,maxDepth(X));
      return max+1;  
    }
}