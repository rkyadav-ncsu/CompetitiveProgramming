package competitiveProgramming;

import java.util.Scanner;

public class Num1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long input=sc.nextLong();
			System.out.println(return1BitsByBit(input));
		}

	}
	
	//
	private static int return1Bits(long _in){
		int returnVal=0;

		int remainder=0;
		while(_in>=1){
			remainder=(int)(_in%2);
			_in=_in/2;
			if(remainder==1)
				returnVal++;
		}
		return returnVal;
	}
	//
	private static int return1BitsByBit(long _in){
		int returnVal=0;
		while(_in>0){
			returnVal+=_in&1;
			_in=_in>>1;
		}
		return returnVal;
	}

}
