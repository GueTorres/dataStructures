package dataStructures;

public class infixEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String infix = "(8+3)*4+5-8+3";
	
		String postfix = infix2Postfix(infix);
		
		int result = evalPostfix(postfix);
		
		prt(infix + " = " + postfix + " = " + result);
		
 	}

	public static void prt(String s) {
		
		System.out.println(s);
	}
	
	public static boolean isOperator(char c) {   //saves space if the characters are checked within another method
		
		return c == '^' || 
			   c == '*' || 
			   c == '+' || 
			   c == '-' || 
			   c == '/';
	}
	
	public static int prec(char c) {
		
		if(c == '^') { return 3;}
		if(c == '*') { return 2;}
		if(c == '/') { return 2;}
		if(c == '+') { return 1;} 
		if(c == '-') { return 1;}
		return 0;					//for parenthesis 
	}
	
	public static String infix2Postfix(String infix) {
		
		infix = "(" + infix + ")";
		String postfix = "";
		stackChar stack = new stackChar(infix.length()/2);
		
		for(int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);
			if(isOperator(c)) {
				while((!stack.isEmpty()) && (prec(stack.top()) >= prec(c))) {
					postfix += stack.top(); stack.pop();
				}
				stack.push(c);
			}else if( c == '(') {
				stack.push(c);
			}else if(c == ')') {
				while( stack.top() != '(') {
					postfix += stack.top(); stack.pop(); 	
				}stack.pop();
			}
			
			else {
				postfix += c;
			}
		}
	/**	while(!stack.isEmpty()) {
		postfix += stack.top(); stack.pop();} **/
		
		return postfix;
	}
	
	public static int evalPostfix(String postfix) {
		
		StackIntLL stack = new StackIntLL();
		//stackInt stack = new stackInt(postfix.length()/2 + 1);
		
		for(int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);
			if(isOperator(c)) {
					
				int b = stack.top(); stack.pop();
				int a = stack.top(); stack.pop();
				
				if( c == '^') {stack.push(powR(a,b));}
				if( c == '*') {stack.push(a*b);}	
				if( c == '/') {stack.push(a/b);}
				if( c == '+') {stack.push(a+b);}
				if( c == '-') {stack.push(a-b);}
				
				}else {stack.push(c - '0');} //(c - '0') turns a char number into an int number
	}
		return stack.top();	}
	
	public static int pow( int b, int e) {
		
		int prod = 1;
		
		for(int i = 0; i < e; i++) {
			
			prod *= i;			
		}
		return prod;
		
	}
	
	public static int powR(int b, int e) { // recursive method
		
		if(e == 0) return 1;
		else return  b * powR(b, e - 1);

	}

}
// make a picture

//postfix: left to right. looking for operators