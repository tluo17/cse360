//Tingyu Luo CSE360 Assignment 2
package cse360assign2;

public class AddingMachine 
{
	private int total;
	private String history;
	public AddingMachine ()
	{
		total = 0;  // not needed - included for clarity
		history="0";
	}
	
	public int getTotal () 
	{
		return total;
	}
	
	public void add (int value) 
	{
		total=total+value;
		history=history+" + "+value;
	}
	
	public void subtract (int value) 
	{
		total=total-value;
		history=history+" - "+value;
	}
		
	public String toString ()
	{
		return history;
	}

	public void clear() 
	{
		total=0;
		history="";
	}
}
