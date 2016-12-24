package LinkedListPkg;

import java.util.HashMap;
import java.util.Random;

public class LinkListDeepCopyAlgo {
	
	public RandomListNode deepCopyList(RandomListNode list)
	{
		if (list==null) return null;
		HashMap<RandomListNode, RandomListNode> newList=new HashMap<RandomListNode, RandomListNode>();
		
		//Create new object set
		RandomListNode temp=list;
		while (temp!=null)
		{
			newList.put(temp, new RandomListNode(temp.label));
			temp=temp.next;
			
		}
		
		// now set next and random pointer
		
		temp=list;
		
		while (temp!=null)
		{
			RandomListNode newNode= newList.get(temp);
			newNode.next=newList.get(temp.next);
			newNode.random=newList.get(temp.random);
			temp=temp.next;
		}
		
		return newList.get(list);
	}

}
