package linkListPkgTest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;

import  LinkedListPkg.*;

public class LinkListTest {
	
	 @Test
		        public void GetLinkedListLength()
		        {
		            MyLinkList myList=new MyLinkList();
		            LinkListAlgo.getMyLinkedList(myList);
		           // (5==LinkedListAlgo.GetLinkedListLength( myList));
		            assertEquals(5, LinkListAlgo.getLinkedListLength(myList));
		        }
		    @Test
	        public void AddNode()
		        {
		    	MyLinkList myList = new MyLinkList();// { Value = "head value" };
		    	//Node newNode=new Node();
		    	//newNode.value="head value";
		            LinkListAlgo.getMyLinkedList(myList);
		            assertEquals(5, LinkListAlgo.getLinkedListLength( myList));
		            ListNode newNode = new ListNode();//
		            newNode.val= 106 ;
		            LinkListAlgo.addNode(myList, newNode );
		            assertEquals(6, LinkListAlgo.getLinkedListLength( myList));
		            
		        }
		    @Test
		        public void Add_NthNode() throws Exception
		        {
		            MyLinkList myList = new MyLinkList() ;
		            LinkListAlgo.getMyLinkedList( myList);
		            assertEquals(5, LinkListAlgo.getLinkedListLength( myList));
			        //LinkListAlgo.printAllNode(myList);   
		            ListNode newNode = new ListNode();
		            newNode.val=31 ;
		            LinkListAlgo.insert_Nth(myList, newNode,4);
		            assertEquals(6, LinkListAlgo.getLinkedListLength( myList));
		            LinkListAlgo.printAllNode(myList);
				       
		            
		        }

		    @Test
		        public void PopNode()
		        {
		            MyLinkList myList = new MyLinkList();
		            
		            LinkListAlgo.getMyLinkedList( myList);
		            assertEquals(5, LinkListAlgo.getLinkedListLength( myList));
					   
		            LinkListAlgo.pop( myList);
		            assertEquals(4, LinkListAlgo.getLinkedListLength( myList));
					LinkListAlgo.printAllNode(myList);
		            LinkListAlgo.pop( myList);
		            //assertEquals (myList.value, LinkListAlgo.pop( myList).value);
		            assertEquals(3, LinkListAlgo.getLinkedListLength( myList));
		            LinkListAlgo.printAllNode(myList);
		            LinkListAlgo.pop( myList);   
		            //assertEquals (myList.value, LinkListAlgo.pop( myList).value);
		            assertEquals(2, LinkListAlgo.getLinkedListLength( myList));
		            LinkListAlgo.printAllNode(myList);
		            LinkListAlgo.pop( myList);   
		            //assertEquals(myList.value, LinkListAlgo.pop( myList).value);
		            assertEquals(1, LinkListAlgo.getLinkedListLength( myList));
		            LinkListAlgo.printAllNode(myList);   
		            LinkListAlgo.pop( myList);
		            //assertNull(myList);
		        }
		    	@Test
		    	public void Sum2LinkedList_Reverse_Ordered()
		    	{
		    		System.out.println("list 1");
		    		MyLinkList list1=PrepareLinkList(7, 1, 6);
		    		System.out.println("list 2");
		    		MyLinkList list2=PrepareLinkList(5, 9, 2);
		    		System.out.println("Sum them now");
		    		LinkListAlgo.sumLinkListReverseOrdered(list1, list2);
		    		
		    	}
		    	
		    	private MyLinkList PrepareLinkList(int item1,int item2,int item3)
		    {
		    	MyLinkList headLinkedList=new MyLinkList();
		    	 ListNode node1 = new ListNode();
		         node1.val=item1;
		         
		         ListNode node2 = new ListNode();
		         node2.val=item2;
		         ListNode node3 = new ListNode();
		         node3.val=item3;
		         
		         /*Node node4 = new Node() ;
		         node4.value=item4;
		         Node node5 = new Node() ;
		         node5.value=item5;
		         
		         LinkListAlgo.addNode(headLinkedList, node5);
		         LinkListAlgo.addNode(headLinkedList, node4);
		         */
		         LinkListAlgo.addNode(headLinkedList, node3);
		         LinkListAlgo.addNode(headLinkedList, node2);
		         LinkListAlgo.addNode(headLinkedList, node1);
		         //LinkListAlgo.printAllNode(headLinkedList);
		         return headLinkedList;
		    	
		    }
		    	@Test
		    	public void RemoveDuplicate()
		    	{
		    		MyLinkList list1=PrepareLinkList(7, 7,2);
		    		ListNode newNode=new ListNode();
		    		newNode.val=2;
		    		LinkListAlgo.addNode(list1, newNode);
		    		LinkListAlgo.printAllNode(list1);
		    		System.out.println("Remove Duplicate now");
		    		LinkListAlgo.removeDuplicate(list1);
		    		LinkListAlgo.printAllNode(list1);
		    		
		    	}
		    	  @Test
		    	  public void ReverseList()
			        {
			            MyLinkList myList = new MyLinkList() ;
			            //myList.value="head value" ;
			            LinkListAlgo.getMyLinkedList(myList);
			            //assertEquals(5 , LinkListAlgo.getLinkedListLength(myList));
			            LinkListAlgo.printAllNode(myList);
			            System.out.println("Reverse them now");
			            LinkListAlgo.reverseList(myList);
			            LinkListAlgo.printAllNode(myList);
			            
			        }
		    	  
		    	  @Test
			        public void findInterSection() throws Exception
			        {
			            MyLinkList myList = new MyLinkList() ;
			            //LinkListAlgo.getMyLinkedList( myList);
			            //assertEquals(5, LinkListAlgo.getLinkedListLength( myList));
				        //LinkListAlgo.printAllNode(myList);   
			           ListNode newNode8 = new ListNode();
			            newNode8.val=8 ;
			           ListNode newNode9 = new ListNode();
			            newNode9.val=9 ;
			           ListNode newNode10 = new ListNode();
			            newNode10.val=10 ;
			            LinkListAlgo.addNode(myList, newNode10);   
			          LinkListAlgo.addNode(myList, newNode9);   
			          LinkListAlgo.addNode(myList, newNode8);   
			            ListNode newNode = new ListNode();
			            newNode.val=3 ;
			           LinkListAlgo.addNode(myList, newNode);   
			            newNode = new ListNode();
			            newNode.val=2 ;
			           LinkListAlgo.addNode(myList, newNode);   
			           
			            newNode = new ListNode();
			            newNode.val=1;
			           LinkListAlgo.addNode(myList, newNode);   
			           
			            
			            LinkListAlgo.printAllNode(myList);
				           
			            MyLinkList myList2 = new MyLinkList() ;
			            
			           newNode = new ListNode();
			           newNode.val=4 ;
			           LinkListAlgo.addNode(myList2, newNode10);
			           LinkListAlgo.addNode(myList2, newNode9);
			           LinkListAlgo.addNode(myList2, newNode8);
			           LinkListAlgo.addNode(myList2, newNode);   
			           
			           LinkListAlgo.printAllNode(myList2);
			           
			           System.out.println(LinkListAlgo.getIntersectionOfListNoExtraSpace(myList.firstNode, myList2.firstNode).val);
			        }
		    	  @Test
		    	  public void LeastRecentlyUsed_Test()
		    	  {
		    		  LRUCache cache=new LRUCache(3);
		    		  printCache();
		    		  
		    		  cache.set(1,1);
		    		  printCache();
		    		  
		    		  cache.set(2,2);
		    		  printCache();
		    		  
		    		  cache.get(2);
		    		  printCache();
		    		  
		    		  cache.set(3,3);
		    		  printCache();
		    		  
		    		  cache.get(1);
		    		  printCache();
		    		  
		    		  cache.set(4, 4);
		    		  printCache();
		    		  cache.get(3);
		    		  cache.set(5, 5);
		    		  printCache();
		    		  cache.set(6, 6);
		    		    		  
		    		  printCache();
		    		  
		    	  }
		    	  private void printCache()
		    	  {
		    		  System.out.println("Printing current set");
		    		  for (Integer item: LRUCache.dl)
		    		  {
		    			  System.out.println(item);  
		    		  } 
		    	  }
		    	  @Test
			        public void IsPalindrome()
			        {
			            MyLinkList myList = new MyLinkList() ;

			            ListNode newNode = new ListNode();
			            newNode.val=1 ;
			            LinkListAlgo.addNode(myList, newNode);   
			            newNode = new ListNode();
			            newNode.val=2 ;
				        LinkListAlgo.addNode(myList, newNode);   
				        newNode = new ListNode();
				        newNode.val=3 ;
				        LinkListAlgo.addNode(myList, newNode);   
				           
				        newNode = new ListNode();
				        newNode.val=2;
				        LinkListAlgo.addNode(myList, newNode);   
				        newNode = new ListNode();
				        newNode.val=1;
				        LinkListAlgo.addNode(myList, newNode);   
				        
				        LinkListAlgo.printAllNode(myList);
				        
				        System.out.println(LinkListAlgo.CheckPalindrome(myList, 0));
			           
			        }
		    	  
		    	  
			  
}
