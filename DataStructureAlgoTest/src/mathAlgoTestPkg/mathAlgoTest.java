package mathAlgoTestPkg;

import static org.junit.Assert.*;

import org.junit.Test;

import mathAlgoPkg.mathAlgo;
import mathAlgoPkg.maxProfit;

public class mathAlgoTest {

	@Test
	public void getMaxRotatingSum() {
		assertEquals(26, mathAlgo.rotateArrayAndGetMaxSum(new int[]{4, 3, 2, 6}));
	}
	@Test
	public void trapRainWater() {
		assertEquals(6, mathAlgo.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
	}
	@Test
	public void getMaxStockProfit() {
		assertEquals(5, maxProfit.getMaxStockProfit((new int[]{7, 1, 5, 3, 6, 4})));
		assertEquals(0, maxProfit.getMaxStockProfit((new int[]{7, 6, 4, 3, 1})));
		
	}
}
