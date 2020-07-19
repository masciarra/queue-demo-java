package queue;

public class Driver {

	/* Demonstrates queue functionality.
	 * 
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();

		for (int i = 0; i < 20; i++) {
			queue.push(i);
		}

		System.out.println("Queue after pushing");
		
		queue.printQueue();
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		for (int i = 0; i < 10; i++) {
			queue.pop();
		}
		
		System.out.println("Queue after popping");

		
		queue.printQueue();
	}
}
