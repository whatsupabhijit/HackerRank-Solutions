/*
   class Node 
       int data;
       Node left;
       Node right;
*/

/* Root will have horizontal distance from midpoint as 0, and in left it will decrease by 1, 
   At right of root it will increase by 1.      -2 -1 0 1 2 like this.
   So if you store for each horiznotal distance -2,1,0,.... corresponding node's data 
   then later if you print the nodes for increasing key (horizontal distance) you will get topview
*/
class NodeWithHD{
    Node node;
    int hd;
    public NodeWithHD(Node n, int horizontalDist){
        node = n;
        hd = horizontalDist;
   }
}


void top_view(Node root){
    if (root == null)
        return;
    Map<Integer, Integer> topView = new HashMap<>();
    Queue<NodeWithHD> levelQ = new LinkedList<>();
    int minHD = 0, maxHD = 0;
    
    levelQ.offer(new NodeWithHD(root, 0));
    levelQ.offer(null);
    
    while(!levelQ.isEmpty()){
        /* i.e. if still in the same level */
        NodeWithHD tmp = levelQ.poll();
        if(tmp != null){             
            Node temp = tmp.node;
            int hd    = tmp.hd;
            if (hd < minHD)
                minHD = hd;
            if (hd > maxHD)
                maxHD = hd;
            
            /* if a new horizontal distance found, add it to the hasshet. so that we can print later */
            if (topView.get(hd) == null){
                topView.put(hd,temp.data);
            }
            
            /* normal level order traversal adding in queue */ 
            if (temp.left != null)
                levelQ.offer(new NodeWithHD(temp.left, hd - 1));
            if (temp.right != null)
                levelQ.offer(new NodeWithHD(temp.right, hd + 1));
        }else{
            if(!levelQ.isEmpty())
                levelQ.offer(null);
        }
    }

    for (Integer i = minHD; i <= maxHD; i++)
        System.out.print(topView.get(i) + " " );       

}
