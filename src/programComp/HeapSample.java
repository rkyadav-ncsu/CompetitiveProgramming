package programComp;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapSample {
	static class IntegerComparator implements Comparator<Integer>
	{

		public int compare(Integer a, Integer b)
		{
			return a-b;
		}
		
		

	}
	public int[] returnSort()
	{
		int[] a={12,23,4,5,6,2,3,8,9,3,4};
		IntegerComparator intComp=new IntegerComparator(); 
		PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>(intComp);
		for(int i:a)
		{
			pQueue.offer(i);
		}
		int[] b=new int[a.length];
		int j=0;
		while(!pQueue.isEmpty())
		{
			b[j++]=pQueue.poll();
		}
		return b;
	}
}

