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
		
		HeapSample heapSample=new HeapSample();
		int[] a=heapSample.returnSort();
		for(int i:a)
		{
			System.out.println(i);
		}
		
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
