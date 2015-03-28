package programComp;

import java.util.*;

public class LinkedListSample {

	public static List<Integer> SortList(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		int pointerList1=0;
		for(int i=0;i<list1.size()+list2.size();i++)
		{
			if(list2.isEmpty())
			{
				break;
			}
			if(list1.get(pointerList1)<list2.get(0))
			{
				//do nothing and increment pointerList1
				pointerList1+=1;
			}
			else
			{
				list1.add(pointerList1,list2.get(0));
				list2.remove(0);
				pointerList1+=1;
			}
		}
		return list1;
	}
}
