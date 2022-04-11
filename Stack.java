/*
	Created By: Ahmad Raza
	Date: 11-04-2022
*/

public class Stack
{
	
	//store the data in this variable
	private int [] values;
	
	//always point to the last push element
	private int top = -1;
	
	//store the size of the data added
	private int size = 0;
	
	public Stack()
	{
		values = new int[100];
	}
	
	public Stack(int limit)
	{
		values = new int [limit];
	}
}