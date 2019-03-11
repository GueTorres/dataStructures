package dataStructures;

public class stackChar {

	private static int top = -1;
	private static char [] A;
	
	public stackChar(int size) {
		A = new char[size];
	}

	
	
	public char top() {		//returns whatever is at the top if the stack
		return A[top];
	}
	
	public void push(char i) {	//pushes next character into the stack
		top ++;
		A[top] = i;
		}
	
/**	public void pop1() {				//removes values from stack
		top--;			
	}**/
	
	public int pop() {			//professor's choice
		
		int temp = A[top];
		
		top--;
		
		return temp;
	}
	public boolean isEmpty() {		//checks if stack is empty
		return top == -1; 
	}
	
	
	//push, pop and isEmpty could be in there own class since they don't affect the class
	
	
		}
