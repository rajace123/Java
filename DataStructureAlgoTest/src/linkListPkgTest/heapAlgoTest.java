package linkListPkgTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import LinkedListPkg.HeapAlgo;

public class heapAlgoTest {

	@Test
	public void slidingWindowMax() {
		int[] input;
				input=new int[]{1,3,-1,-3,5,3,6,7};
		int[]expected={3,3,5,5,6,7};
		Assert.assertArrayEquals(expected, HeapAlgo.sliddingWindowMax(input, 3));;
	}

}
