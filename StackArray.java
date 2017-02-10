public class StackArray<T> implements StackInterface<T>
{
   T[] array;
   int numberOfEntries = 0;
   int defaultSize = 10;

   public Stack(int number){
   @SuppressWarnings("unchecked")
    T[] array  = (T[])new Object[number];
   this.array = array;
   }
   public Stack(){
   @SuppressWarnings("unchecked")
   T[] array = (T[])new Object[defaultSize];
   this.array = array;
   }

   public void push(T newEntry){
      array[numberOfEntries] = newEntry;
     numberOfEntries++;
   }

   public T pop(){
	   T item = null;
	   if(!isEmpty())
	   {
          item = array[numberOfEntries] ; 
          array[numberOfEntries] = null;
          numberOfEntries--;
       }
	   else{
		  System.out.print("bag is empty)");
	   }
      return item;
   }

   public T peek(){
	  T item = null;
      if(!isEmpty()){
    	  System.out.println("empty");
      }
      else
      item = array[numberOfEntries];	   
      return item;
   }

   public boolean isEmpty(){
   boolean empty;
   if(numberOfEntries == 0)
   empty = true;
   else
   empty = false;
   return empty;
   }

   public void clear(){
	   while(!isEmpty()){
		   pop();
	   }
   }
   public static void main(String[] args){
	   System.out.println("hey");
   }


}
