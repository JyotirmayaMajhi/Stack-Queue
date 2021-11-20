package com.bridgelabz.stack;

public class Stack {
	
	private static final int MAX=10;
	
	private class Node{
		int data;
		Node link;
	}
	
	Node top;
	
	public Stack(){
		this.top = null;
	}
	
	public void push(int x) {
		Node temp = new Node();
		
		 if (temp == null) {
			 System.out.println("Overflow");
			 return;
		 }
		 
		 temp.data = x;
		 temp.link = top;
		 top = temp;
	}
	
	public boolean isEmpty() {
		
		return top == null;
		
	}
	
	 public int peek() {
		 if (!isEmpty()) {
	            return top.data;
	        }
	        else {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	 }
	 
	 public void pop() {
		 if (top == null) {
	            System.out.print("\nStack Underflow");
	            return;
		 }
	        top = (top).link;
	 }
	 
	 public void display() {
		 if(top == null) {
			 System.out.println("Underflow");
		 }
		 else {
			 Node temp = top;
			 while(temp != null) {
				 
				 System.out.printf("%d-->", temp.data);
				 
				 temp = temp.link;
			 }
		 }
	 }

}



