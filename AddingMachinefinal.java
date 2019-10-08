//Tingyu Luo CSE360 Assignment 2
//This is a adding machine to keep all the histroy of add
//and subtract a value.
package cse360assign2;

public class AddingMachine 
{
	private int total;
	private String history;
	public AddingMachine ()
	{
		total = 0;  // not needed - included for clarity
		history="0";//initialize the history
	}
	
	public int getTotal () 
	{
		return total;//get the value in total
	}
	
	public void add (int value) 
	{
		total=total+value;//add value to total
		history=history+" + "+value;
	}
	
	public void subtract (int value) 
	{
		total=total-value;//subtract value to total
		history=history+" - "+value;
	}
		
	public String toString ()
	{
		return history;//return the string that stored all the process
	}

	public void clear() //clear all the history and values
	{
		total=0;//clear total
		history="0";//clear history
	}
}
