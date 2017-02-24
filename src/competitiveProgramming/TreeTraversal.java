package competitiveProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> inputList=new ArrayList<Integer>();
		while(sc.hasNextInt()){
			inputList.add(sc.nextInt());
		}
		TreeNode tree=createTree(inputList);
		System.out.println("tree is generated");
	}
	//in order traversal can be used to create the tree
	public static TreeNode createTree(List<Integer> inputTree){
		TreeNode root=new TreeNode();
		Stack<TreeNode> nodesToExpand=new Stack<TreeNode>();
		nodesToExpand.push(root);
		int index=0;
		TreeNode tempNode;
		while(index<inputTree.size()){
			tempNode=(TreeNode)nodesToExpand.pop();
			if(tempNode==null){
				index++;
				continue;
				
			}
			if(inputTree!=null && inputTree.size()>0 && inputTree.get(index)!=0){
				tempNode.data=inputTree.get(index);
				if(++index<inputTree.size()){
					TreeNode leftNode=new TreeNode();
					leftNode.data=inputTree.get(index);
					tempNode.leftNode=leftNode;
				}
				if(++index<inputTree.size()){
					TreeNode rightNode=new TreeNode();
					rightNode.data=inputTree.get(index);
					tempNode.rightNode=rightNode;
				}
				nodesToExpand.push(tempNode.rightNode);
				nodesToExpand.push(tempNode.leftNode);
			}
			
		}
		return root;
	}
	//print in order traversal of a tree
	public static void inOrderTraversal(TreeNode root){
		Stack<TreeNode> nodesToVisit=new Stack<TreeNode>();
		nodesToVisit.add(root);
		TreeNode tempNode;
		while(!nodesToVisit.isEmpty()){
			tempNode=nodesToVisit.pop();
			if(tempNode!=null){
				System.out.println(tempNode.data);
				if(tempNode.rightNode!=null){
					nodesToVisit.push(tempNode.rightNode);
				}
				if(tempNode.leftNode!=null){
					nodesToVisit.push(tempNode.leftNode);
				}
			}
		}
		
		
	}
	public static class TreeNode{
		public TreeNode leftNode;
		public TreeNode rightNode;
		public TreeNode(){
			
		}
		public int data;
	}

}
