/*
	Created By: Ahmad Raza
	Date: 11-04-2022
*/

public class Stack
{
	
	//store the data in this variable
	private int [] values;
	
	//always point to the last push element
	
	private	int top = -1;
	
	//store the size of the data added
	private int size = 0;
	
	
	//constructor
	public Stack()
	{
		values = new int[10];
	}
	
	public Stack(int limit)
	{
		values = new int[limit];
	}
	
	//methods
	public boolean isFull()
	{
		return size >= values.length;
	}
	
	public void push(int value) throws StackFullException
	{
		if(!isFull())
		{
			values[++top] = value;
			size++;
		}
		else
		{
			throw new StackFullException();
		}
	}
	
	public int pop() throws StackEmptyException
	{
		if(top != -1)
		{
			size--;
			return values[top--];
		}
		else
		{
			throw new StackEmptyException();
		}
	}
	
	public int peek() throws StackEmptyException
	{
		if(top != -1)
		{
			
			return values[top];
		}
		else
		{
			throw new StackEmptyException();
		}
	}
	
	public void deleteStack()
	{
		size = 0;
		top = -1;
	}
	
	
}