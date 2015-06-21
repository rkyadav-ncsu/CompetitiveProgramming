package programComp;

import java.util.*;

public class CardShuffle {
	private int total_Count = 0;

	private Stack<Integer> Shuffle(Queue<Integer> cardQueue) {
		Stack<Integer> localStack = new Stack<Integer>();
		boolean switcher=true;
		while(!cardQueue.isEmpty())
		{
			if(switcher)
			{
				localStack.push(cardQueue.poll());
			}
			else
				cardQueue.add(cardQueue.poll());
			switcher=!switcher;
		}
		return localStack;
	}

	public int ShuffleCounter(int countOfElement) {
		Stack<Integer> localStack = new Stack<Integer>();
		Queue<Integer> cardQueue = new LinkedList<Integer>();
		int i = 1;
		while (i <=countOfElement) {
			cardQueue.add(i++);
		}
		boolean isSame = false;
		int totalMatched=0;
		int totalIteration=0;
		//create a temp for iteration and one for validation
		Queue<Integer> tempQueue=new LinkedList<Integer>();
		int temp=0;
		for(int k=1;k<=countOfElement;k++)
		{
			temp=cardQueue.poll();
			cardQueue.add(temp);
			tempQueue.add(temp);
		}
		while (!isSame) 
		{
			totalIteration+=1;
			localStack=Shuffle(tempQueue);
			tempQueue=new LinkedList<Integer>();
			for (int j = 1; j <= countOfElement; j++) 
			{
				if(cardQueue.peek()==localStack.peek())
				{
					totalMatched+=1;
				}
				else
					totalMatched=0;
				
				//push top element behind so we can check next element
				cardQueue.add(cardQueue.poll());
				tempQueue.add(localStack.pop());
			}
			if(totalMatched==countOfElement)
				isSame=true;
		}
		return totalIteration;

	}

}
