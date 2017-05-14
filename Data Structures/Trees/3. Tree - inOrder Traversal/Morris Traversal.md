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

example

input:- 

	10  <- c
	/\
   5 20
  /\  
 3  7        since current has left child so find the inorder predecessor of current ( i.e. rightmost guy of its left child = 7 here in this case)

 
after step 1:-
--------------
   5   <- c
  /|\  
 3 |  7
   |   \
   |    10
   |____/\
	      20  make current (10) as right child of its in order predecessor, keeping orginal left link intact. . change current to left (10's left is 5).


after step 2:-
--------------
 3   <- c
 |\ 
 |_5
   |\  
   |  7
   |   \
   |    10
   |____/\
	      20	Make current (5) as right child of its inorder predecessor, keeping orginal left link intact. Change current to left (5's left is 3).  


		  
after step 3:-
---------------
 3   <- c
 |\ 
 |_5
   |\  
   |  7
   |   \
   |    10
   |____/\
	      20	Make current (5) as right child of its inorder predecessor, keeping orginal left link intact. Change current to left (5's left is 3). 	  

after step 4:-
---------------
 3   <- c
 |\ 
 |_5
   |\  
   |  7
   |   \
   |    10
   |____/\
	      20	Print current 3 and go to right only.      OUTPUT { 3 }
		  

 3   
 |\ 
 |_5   <- c
   |\  
   |  7
   |   \
   |    10
   |____/\
	      20		 

		  
after step 5:-
---------------

 3   
 |\ 
 |_5   <- c
   |\  
   |  7
   |   \
   |    10
   |____/\
	      20		   Since now current(5)'s inorder predecessor(3)'s right is current itselft, delink that and move current to right. 
		               Print current 3 and go to right only.      OUTPUT { 3, 5 }
		  
		  
  
   5                                                      
  /|\                                                      
 3 |  7  <-c                                                 
   |   \                                                     
   |    10
   |____/\
	      20           note that 3 dosen't have any right child now and out tree is coming back to normal.
		  

after step 6:-
---------------		

   5                                                      
  /|\                                                      
 3 |  7     <-c                                              
   |   \                                                     
   |    10
   |____/\
	      20   			Print current 3 and go to right only.      OUTPUT { 3, 5, 7 }
		  

   5                                                      
  /|\                                                      
 3 |  7                                                  
   |   \                                                     
   |    10 <- c
   |____/\
	      20   		


after step 7:-
---------------				  
   5                                                      
  /|\                                                      
 3 |  7                                                  
   |   \                                                     
   |    10 <- c
   |____/\
	      20   		Since now current(10)'s inorder predecessor(7)'s right is current itselft, delink that and move current to right. 
		               Print current 3 and go to right only.      OUTPUT { 3, 5, 7, 10 }


	10 
	/\
   5 20  <- c
  /\  
 3  7    			note that 7 dosen't have any right child now and out tree is back to normal.	

after step 8:-
---------------	

	10 
	/\
   5 20  
  /\  
 3  7              Print current 3 and go to right only.      OUTPUT { 3, 5, 7, 10, 20 }
 
  c 
   \
    null           now current is pointing to null so no more loop.
 