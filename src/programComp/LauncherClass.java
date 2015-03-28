/**
 * 
 */
package programComp;
import java.util.*;

/**
 * @author AM
 *
 */
public class LauncherClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(3);
		list2.add(5);
		list2.add(7);
		System.out.println(LinkedListSample.SortList(list1, list2));
		
		
		/*HeapSample heapSample=new HeapSample();
		int[] a=heapSample.returnSort();
		for(int i:a)
		{
			System.out.println(i);
		}*/
		
		/*
		ArraySample arraySample=new ArraySample();
		 
		int[] input={1,2,3,4,5,3,4,5,2,3,4,5,0};
		for(int i :arraySample.GetAllDuplicates(input))
		{
			System.out.println(i);
			System.out.println("--");
		}
		*/
		/*int[][] sampleData={{1,1,1,1,1},{1,0,0,0,1},{1,0,0,0,1},{1,0,0,0,1},{1,1,1,0,1}};
		
		List<Integer> path =arraySample.FindPathFromTopToBottom(sampleData);
		for(int p:path)
		{
			System.out.println(p);
			System.out.println("--");
		}*/
		

	}

}
