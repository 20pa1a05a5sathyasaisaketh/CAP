//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> a=new ArrayList<Integer>();
      lview(a, root);
      return a;
    }
    public void lview(ArrayList<Integer> a, Node node){
        Queue<Node> queue=new LinkedList<>();
        if(node==null){
            return;
        }
        queue.add(node);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> n=new ArrayList<>(); 
            for(int i=1; i<=size;i++){
                Node curr=queue.poll();
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
                n.add(curr.data);
            }
            a.add(n.get(0));
        }
    }
}
