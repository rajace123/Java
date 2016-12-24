package designAlgo;

import java.util.Stack;



public class minStackAlgo {

	Stack<MinStackNode> nodeStack= new Stack<MinStackNode>();
	  /** initialize your data structure here. */
       
    public void push(int x) {
    	System.out.println("push-"+x);
    	int lastMin;
    	if (nodeStack.size()>0)
    		lastMin=nodeStack.peek().min;
    	else
    		lastMin=x;
    		
    	nodeStack.push(new MinStackNode(x, lastMin));
        
    }
    
    public void pop() {
    	System.out.println("POP");
        
    	if (nodeStack.size()>0)
    		nodeStack.pop();
        
    }
    
    public int top() {
    	System.out.println("Top");
        
    	if (nodeStack.size()>0)
    		return nodeStack.peek().val;
    	else
    		return -1;
    }
    
    public int getMin() {
    	System.out.println("get min");
        
    	if (nodeStack.size()>0)
    		return nodeStack.peek().min;
    	else
    		return -1;
     }
	
}
