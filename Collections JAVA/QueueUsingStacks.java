import java.util.*;
class QueueUsingStacks{
	Stack<Integer> input = new Stack<>();
	Stack<Integer> output = new Stack<>();

	public void enqueue(int x){
		System.out.println("Element pushed:"+x);
		input.push(x);

	}

	public int dequeue(){
		//Base case and worst case o(n)
		if(output.empty()){
			while(input.empty() == false){
				output.push(input.peek());
				input.pop();

			}
		}
		int res = output.peek();
		output.pop();
		return res;

	}

	public int top(){
		//Base case and worst case o(n)
		if(output.empty()){
			while(input.empty() == false){
				output.push(input.peek());
				input.pop();

			}
		}
		 
		
		return output.peek();
	}

	public static void main(String args[]){
		QueueUsingStacks queue = new QueueUsingStacks();
		queue.enqueue(5);
		queue.enqueue(3);
		queue.enqueue(2);

		System.out.println("Element popped:"+queue.dequeue());
		System.out.println("Element at peek:"+queue.top());
		System.out.println("Element popped:"+queue.dequeue());
		queue.enqueue(1);
		System.out.println("Element at peek:"+queue.top());

	}

}


/*

Element pushed:5
Element pushed:3
Element pushed:2
Element popped:5
Element at peek:3
Element popped:3
Element pushed:1
Element at peek:2

*/