package LinkedListPkg;

import java.util.HashMap;
import java.util.Hashtable;

import org.w3c.dom.NodeList;

//import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

public class LinkListAlgo {

	public static int getLinkedListLength(MyLinkList headLinkedList)
      {
          //validate
          if (headLinkedList == null) return 0;
         // int counter = 1;
          //Loop while next node not null
         /* while (headLinkedList.nextNode != null)
          {
              headLinkedList = headLinkedList.nextNode;
              counter++;
          }*/
          return headLinkedList.count;

      }

	public static void getMyLinkedList( MyLinkList headLinkedList)
     {
		
         ListNode node1 = new ListNode();
         node1.val=1;
         
         ListNode node2 = new ListNode();
         node2.val=2;
         ListNode node3 = new ListNode();
         node3.val=3;
         
         ListNode node4 = new ListNode() ;
         node4.val=4;
         ListNode node5 = new ListNode() ;
         node5.val=5;
         
         addNode(headLinkedList, node5);
         addNode(headLinkedList, node4);
         addNode(headLinkedList, node3);
         addNode(headLinkedList, node2);
         addNode(headLinkedList, node1);
        // printAllNode(headLinkedList);
     }

	 public static void addNode( MyLinkList headLinkedList, ListNode newNode)
      {
          //validate
          if (headLinkedList == null) return ;
          //if only head node
          if (headLinkedList.firstNode == null)
          {
              headLinkedList.firstNode = newNode;
              headLinkedList.lastNode = newNode;
             // headLinkedList.count++;
              
          }
          else
          {
        	  newNode.next=headLinkedList.firstNode;
        	  headLinkedList.firstNode=newNode;
        	  
          }
         headLinkedList.count++;
          
      }

      public static ListNode pop(MyLinkList headLinkedList)
      {
          ListNode returnData ;
          //validate
          if (headLinkedList.firstNode == null) return null;
          //if only head node
          returnData = headLinkedList.firstNode;
          headLinkedList.count--;
          
          if (headLinkedList.firstNode.next == null)
          {
              headLinkedList.firstNode = null;
              headLinkedList.lastNode = null;
          }
          else
          {
        	headLinkedList.firstNode=headLinkedList.firstNode.next;  
        	  
          }
          return returnData;
          
      }
      public static void insert_Nth(MyLinkList headLinkedList, ListNode newNode,int location) throws Exception
      {
          //Validate
          if (headLinkedList == null) ;
          //if only head node
          if (headLinkedList.count < location)
          {
              throw new Exception("Index out of range");
          }
              if (location == 1)
              {
            	  newNode.next=headLinkedList.firstNode;
            	  headLinkedList.firstNode = newNode;
            	  headLinkedList.count++;
            	  return;
              }
              if (location == headLinkedList.count)
              {
            	  headLinkedList.lastNode= newNode;
            	  headLinkedList.count++;
            	  return;
              }
                  
          //printAllNode(headLinkedList);

          //Loop while next node not null
          ListNode temphead = headLinkedList.firstNode;
          int counter = 1;
          while (temphead.next != null && counter<location)
          {
              temphead = temphead.next;
              //loop till reach end of list
              counter++;
          }
           
          newNode.next=temphead.next;
          temphead.next = newNode;
          headLinkedList.count++;
          
          

       }
      public static void printAllNode(MyLinkList headLinkedList) 
      {
          //Validate
          if (headLinkedList == null) return ;
          //if only head node
          ListNode temphead=headLinkedList.firstNode;
          while (temphead != null )
          {
        	  System.out.println(temphead.val);
              temphead = temphead.next;
             
          }
           
       }
      /*
       * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
		Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
		Output: 7 -> 0 -> 8
       * 
       * */
      public static MyLinkList sumLinkListReverseOrdered(MyLinkList list1,MyLinkList list2)
      {
    	  MyLinkList thirdList=new MyLinkList();
    	  if (list1.count>list2.count){
    	  // fill list 2
    	  }
    	  
    	  else if (list2.count>list1.count){
    	  //fill list 1
    	  }  
    	  int i=0;
    	  int currSum=0;
    	  int currVal=0;
    	  int carry=0;
    	  ListNode n;
    	  while (list1.count>0)
    	  {
    		  
    		  n=new ListNode();
    		  currSum=LinkListAlgo.pop(list1).val+LinkListAlgo.pop(list2).val;
    		  if (currSum+carry>10)
    		  {
    			  currVal=(currSum+carry)%10; 
    			  carry=(currSum+carry)/10 ;
     			 
    		  }
    		  else
    		  {
    			  currVal=currSum+carry; 
    			  carry=0 ;
     			 
    		  }
    		 n.val=currVal;
    		 LinkListAlgo.addNode(thirdList, n);
    	  i++;
    	  }
    	  if (carry>0)
    	  {
    		  n=new ListNode();
    	  n.val=carry;
    	  LinkListAlgo.addNode(thirdList, n);
    	  }
    	  LinkListAlgo.printAllNode(thirdList);
    	  return thirdList;
      }
     
      public static void removeDuplicate(MyLinkList headLinkedList) 
		{
		    //Validate
		    if (headLinkedList == null) return ;
		    //if only head node
		    ListNode temphead=headLinkedList.firstNode;
		    @SuppressWarnings("rawtypes")
			Hashtable ht= new Hashtable();
		    ListNode prevNode=temphead;
		    while (temphead != null )
		    {
		  	  //System.out.println(temphead.value);
		  	  if (ht.containsKey(temphead.val))
		  	  {
		  		  //remove this duplicate node
		  		  prevNode.next=temphead.next;
		  		  temphead=temphead.next;
		  		  continue;
		  	  }
		  	  else
		  	  {
		  		  //add current node to ht
		  		  ht.put(temphead.val,temphead.val);
		  	  }
		      prevNode=temphead;
		  	  temphead = temphead.next;
		       
		    }
		} 
      
      public static ListNode reverseList(MyLinkList headLinkedList) 
		{
		    //Validate
    	   ListNode node= headLinkedList.firstNode;
		    if (headLinkedList == null) return null;
		    //if only head node
		    return reverseNodeLink(null, node);
		    
		}
      private static ListNode reverseNodeLink(ListNode prevNode,ListNode nextNode)
      {
    	  ListNode lastNode;
    	  if (nextNode.next==null)
    	  {
    		nextNode.next=prevNode;
    		lastNode= nextNode;
    		
    	  }
    	  else
    	  {
    		  lastNode= reverseNodeLink(nextNode, nextNode.next);
    		  nextNode.next=prevNode;
    	  }
    	  return lastNode;
      }
 
      public static boolean CheckPalindrome(MyLinkList headLinkedList,int length) 
		{
		    //Validate
		    if (headLinkedList == null) return false;
		    if (headLinkedList.firstNode.next==null) return true;
		    //if only head node
		    ListNode temp=headLinkedList.firstNode;
		    
		    ListNode reverseNode= reverseList(headLinkedList);
		    //now loop through both list and check for items
		    while (reverseNode!=null)
		    {
		    	if (reverseNode.val!=temp.val)
		    	{
		    		return false;
		    	}
		    	
		    	temp=temp.next;
		    	reverseNode=reverseNode.next;
		    }
		    return true;
		}
   /*
    * 141. Linked List Cycle   QuestionEditorial Solution  My Submissions
		Given a linked list, determine if it has a cycle in it.
		Follow up:
		Can you solve it without using extra space?
    * */
      public static boolean checkLinkedListCycle(ListNode headList)
      {
    	  Hashtable<Integer, Boolean> ht=new Hashtable<Integer, Boolean>();
    	  if (headList==null || headList.next==null) return false;
    	  while (headList.next!=null)
    	  {
    		  if (ht.containsKey(headList.val))
    		  {
    			  //cycle detected
    			  return true;
    			  
    		  }
    		  else
    			  
    		  ht.put(headList.val, true);
    		  
    		  headList=headList.next;
    	  }
    	  
    	  return false;
      }

      /*
       * 160. Intersection of Two Linked Lists   QuestionEditorial Solution  My Submissions
			Write a program to find the node at which the intersection of two singly linked lists begins.
		For example, the following two linked lists:
		A:          a1 - a2
		                   	\
		                     c1 - c2 - c3
		                   	/            
		B:     b1 - b2 - b3
				begin to intersect at node c1.
		
		Notes:
		
		If the two linked lists have no intersection at all, return null.
		The linked lists must retain their original structure after the function returns.
		You may assume there are no cycles anywhere in the entire linked structure.
		Your code should preferably run in O(n) time and use only O(1) memory.
       * */
public static ListNode getIntersectionOfList(ListNode head1, ListNode  head2)
{
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	if (head1==null || head2==null || head1.next==null || head2.next==null) return null;
	while(head1!=null && head2!=null)
	{
		if (hm.containsKey(head2.val))
		{
			// intersection point
			return head2;
		}
		hm.put(head1.val, head1.val);
		head1=head1.next;
		head2=head2.next;
		
	}
	return null;
}
public static ListNode getIntersectionOfListNoExtraSpace(ListNode head1, ListNode  head2)
{
	//HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	//HeadNodetemphead1=head1;
	ListNode temp1=head1;
	ListNode temp2=head2;
	int head1Length=0;int head2Length=0;
	
	if (temp1==null || temp2==null || temp1.next==null || temp2.next==null) return null;
	while(temp1!=null || temp2!=null)
	{
		if (temp1!=null && temp2!=null)
		{
			if (temp1.equals(temp2))return temp1;
		}
		//get length for both lists
		if (temp1!=null)
		{
			head1Length++;
			temp1=temp1.next;
					
		}
		
		if (temp2!=null)
		{
			head2Length++;
			temp2=temp2.next;
					
		}
		
	}
	if (head1Length==head2Length) return null;
	System.out.println("Head 1 LENGTH IS -" + head1Length );
	System.out.println("Head 2 LENGTH IS -" + head2Length );
	temp1=head1;
	temp2=head2;
	//ReInitialize pointer and advance them 
	if (head1Length>head2Length)
	{
		int count=0;
		while (count<head1Length-head2Length)
		{
			temp1=temp1.next;
			count++;
		}
		
	}
	else
	{
		int count=0;
		while (count<head2Length-head1Length)
		{
			temp2=temp2.next;
			count++;
		}
	}
	while(temp1!=null && temp2!=null)
	{
			if (temp1.equals(temp2))return temp1;
			temp1=temp1.next;
			temp2=temp2.next;
		
	}
	//Now match again
	while(temp1!=null && temp2!=null)
	{
			if (temp1.equals(temp2))return temp1;
		
	}
	return null;
}

}