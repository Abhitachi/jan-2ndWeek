package jan4;

import java.util.Stack;

public class Mystack1 {
	static void stack_push(Stack<Integer>stack) {
		for	(int i=10; i<20; i++) {

			stack.push(i);
		}
		}
		 static void stack_pop(Stack<Integer> stack)
		    {
		        System.out.println("Pop Operation:");

		        for(int i = 10; i < 20; i++)
		        {

		            System.out.println(stack.pop());
		        }
		    }
		static void stack_peek(Stack<Integer> stack)
	    {

	        System.out.println("Element on stack top: " + stack.peek());
	    }
		public static void main(String[]args) {

			//stack<integer>stack= new stack<integer>();
			 Stack<Integer> stack = new Stack<Integer>();
			 stack_push(stack);
		      stack_pop(stack);
		        stack_push(stack);
		       stack_peek(stack);

		}
}
