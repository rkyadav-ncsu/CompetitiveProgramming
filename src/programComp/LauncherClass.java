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
		ArraySample arraySample=new ArraySample();
		int[][] sampleData={{1,1,1,1,1},{1,0,0,0,1},{1,0,0,0,1},{1,0,0,0,1},{1,1,1,0,1}};
		
		List<Integer> path =arraySample.FindPathFromTopToBottom(sampleData);
		for(int p:path)
		{
			System.out.println(p);
			System.out.println("--");
		}
		

	}

}
