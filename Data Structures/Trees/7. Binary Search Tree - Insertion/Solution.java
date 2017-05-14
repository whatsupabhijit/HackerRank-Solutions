 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value){
    if (root == null){
        root = new Node();
        root.data = value;
        root.left = null;
        root.right = null;
    }else {
        if (value < root.data)
            root.left = Insert(root.left, value);
        if (value > root.data)
            root.right = Insert(root.right, value);
    }
    return root;
}