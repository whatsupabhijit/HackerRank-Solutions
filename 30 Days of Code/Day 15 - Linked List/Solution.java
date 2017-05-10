import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
	
	    public static  Node insert(Node head,int data) {
       
        Node tNode = new Node(data);
        
        //if the linked list is empty now, insert head and return head
        if (head == null){
            return tNode;
        }
        
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        
        currNode.next = tNode;
        return head;
    }
	
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}