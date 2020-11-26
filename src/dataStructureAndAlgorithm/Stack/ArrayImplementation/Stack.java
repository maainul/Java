package dataStructureAndAlgorithm.Stack.ArrayImplementation;

import dataStructureAndAlgorithm.Tree.BinaryTree.basic._1_ImplementBST;

class Stack<N> {
	int stack[] = new int[5];
	int top=0;
	
	public void push(_1_ImplementBST.Node data) {
		if(top == 5) {
			System.out.println("Stack is full");
		}
		else {
			//stack[top] = data;
			top++;
		}
		
	}
	
	public int pop() {
		int data=0;
		if(isEmpty()) {
			System.out.println("Stack is empty..");
		} 
		else {
			top--;
			data = stack[top];
			stack[top] = 0;
			
		}
		return data;
		
	}
	
	public int peak() {
		int data;
		data = stack[top-1];
		return data;
	}
	
	public int size() {
		return top;
		
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	public void show() {
		for(int n:stack) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
