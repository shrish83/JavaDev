
public class SingleLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		//constructor
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	//linked list traversal
	public void printList(){
		Node n = head;
		while(n!=null) {
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	
	//insert node at the beginning
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	//node insertion after a given node
	public void pushafter(Node prev_node,int new_data) {
		/* 1. Check if the given Node is null */
	    if (prev_node == null)  
	    {  
	        System.out.println("The given previous node cannot be null");  
	        return;  
	    } 
	    
		Node new_node = new Node(new_data);
		/* Make next of new Node as next of prev_node */
		new_node.next = prev_node.next;
		/*make next of prev_node as new_node */
		prev_node.next = new_node;
	    
	}
	
	public void pushend(int new_data) {
		Node new_node = new Node(new_data);
		
		/* 4. If the Linked List is empty, then make the 
        new node as head */
		if (head == null) 
		 { 
		     head = new Node(new_data); 
		     return; 
		 } 
		
		new_node.next = null;
		while(head.next != null) {
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList list = new SingleLinkedList();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		/* Three nodes have been allocated dynamically. 
        We have references to these three blocks as head,   
        second and third 

        llist.head        second              third 
           |                |                  | 
           |                |                  | 
       +----+------+     +----+------+     +----+------+ 
       | 1  | null |     | 2  | null |     |  3 | null | 
       +----+------+     +----+------+     +----+------+ */
		
		list.head.next = second; // Link first node with the second node 
		  
        /*  Now next of the first Node refers to the second.  So they 
            both are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  | null |     |  3 | null | 
        +----+------+     +----+------+     +----+------+ */
		

        second.next = third; // Link second node with the third node 
  
        /*  Now next of the second Node refers to third.  So all three 
            nodes are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
        +----+------+     +----+------+     +----+------+ */
        
        //list traversal
        //list.printList();
        
        //node insertion in the front
        //list.push(0);
        //list.printList();
        
        //node insertion after a given node
        list.pushafter(second, 4);
        list.printList();
        
      //node insertion at end
        list.pushend(5);
        list.printList();
	}

}
