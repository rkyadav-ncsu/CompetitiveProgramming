package competitiveProgramming;

import java.util.Scanner;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node node=new Node();
		Node finalNode=new Node();
		while(sc.hasNextInt()){
			Node tempNode=new Node();
			tempNode.data=sc.nextInt();
			tempNode.next=null;
			if(node.data==0){
				node=tempNode;
				finalNode=node;
			}
			else
			{
				node.next=tempNode;
				node=node.next;
			}
		}
		finalNode=reverseList(finalNode);
		
		//print the resultset
		while(finalNode!=null){
			System.out.println(finalNode.data);
			finalNode=finalNode.next;
		}
	}
	
	public static Node reverseList(Node head){
		Node _tempNode=head;
		Node finalNode=null;
		while(head!=null){
			_tempNode=head.next;
			head.next=finalNode;
			finalNode=head;
			head=_tempNode;
		}
		return finalNode;
	}
	public static class Node{
		public Node(){
			
		}
		Node next;
		int data;
	}

}
