package designAlgo;

public class MinStackNode {
 int val;
 int min;
 MinStackNode next;
 public MinStackNode( int val,int lastMin) {
	this.val=val;
	
	if (val<lastMin)
		this.min=val;
	else this.min=lastMin;
	 
} 
	
}
