package dataStructures;

public class stackInt {
	
	private int top = -1;
	private int [] A;
	
	
	public stackInt(int size) 
	{	
		A = new int[size];
	}

	public void push(int i) {	//pushes next character into the stack
		top ++;
		A[top] = i;
	}
	
	public void pop1() {			//removes values from stack
		top--;			
		
	}
	
	public int pop() {			//professor's choice
		
		int temp = A[top];
		
		top--;
		
		return temp;
	}
	
	public int pop3() {		//this attempt is ill-advised
		
		top --;
		
		return A[top - 1]; //this is logically at risk
	}
	
	public boolean isEmpty() {	//checks if stack is empty
		return top == -1; 
	}
	
	public int top() {			//returns whatever is at the top if the stack
		return A[top];
	}
	

	
}
