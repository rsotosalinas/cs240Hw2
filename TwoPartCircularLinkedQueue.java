import java.util.EmptyStackException;

public class TwoPartCircularLinkedQueue<T> implements QueueInterface<T>
{
	  private Node queueNode; //first
	  private Node freeNode;  //back
	  
	  private class Node{
			private T data; 
			private Node next;
			
			private Node(T data){
				this(data, null);
			}
			private Node(T data, Node nextNode){
				this.data = data;
				next= nextNode;
			}
		}
	  
	  public TwoPartCircularLinkedQueue(){
		  freeNode = new Node(null,null);
		  freeNode.next = freeNode;
		  queueNode = freeNode;
	  }
      public void enqueue(T newEntry){
    	  freeNode.data = newEntry;
    	  if(isChainFull()){
    		  Node newNode = new Node(null, freeNode.next);
    		  freeNode.next = newNode;
    	  }
    	  freeNode = freeNode.next;
      }
	  
	  public T dequeue(){
		  T front = getFront();
		  queueNode.data = null;
		  queueNode = queueNode.next;
		  return front;
		  
	  }
	  
	  public T getFront(){
		  if(isEmpty())
			  throw new EmptyStackException();
		  else 
			  return queueNode.data;
	  }
	  
	  public boolean isEmpty(){
		  return queueNode == freeNode;
	  }
	  public boolean isChainFull(){
		  return queueNode == freeNode.next;
	  }
	  public void clear(){
		  while(!isEmpty())
			  dequeue();
		  
	  }

}
