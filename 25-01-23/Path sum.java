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
class Solution {
    public boolean rootToLeafPathSum(TreeNode root, int targetSum, int k){
        if(root==null)
            return false;
        if(root.left==null && root.right==null){
            k=k+root.val;
            if(k==targetSum)
                return true;   
        }
        return rootToLeafPathSum(root.left,targetSum,k+root.val) || rootToLeafPathSum(root.right,targetSum,k+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int k=0;
        return rootToLeafPathSum(root,targetSum, k);
    }
}
