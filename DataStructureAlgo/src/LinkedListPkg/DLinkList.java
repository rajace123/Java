package LinkedListPkg;

public class DLinkList {
	public static DLinkListNode firstNode;
	public static DLinkListNode lastNode;
	public void addNode(int key)
	{
		DLinkListNode node=new DLinkListNode();
		node.val=key;
		if (firstNode==null) {
			firstNode=node;
			lastNode=node;
		}
		else
		{
			firstNode.prev=node;
			node.next=firstNode;
			firstNode=node;
		}
		
	}
	public int removeNode(int key)
	{
		
		if (firstNode==null) return 0;
		DLinkListNode temp=firstNode;
		
		/*if (temp.next==null) 
		{
			firstNode=null;
			lastNode=null;
			return temp.val;
		}*/
		
		while (temp!=null)
		{
			if (temp.val==key)
			{
				if (temp.prev!=null)
				{
					if (temp.next==null)
					{
						lastNode=temp.prev;
					}
					temp.prev.next=temp.next;
						
				}
				else if (temp.next!=null)
				{
					firstNode=temp.next;
				}
				else
				{
					firstNode=null;
					lastNode=null;
				}
				
				
				break;
			
			}
				temp=temp.next;
		}
			
		return temp.val;
	
	}
	public int removeLastNode()
	{
		
		if (firstNode==null) return 0;
		int key=lastNode.val;
		if (lastNode.prev!=null)
			lastNode=lastNode.prev;

		lastNode.next=null;
		
		return key;
	
	}

}
