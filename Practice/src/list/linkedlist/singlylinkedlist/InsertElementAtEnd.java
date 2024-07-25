package list.linkedlist.singlylinkedlist;

public class InsertElementAtEnd {
	
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
	
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is Enpty");
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

        InsertElementAtEnd list = new InsertElementAtEnd();
		
		list.display();
		
		list.addAtEnd(0);
		list.display();
		
		list.addAtEnd(1);
		list.display();
	}

}
