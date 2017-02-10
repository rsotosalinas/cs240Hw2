import java.util.EmptyStackException;

public class ArrayQueue<T> implements QueueInterface<T>
{
	 private T[] queue;
	 private int frontIndex;
	 private int backIndex;
	 private boolean initialized = false;
	 private static final int DEFAULT_CAPACITY = 50;
	 private static final int MAX_CAPACITY = 10000;
	 
	 public ArrayQueue(){
		 this(DEFAULT_CAPACITY);
		 
	 }
	 public ArrayQueue(int initialCapacity){
		 @SuppressWarnings("unchecked")
		T[] temp = (T[])new Object[initialCapacity +1];
		 queue = temp;
		 frontIndex = 0;
		 backIndex = initialCapacity;
		 initialized = true;
	 }
	 public void enqueue(T newEntry){
		 backIndex = (backIndex +1) % queue.length;
		 queue[backIndex] = newEntry;
	 }	
	 public T dequeue() {
		 if(isEmpty()){
			 throw new EmptyStackException();
		 }
	    T front = queue[frontIndex];
	    queue[frontIndex] = null;
	    frontIndex = (frontIndex + 1) % queue.length;
		 
	    return front;
		 
 			
	}

	
	  public T getFront(){
		  T front = queue[frontIndex];
		  return front;
	  }
	  
	
	  public boolean isEmpty(){
		  return frontIndex == ((backIndex +1) % queue.length);
	  }
	  
	  public void clear(){
		  while(!isEmpty()){
			  dequeue();
		  }
	  }

}
