package iq;

import java.util.LinkedList;
import java.util.Scanner;

public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> _input=new LinkedList<Integer>();
		while(sc.hasNextInt()){
			_input.add(sc.nextInt());
		}
		if(!_input.isEmpty())
			IsPalindrome(_input);
		sc.close();
	}

	//this is written for Integers, similar can be implemented for Strings, etc.
	//for double linked list, this is pretty straight forward.
	public static void IsPalindrome(LinkedList<Integer> _inputList){
		//check if first and last element's values are same.
		//if same, then remove both of them, and continue.
		//in case of odd palindrome list, last pollLast operation will make the list empty. So check of empty list before removing first element.
		while(_inputList.getFirst()==_inputList.pollLast()){
			//
			if(!_inputList.isEmpty())
				_inputList.removeFirst();
			
			if(_inputList.isEmpty())
				break;
				
		}
		//display result.
		if(_inputList.size()>0)
			System.out.println("No");
		else
			System.out.println("Yes");
		
	}
}
