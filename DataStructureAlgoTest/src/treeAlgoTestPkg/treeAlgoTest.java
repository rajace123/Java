package treeAlgoTestPkg;

import static org.junit.Assert.*;

import org.junit.Test;

import TreeAlgo.Tree;
import TreeAlgo.TreeAlgo;
import TreeAlgo.TreeAlgoIsland;
import TreeAlgo.TreeNode;

public class treeAlgoTest {

	@Test
	public void PrintTree_InOrderTest() {
		System.out.println("Print In Order");
		TreeAlgo.inOrderTraverse(GetTreeNode().rootNode);
	
	}
	@Test
	public void PrintTree_PreOrderTest() {
		System.out.println("Print Pre Order");
		
		TreeAlgo.preOrderTraverse(GetTreeNode().rootNode);
	
	}
	@Test
	public void PrintTree_PostOrderTest() {
		System.out.println("Print Post Order");
		TreeAlgo.postOrderTraverse(GetTreeNode().rootNode);
	
	}
	@Test
	public void GetMaxDepthTest() {
		System.out.println(TreeAlgo.getMaxDepth(GetTreeNode().rootNode));
	
	}
	
	@Test
	public void invertBinaryTreeTest() {
		Tree t= GetTreeNode();
		TreeAlgo.preOrderTraverse(t.rootNode);
		TreeAlgo.invertBinaryTree(t.rootNode);
		System.out.println("Inverted");
		TreeAlgo.preOrderTraverse(t.rootNode);
		
	}
	@Test
	public void getLeastCommonAncestor() {
		int []treeValues=new int[]{7,4,3,5,1,16,11,18,9,12,8,10,13,20};
		Tree t= TreeAlgo.getBinarySearchTree(treeValues);
		TreeNode node1=new TreeNode(9);
		TreeNode node2=new TreeNode(18);
		TreeAlgo.inOrderTraverse(t.rootNode);
		//assertEquals(16, TreeAlgo.findLeastCommonAncesterSingleLoop(t.rootNode, node1, node2).val);
		//assertEquals(16, TreeAlgo.findLeastCommonAncester(t.rootNode, node1, node2).val);
		
		node1=new TreeNode(3);
		 node2=new TreeNode(4);
		TreeAlgo.inOrderTraverse(t.rootNode);
		
		//assertEquals(4, TreeAlgo.findLeastCommonAncester(t.rootNode, node1, node2).val);
		assertEquals(4, TreeAlgo.findLeastCommonAncester(t.rootNode, node1, node2).val);
		
	}
	@Test
	public void addToBinarySearchTreeTest() {
		Tree t= new Tree();
		
		TreeNode node1=new TreeNode(10);
		
		t.rootNode=node1;
		TreeNode node2= new TreeNode(8);
		TreeAlgo.addToBinarySearchTree(t.rootNode,node2);
		
		TreeNode node3=new TreeNode(12);
		TreeAlgo.addToBinarySearchTree(t.rootNode,node3);
		
		TreeNode node4= new TreeNode(4);
		TreeAlgo.addToBinarySearchTree(t.rootNode,node4);
		
		TreeNode node5=new TreeNode(9);
		TreeAlgo.addToBinarySearchTree(t.rootNode,node5);
		
		TreeNode node6= new TreeNode(11);
		TreeAlgo.addToBinarySearchTree(t.rootNode,node6);
		
		TreeNode node7=new TreeNode(14);
		TreeAlgo.addToBinarySearchTree(t.rootNode,node7);
		
		System.out.println("Print tree inOrder");
		TreeAlgo.inOrderTraverse(t.rootNode);
		System.out.println("Print tree postOrder");
		TreeAlgo.postOrderTraverse(t.rootNode);
	}
	private Tree GetTreeNode()
	{
		Tree tree=new Tree();
		TreeNode node1=new TreeNode(1);
		TreeNode node2= new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		node1.left=node2;
		node1.right=node3;
		TreeNode node4= new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6= new TreeNode(6);
		TreeNode node7=new TreeNode(7);
		TreeNode node8=new TreeNode(8);
		
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node3.right=node7;
		node7.left=node8;
		tree.rootNode=node1;
		return tree;
	}
	
	@Test
	public void searializeBinaryTree() {
		System.out.println("Serialize input");
		TreeNode node=GetTreeNode().rootNode;
		TreeAlgo.preOrderTraverse(node);
		String sData=TreeAlgo.serialize(node);
		System.out.println(sData);
		TreeNode newNode=TreeAlgo.deserialize(sData);
		TreeAlgo.preOrderTraverse(newNode);
		
	}

	@Test
	public void findIsland()
	{
		/*
		 * 11110
11010
11000
00000
		 * */
		char[][]ar=new char[4][5];
		ar[0][0]='1';ar[0][1]='1';ar[0][2]='1';ar[0][3]='1';ar[0][4]='0';
		ar[1][0]='1';ar[1][1]='1';ar[1][2]='1';ar[1][3]='1';ar[1][4]='0';
		ar[2][0]='1';ar[2][1]='1';ar[2][2]='1';ar[2][3]='1';ar[2][4]='0';
		ar[3][0]='1';ar[3][1]='1';ar[3][2]='1';ar[3][3]='1';ar[3][4]='0';
		
		assertEquals(1, TreeAlgoIsland.numIslands(ar));
		
		ar=new char[4][5];
		ar[0][0]='1';ar[0][1]='1';ar[0][2]='0';ar[0][3]='0';ar[0][4]='0';
		ar[1][0]='1';ar[1][1]='1';ar[1][2]='0';ar[1][3]='0';ar[1][4]='0';
		ar[2][0]='0';ar[2][1]='0';ar[2][2]='1';ar[2][3]='0';ar[2][4]='0';
		ar[3][0]='0';ar[3][1]='0';ar[3][2]='0';ar[3][3]='1';ar[3][4]='0';
		assertEquals(3, TreeAlgoIsland.numIslands(ar));
	}
}
