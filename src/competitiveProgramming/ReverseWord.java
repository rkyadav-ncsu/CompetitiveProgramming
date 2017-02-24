package competitiveProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		System.out.println(LexicalOrder(428939292,2));
	}
	public static String ReverseString(String in){
		
		String[] StringArray=in.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=StringArray.length-1;i>=0;i--){
			if(!StringArray[i].trim().equalsIgnoreCase(""))
				sb.append(StringArray[i].trim()).append(" ");
		}
		return sb.toString().trim();
	}
	public static int LexicalOrder(int n, int k){
		
		
		
		
		
		return 0;
	}
	

}
