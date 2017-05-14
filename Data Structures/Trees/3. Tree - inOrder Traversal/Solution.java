/* Morris In Order traversal without stack/queue */

void inOrder(Node root) {
        Node curr, prev;
        if (root != null){		
			curr = root;
			while (curr != null){
				if (curr.left == null){
					/* if there is no child simply move curr cursor to the right child */
					System.out.print(curr.data + " ");
					curr = curr.right;
				}else{
					/* Make this current the right child of rightmost node of its left child */
					prev = curr.left;
					while (prev.right != null && prev.right != curr) 
						prev = prev.right;
					
					/* Make curr as right child of its inorder predecessor */
					if (prev.right == null){
						prev.right = curr;
						curr = curr.left;
					}else{
						/* Bring back the original tree */
						prev.right = null;
						System.out.print(curr.data + " ");
						curr = curr.right;
					}     
				} 
			} 
		}
}
