package list.linkedlist.doublylinkedlist;

public class InsertElementAtStart {
	
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
	
	public void addAtStart(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			head.prev = newNode;
			newNode.next = head;
			newNode.prev = null;
			head = newNode;
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
    	InsertElementAtStart dList = new InsertElementAtStart();  
        
          
        dList.addAtStart(1);  
        dList.display();  
        
        dList.addAtStart(2);  
        dList.display();  
        
        dList.addAtStart(3);  
        dList.display();  
}
}