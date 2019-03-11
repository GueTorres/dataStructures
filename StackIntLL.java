package dataStructures;

public class StackIntLL {

	private Node top = null;
	
	public int top() {
		
		return top.x;
	}
	
	public void push(int x) {
		
		top = new Node(x, top);//the x variable is the new x
							   // and top becomes the reference node for next
	}
	
	public void pop() {
		
		top = top.next;	//the node referred to prior has no reference node 
						//this causes garbage collection
		
	}
	
	public boolean isEmpty() {
	
		return top == null;
	
	}
	}
