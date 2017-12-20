

public class ArrayStack implements Stack
{
 	private Object [] theArray;
 	private int topOfStack;

 	private static final int DEFAULT_CAPACITY = 52;

 	public ArrayStack()
 	{
		theArray = new Object[DEFAULT_CAPACITY];
		topOfStack = -1;
 	}

 	public boolean isEmpty()
 	{
 		return topOfStack == -1;
 	}

 	public void makeEmpty()
 	{
 		topOfStack= -1;
 	}

 	public void push(Object x)
 	{
		if (topOfStack + 1 == theArray.length)
		{
		  resizeArray();
		  //System.out.println("resized Array");
	  	}
		topOfStack++;
		theArray[topOfStack]= x;
	}
	public void pop()
	{
		if(isEmpty())
		  System.out.println("Pop failed because stack is empty");
		else
		topOfStack--;
	}
	public Object top()
	{
		if(isEmpty())
		  {
		  throw new UnderflowException("top failed because stack is empty");
	  	  }
	  	else
	  	return theArray[topOfStack];
	}

	public Object topAndPop()
	{
		Object temp;
		if (isEmpty())
		{
			throw new UnderflowException("topAndPop failed because stack is empty");

		}
		else
		{
			temp = top();
			pop();
			return temp;
		}

	}
	private void resizeArray()
	{
		Object [] newArray;
		newArray = new Object[theArray.length*2];
		for(int i=0; i<theArray.length;i++)
		   newArray[i]= theArray[i];

		theArray = newArray;
	}
}