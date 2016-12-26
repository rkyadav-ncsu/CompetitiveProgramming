package programComp;
import java.util.*;

public class BurrowsWheeler {
	static char[] str;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String input=sc.nextLine();
			str = input.toCharArray();
			Integer[] off = new Integer [ str.length ];
			for ( int i = 0; i < off.length; i++ )
				off[ i ] = i;
			Arrays.sort(off,new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) { 
				for(int i=0;i<str.length;i++)
				{
					char a = str[ (o1+i)%str.length ];
					char b = str[ (o2+i)%str.length ];
					if ( a != b  ) {
						if ( a < b )
							return -1;
						return 1;
					}
				}
				return 0;
			}
			});
			for(int j=0;j<off.length;j++)
			{
				System.out.print(str[off[j]==0?str.length-1:off[j]-1]);
			}
			System.out.println("");
		}

	}	
}

