   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */

void LevelOrder(Node root){
    //Write your code here
    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    q.offer(null);
    while(!q.isEmpty()){
        Node temp = q.poll();
        if (temp != null){
            System.out.print(temp.data + " ");
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }else{
            if (!q.isEmpty())
                q.offer(null);
        }
    }         
}
