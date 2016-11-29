	package TreeAlgo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

import com.sun.javafx.geom.Path2D;

public class TreeAlgo {
	
	public static void inOrderTraverse(TreeNode node)
	{
		if (node!=null) 
		{
		inOrderTraverse(node.left);
		visit(node);
		inOrderTraverse(node.right);
		}
	}
	private static void visit(TreeNode node)
	{
		System.out.println(node.val);
		
		
	}
	
	
	public static  void preOrderTraverse(TreeNode node){
		if (node==null) return;
		visit(node);
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
		
	}
	public static void postOrderTraverse(TreeNode node){
		if (node==null) return;
		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		visit(node);
		
	}
	
	public static int getMaxDepth(TreeNode node)
	{
		return getMaxDepth(node, 0);
		
	}
	public static int getMaxDepth(TreeNode node, int currLevel)
	{
		int maxDepth=currLevel;
		int leftDepth=currLevel;
		int rightDepth=currLevel;
		if (node!=null) 
		{
			currLevel++;
			maxDepth =getMaxDepth(node.left,currLevel);
			if (leftDepth>maxDepth)
				maxDepth=leftDepth;
		//visit(node);
			System.out.println("node value -"+ node.val);
			System.out.println("node Level-"+ currLevel);
			rightDepth =getMaxDepth(node.right,currLevel);
			if (rightDepth>maxDepth)
				maxDepth=rightDepth;
		}
		return maxDepth;
			
		
		
	}

	public static void invertBinaryTree(TreeNode node)
	{
		if (node!=null) 
		{
			TreeNode temp=node.left;
			node.left=node.right;
			node.right=temp;
			invertBinaryTree(node.left);
			invertBinaryTree(node.right);
			
		}
			
		
		
	}
	public static void addToBinarySearchTree(TreeNode rootNode,TreeNode node)
	{
		// 
		//compare with current node, if less than root
		// go left
		// else go right
		if (node.val<=rootNode.val)
		{
			if(rootNode.left==null)
				rootNode.left=node;
			else
			addToBinarySearchTree(rootNode.left, node);
		}
		else
		{
			if(rootNode.right==null)
				rootNode.right=node;
			else
	
			addToBinarySearchTree(rootNode.right, node);
		}
			
		
			
		
		
	}

	public static TreeNode findLeastCommonAncester(TreeNode head, TreeNode node1, TreeNode node2)
	{
		Deque<TreeNode> pathToNode1 =new ArrayDeque<TreeNode>(1);
		Deque<TreeNode> pathToNode2 =new ArrayDeque<TreeNode>(1);
		findPathtoNode(head, node1, pathToNode1);
		findPathtoNode(head, node2, pathToNode2);
		System.out.println("Path to -"+ node1.val);
		//printListElement(pathToNode1);
		System.out.println("Path to -"+ node2.val);
		//printListElement(pathToNode2);
		
		//DemaxPathque<TreeNode> pathToNode1= pathToNode1.size()>pathToNode2.size()? pathToNode2:pathToNode1;
		//Deque<TreeNode> = pathToNode1.size()>pathToNode2.size()? pathToNode1:pathToNode2;
		TreeNode lastNode=null;
		if (pathToNode1==null || pathToNode2==null ) return null;
		while (pathToNode1.peek()!=null && pathToNode2.peek()!=null)
		{
			System.out.println("nod1 peek-"+ pathToNode1.peek().val);
			System.out.println("nod2 peek-"+ pathToNode2.peek().val);
			if (pathToNode1.peek().val==pathToNode2.peek().val)
				lastNode=pathToNode1.peek();
			if (pathToNode1.peek().val!=pathToNode2.peek().val)
			{
				return lastNode;
				
			}
			pathToNode1.pop();
			pathToNode2.pop();
		}
		return lastNode;
		//second item will be least common ancestor
	}

	
	public static boolean findPathtoNode(TreeNode head,TreeNode searchNode,Deque<TreeNode> path)
	{
		if (head==null)
		{
			//reached leaf
			return false;
		}
		else if (head.val==searchNode.val)
		{
			if (path==null) System.out.println("Path is null");
			
			System.out.println(path.size());
			path.push(head);
			return true;
		}
		
		if (findPathtoNode(head.left, searchNode, path)) 
		{
			path.push(head);
				return true;
		}
		if (findPathtoNode(head.right, searchNode, path)) 
		{
			path.push(head);
			return true;
		}
		
		return false;
	
	}
	
	public static TreeNode findLeastCommonAncesterSingleLoop(TreeNode head, TreeNode node1, TreeNode node2)
	{
	lcaResult result= findLCA(head, node1, node2);
	return result.lcaNode;
	}
	public static lcaResult findLCA(TreeNode head, TreeNode node1, TreeNode node2)
	{

		if (head==null) {
			System.out.println("######Reached to end of path");
			return new lcaResult(null,null); 
					}
		
		System.out.println("Current node-"+ head.val);
		lcaResult result;
		result=findLCA(head.left, node1, node2);
		if (result.lcaNode !=null) return result;
		TreeNode left=result.node;
		
		result=findLCA(head.right, node1, node2);
		if (result.lcaNode!=null) return result;
		
		TreeNode right=result.node; 
		System.out.println("BACK TO node-"+ head.val);
			
		if ((head.val==node1.val || head.val==node2.val)&&
		( left!=null || right!=null))
		{
			return new  lcaResult(head, head);
		}
		else if ( left!=null && right!=null)
		{
			return new lcaResult(head,head);
			
		} else if((head.val==node1.val || head.val==node2.val))
			
		{
			System.out.println("####Found node-"+ head.val);
				
			return new lcaResult(head,null);
		}
		
			
	return new lcaResult(left==null? right:left, null);
	}


	public static void printArrayElement(int[] a)
	{
		for(int item:a)
		{
			System.out.println(item);
			
		}
		
	}
	public static void printListElement(ArrayList<TreeNode> a)
	{
		/*
		 * for(int item:a.)
		{
			System.out.println(item);
			
		}
		*/
		
	}
	public static Tree getBinarySearchTree(int[] values)
	{
	Tree t= new Tree();
	TreeNode node;
	TreeNode rootNode=new TreeNode(values[0]);
	t.rootNode=rootNode;
		for (int value:values)
		{
			node=new TreeNode(value);
			TreeAlgo.addToBinarySearchTree(t.rootNode,node);
		}
		return t;
	}

	// Encodes a tree to a single string.
	/*
	 * Serialize ##technique- create string using string builder and preOrder sequence
	 * Deserialize ## preOrder, int array to maintain index, create new child object always
	 * */
    public static String serialize(TreeNode root) {
        StringBuilder sbBuilder =new StringBuilder();
        if (root==null) return null;
        searilizeNode(root, sbBuilder);
        return sbBuilder.toString();
    }
    private static void searilizeNode(TreeNode root,StringBuilder sb)
    {
    	if (root==null)
    	{
    		sb.append(root).append(",");
    		return;
    	}
    	sb.append(root.val).append(",");
    	searilizeNode(root.left, sb);
    	searilizeNode(root.right, sb);
    	//append current node for preProcessOrder
    	
    }
    
    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
    
    	String[] ar= data.split(",");
    	if (ar.length==0) return null;
    	//TreeNode root=new TreeNode(Integer.parseInt(ar[0]));
    	int[] pa = new int[1];
    	pa[0]=-1;
    	return deserializeNode(null,pa,ar);
    	
    	
     	//return root;   
    }
    private static TreeNode deserializeNode(TreeNode root,int[] pa, String[] data) {
        
    	pa[0]++;
        //base case
    	
    	
    	
    	System.out.println("Node count-"+pa[0]);
    	if ((pa[0]>=data.length-1) || data[pa[0]].equals("null")) 
    		{
        	System.out.println("Curr null node-" + pa[0]);
        	//System.out.println("Root was -" + root.value);
        	
        		
    		return null;
    		}
    	root=new TreeNode(Integer.parseInt(data[pa[0]]));
		System.out.println("current node was -" + data[pa[0]]);
    	

    	//create right node recursively
    	System.out.println("Curr node value-" + data[pa[0]]);
    	
    	//node.value=Integer.parseInt(data[index]);
    	root.left=deserializeNode(null,pa,data);
    	
    	root.right=deserializeNode(null,pa,data);
    	
    	//return new TreeNode(Integer.parseInt(data[root.nodeCount]));
    	
    	return root;
    	    
    }
}
