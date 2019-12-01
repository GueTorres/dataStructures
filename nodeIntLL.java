
public class nodeIntLL { 		//linked list show up in interview questions
	
	Node head = null;
	Node tail = null;
	Node current = null;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertBefore(int x) {
		if(isEmpty()) {
			current = new Node(x, null);
			head.next =  current;
			tail.next = current;
		}else if(current == head) {
			head = new Node(x, current);
			current = head;
		}else {
			
		}
	}

}
