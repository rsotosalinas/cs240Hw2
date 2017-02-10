public class StackVector<T> implements StackInterface<T>
{
   T[] array;
   int numberOfEntries = 0;
   int defaultSize = 10;

   public StackVector(int number){
   @SuppressWarnings("unchecked")
    T[] array  = (T[])new Object[number];
   this.array = array;
   }
   public StackVector(){
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
   
   public void increaseCapacity(){
	   int length = 2 * array.length;
	   
	   @SuppressWarnings("unchecked")
	T[] newArray = (T[])new Object[length];
	   for(int i = 0; i < newArray.length; i++){
		   newArray[i] = array[i];
		   array[i] = newArray[i];	      
   
        }
   }
   public static void main(String[] args){
	   System.out.println("yup");
   }
}
