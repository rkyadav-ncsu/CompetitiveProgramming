package programComp;

import java.util.*;

public class ArraySample {

	
	/*
	 * input : grid with 0 when there is no path, 1 when there is a path.
	 * output :returns a list of cells indices of path
	 * description :Find a path from top right to bottom left of a grid
	 */
	Hashtable<Integer,Integer> visited=new Hashtable<Integer,Integer>();
	public List<Integer> FindPathFromTopToBottom(int[][] input)
	{
		List<Integer> path=new ArrayList<Integer>();
		findPathFromTopToBottom(input,0,0);
		
		for(int visitedNode:visited.keySet())
		{
			if(visited.get(visitedNode)==1)
			{
				//this is path
				path.add(visitedNode);
			}
		}
		return path;
	}
	private boolean findPathFromTopToBottom(int[][] input,int x, int y)
	{
		visited.put(x*input[0].length+y,0);
		Hashtable<Integer,Integer> nodesToExplore=new Hashtable<Integer,Integer>();
		boolean gotPath=false;
		if(x==input.length-1 && y==input[0].length-1)
		{
			return true;
		}
		else
		{
			if( x!=0 && input[x-1][y]==1)
			{
				//x-1 can be visited
				if(!visited.containsKey((x-1)*input[0].length+y))
				{
					nodesToExplore.put(x-1,y);
				}
			}
			if(x!=(input.length-1) && input[x+1][y]==1)
			{
				//x-1 can be visited
				if(!visited.containsKey((x+1)*input[0].length+y))
				{
					nodesToExplore.put(x+1,y);
				}
			}
			if(y!=0 && input[x][y-1]==1)
			{
				//y-1 can be visited
				if(!visited.containsKey((x*input[0].length)+(y-1)))
				{
					nodesToExplore.put(x,y-1);
				}
			}
			if(y!=(input[0].length-1) && input[x][y+1]==1)
			{
				//x-1 can be visited
				if(!visited.containsKey((x*input[0].length)+(y+1)))
				{
					nodesToExplore.put(x,y+1);
				}
			}
			
			Set<Integer> keys = nodesToExplore.keySet();
			
			for(int currentX:keys)
			{
				int currentY=nodesToExplore.get(currentX);
				if(findPathFromTopToBottom(input,currentX,currentY))
				{
					visited.put(currentX*input[0].length+currentY,1);
					gotPath=true;
					break;
				}
			}
		}
		return gotPath;
	}
	

	/*
	 * Returns an array of all duplicates in an unsorted array.
	 * Time complexity is O(n)
	 *	Space complexity is O(n) or 3n. One each for input, return and hash-table
	 * 
	 */
	public int[] GetAllDuplicates(int[] inputArray)
	{
		//ad-hoc storage for distinct records found till now. Better for lookup
		Hashtable<Integer, Integer> tempHashtable=new Hashtable<Integer,Integer>();
		int[] returnArray=new int[inputArray.length];
		int j=0;
		//loop through
		for(int i=0;i<inputArray.length;i++)
		{
			if(tempHashtable.containsKey(inputArray[i]))
			{
				returnArray[j++]=inputArray[i];
			}
			else
			{
				//put distinct elements in tempHashtable with count as 1.
				tempHashtable.put(inputArray[i],1);
			}
		}
		return returnArray;
	}
}
