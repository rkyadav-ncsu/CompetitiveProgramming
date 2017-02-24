/**
 * 
 */
package competitiveProgramming;

import java.util.LinkedList;
import java.util.Scanner;


/**
 * @author rk
 *
 */
public class ListCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList items=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			items.add(sc.next());
		}
		System.out.println(getBackNode(items));
		

	}
	public static String getBackNode(LinkedList<String> list){
		String backNode="";
		
		
		
		
		return backNode;
	}

}
