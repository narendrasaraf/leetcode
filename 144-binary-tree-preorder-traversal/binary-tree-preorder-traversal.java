/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Optimal 

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
        if(root==null) return ans;
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode curr=s.pop();
            if(curr.right!=null) s.push(curr.right);
            if(curr.left!=null) s.push(curr.left);
            ans.add(curr.val);
        }
    return ans;
    }
}

// Recursive ----> possinility of stack overflow
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer>ans=new ArrayList<>();
//         preorder(root,ans);
//         return ans;
//     }
//     public void preorder(TreeNode root,List<Integer>ans) {
//         if(root==null) return;
//         ans.add(root.val);
//         preorder(root.left,ans);
//         preorder(root.right,ans);
//     }
// }