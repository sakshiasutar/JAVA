package list.linkedlist.singlylinkedlist;

public class InsertElementAtStart {
   
	class Node{
		int data;
		Node next;
	
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addAtFirst(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
		
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Adding the Nodes to the list");
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;	
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		InsertElementAtStart list = new InsertElementAtStart();
		
		list.display();
		
		list.addAtFirst(0);
		list.display();
		
		list.addAtFirst(1);
		list.display();
	}

}
