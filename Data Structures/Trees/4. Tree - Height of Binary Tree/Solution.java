	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	if (root == null)
            return -1;
        else{
            int left  = height(root.left);
            int right = height(root.right);
            
            return ((left > right) ? left + 1: right + 1);
        }
    }