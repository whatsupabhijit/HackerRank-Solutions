import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution{
    public static Node removeDuplicates(Node head) {
        Map <Integer, Integer> map = new HashMap<>();
      //Write your code here
        if (head == null || head.next == null)
            return head;
        Node curr = head;
        Node prev = null;
            
        while (curr.next != null){
            //System.out.println(" current at " + curr.data);
            Integer count = map.get(curr.data);
            if (count == null){
                map.put(curr.data, 0);
                prev = curr;
                curr = curr.next;
            }else{
                curr = curr.next;  
                prev.next = curr;        
            }    
        }
        
        Integer count = map.get(curr.data);
        if (count == null){
            map.put(curr.data, 0);
            prev.next = curr;
        }else
            prev.next = null;
        
        return head;
    }
	
	
	
	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }	