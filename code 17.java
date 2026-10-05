class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
    int dfs(TreeNode root,int n){
        if(root==null) return 0;
        n=n*2+root.val;
        if(root.left==null && root.right==null) return n;
        return dfs(root.left,n)+dfs(root.right,n);
    }
    }
