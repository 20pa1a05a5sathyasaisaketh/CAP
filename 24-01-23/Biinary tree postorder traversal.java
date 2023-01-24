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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> L=new ArrayList<Integer>();
        postord(L,root);
        return L;
    }
    public void postord(ArrayList<Integer> L,TreeNode node){
        if(node==null){
            return;
        }
        postord(L,node.left);
        postord(L,node.right);
        L.add(node.val);
    }
}
