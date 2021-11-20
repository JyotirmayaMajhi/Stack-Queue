package com.bridgelabz.stack;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		 Stack obj = new Stack();
		 obj.push(56);
	     obj.push(30);
	     obj.push(70);
	     
	     obj.display();
	     
	     System.out.printf("\nTop element is %d\n", obj.peek());
	     
	     obj.pop();
	     obj.pop();
	     
	     obj.display();
	     
	       
	     System.out.printf("\nTop element is %d\n", obj.peek());
	}

}
