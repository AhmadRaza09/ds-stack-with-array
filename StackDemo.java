/*
	Created By: Ahmad Raza
	Date: 11-04-2022
*/

public class StackDemo
{
	
	public static void main(String [] args) throws StackFullException, StackEmptyException
	{
		Stack s1 = new Stack();
		for(int i = 0; i <10; i++)
		{
			s1.push(i);
			System.out.println(s1.peek());
		}
		System.out.println("pop");
		int size = s1.getSize();
		for(int i = 0; i < size; i++)
		{
			
			System.out.println(s1.pop());
		}
		
		s1.deleteStack();
		System.out.println(s1.pop());
		
		
	}
	
}
