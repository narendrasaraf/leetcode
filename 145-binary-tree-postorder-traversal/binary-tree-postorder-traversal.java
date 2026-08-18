class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        postorder(root,ans);
        return ans;
    }
    void postorder(TreeNode Node,List<Integer>ans) {
        if(Node==null) return;
        postorder(Node.left,ans);
        postorder(Node.right,ans);
        ans.add(Node.val);
    }
}