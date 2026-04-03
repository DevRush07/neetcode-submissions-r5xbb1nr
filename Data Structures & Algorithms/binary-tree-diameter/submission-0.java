class Solution {
    int d=0;
    public int diameterOfBinaryTree(TreeNode r){
        f(r); return d;
    }
    int f(TreeNode n){
        if(n==null) return 0;
        int l=f(n.left), r=f(n.right);
        d=Math.max(d,l+r);
        return 1+Math.max(l,r);
    }
}