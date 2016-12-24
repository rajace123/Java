package designAlgoTestPkg;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.corba.se.impl.protocol.MinimalServantCacheLocalCRDImpl;

import designAlgo.minStackAlgo;

public class designAlgoTest {

	@Test
	public void MinStack() {
		minStackAlgo minStack= new minStackAlgo(); 
				minStack.push(4);
		assertEquals(4, minStack.top());
	}

}
