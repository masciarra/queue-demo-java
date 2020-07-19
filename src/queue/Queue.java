package queue;

import java.util.Arrays;

public class Queue {

	private int size;
	private int length;
	private int[] queue;
	
	public Queue() {
		this.length = 10;
		this.size = 0;
		this.queue = new int[this.length];
	}
	
	/* Checks if array is full, doubles capacity if so.
	 * 
	 */
	private void expandCapacity() {
		if (this.size == this.length) {
			this.queue = Arrays.copyOf(this.queue, this.length * 2);
			this.length *= 2;
			
		}
	}
	
	/* Checks if array is 10 times greater than the size of queue,
	 * then reduces the size to 2x the size of the queue.
	 */
	
	private void reduceCapacity() {
		if (this.length > (this.size * 10)) {
			this.queue = Arrays.copyOf(this.queue, (this.size * 2));
			this.length = this.size * 2;	
		}
	}
	
	/* Pushes int element onto stack.
	 * 
	 */
	public void push(int elem) {
		expandCapacity();
		this.queue[this.size] = elem;
		this.size++;
	}
	
	/* Removes element from front of queue and returns the value
	 * of the element.
	 */
	public int pop() {
		int result = 0;
		result = this.queue[0];		

		for (int i = 0; i < (this.size - 1); i++) {
			this.queue[i] = this.queue[i+1];
		}
		
		this.size--;
		
		reduceCapacity();
		return result;
	}
	
	/*Prints contents of queue to the console
	 * 
	 */
	public void printQueue() {
		for (int i = 0; i < this.size; i++) {
			System.out.println(this.queue[i]);
		}
	}
	
	
	/* Prints elements of the array used to support the queue
	 * 
	 */
	private void printQueueArray() {
		for (int i = 0; i < this.queue.length; i++) {
			System.out.println(this.queue[i]);
		}
		System.out.println("array length is:" + this.queue.length);
	}
}
