package iq;

import java.util.Scanner;

public class SubsequenceQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//input
		String _input=sc.next();
		//number of queries
		int _countQueries=sc.nextInt();
		//run each query, one at a time
		while(_countQueries>0){
			_countQueries--;
			PrintResult(_input,sc.next());
		}
	}
	//runtime O(n), where n is the length of input. The overall runtime may be large if the number of queries are more.
	//if the number of queries is k and is large enough, the runtime will become O(kn).
	//
	public static void PrintResult(String _input, String _query){
		int _queryLen=_query.length();
		int _inputLen=_input.length();
		int _queryIndex=0;
		for(int i=0;i<_inputLen-1;i++){
			//
			if(_input.charAt(i)!=_query.charAt(_queryIndex)){
				continue;
			}
			_queryIndex++;
			if(_queryIndex==_queryLen){
				break;
			}
		}
		if(_queryIndex==_queryLen){
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
