package programComp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExpressVerify implements Expression
{

	Map<Character,Integer> map=new HashMap<Character,Integer>(26);
	
	private void setMap()
	{
		map.put('O',2);
		map.put('N',3);
		map.put('E',1);
		map.put('T',4);
		map.put('W',6);
	
	}
	
	@Override
	public Set<Character> getChars(String in) {
		
		return null;
	}

	@Override
	public boolean eval(Map<Character, Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

}
