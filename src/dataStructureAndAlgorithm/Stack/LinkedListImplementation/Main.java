package dataStructureAndAlgorithm.Stack.LinkedListImplementation;

public class Main {
	
	public static void main(String args[]) {
		Stack stack = new Stack();
		System.out.println("Stack implementation using LinkedList..\n");
		System.out.println("Length of the stack is: "+stack.isEmpty());
		stack.push(8); //0
		stack.push(6); //1
		stack.push(7); //2
		stack.show();
		System.out.println("Length of the stack is: "+stack.length());
		
		System.out.println("Pop element is : "+stack.pop());
		stack.show();
		System.out.println("Length of the stack is: "+stack.length());
		
		System.out.println("Pop element is : "+stack.pop());
		stack.show();
		System.out.println("Length of the stack is: "+stack.length());
		
	
		System.out.println("peek element is : "+stack.peek());
		
	}

}
/* Output: 
	Stack implementation using LinkedList..
	
	Length of the stack is: true
	7 6 8 
	Length of the stack is: 3
	Pop element is : 7
	6 8 
	Length of the stack is: 2
	Pop element is : 6
	8 
	Length of the stack is: 1
	peek element is : 8
*/