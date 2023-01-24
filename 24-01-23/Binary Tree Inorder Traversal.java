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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> L=new ArrayList<Integer>();
        inord(L,root);
        return L;
    }
    public void inord(ArrayList<Integer> L,TreeNode node){
        if(node==null){
            return;
        }
        inord(L,node.left);
        L.add(node.val);
        inord(L,node.right);
    }
}
