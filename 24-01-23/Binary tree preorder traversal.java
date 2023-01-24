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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        preord(a,root);
        return a;
    }
    public void preord(ArrayList<Integer> a,TreeNode node){
        if(node==null){
            return;
        }
        a.add(node.val);
        preord(a,node.left);
        preord(a,node.right);
    }
}
