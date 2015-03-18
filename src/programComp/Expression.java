package programComp;

import java.util.*;

public interface Expression {
	public Set<Character> getChars(String in); 
	public boolean eval(Map <Character, Integer> c); 
}
