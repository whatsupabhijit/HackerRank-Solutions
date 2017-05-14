/*
   class Node 
       int data;
       Node left;
       Node right;
*/

void top_view(Node root) {
    if (root != null) {
        printLeft(root.left);
        System.out.print(root.data + " ");
        printRight(root.right);
    }
}

void printLeft(Node root) {
    if (root != null) {
        printLeft(root.left);
        System.out.print(root.data + " ");
    }
}

void printRight(Node root) {
    if (root != null) {
        System.out.print(root.data + " ");
        printRight(root.right);
    }
}   