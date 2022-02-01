package stackclassdemo;

class StackOverFlowException extends Exception{
	
	public String toString() {
		return "Stack is Full";
	}
}

class StackUnderFlowException extends Exception{
	
	public String toString() {
		return "Stack is Empty";
	}
}

class Stack{
	
	private int size;
	private int top = -1;
	private int s[];
	
	public int getS() {
		return s.length;
	}
	public Stack(int sz) {
		this.size = sz;
		s = new int[sz];
	}
	
	public void push(int x) throws StackOverFlowException{
		if(top == this.size-1) {
			throw new StackOverFlowException();
		}
		top++;
		s[top] = x;
	}
	
	public int pop() throws StackUnderFlowException{
		
		int x = -1;
		
		if(top == -1) {
			throw new StackUnderFlowException();
		}
		x = s[top];
		top--;
		return x;
	}
}

public class StackClassDemo {
	

	public static void main(String[] args) {
		

		Stack s = new Stack(5);
		
		try {
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			s.push(5);
			//s.push(6);
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			s.pop();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println(s.getS());
		

	}

}
