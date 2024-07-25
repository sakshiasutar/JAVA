package list.linkedlist.doublylinkedlist;

import list.linkedlist.doublylinkedlist.InsertElementAtStart.Node;

public class InsertElementAtEnd {
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			head.prev = null;
			tail.next = null;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
			
		}
	}
	
	public void display() {
		Node current = head;
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Adding the elements in the list");
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
    	InsertElementAtEnd dList = new InsertElementAtEnd();  
    	
    	
    	 dList.addAtEnd(1);  
         dList.display();  
         
         dList.addAtEnd(2);  
         dList.display();  
         
         dList.addAtEnd(3);  
         dList.display();
    }
}
