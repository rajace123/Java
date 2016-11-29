package mathAlgoTestPkg;

import static org.junit.Assert.*;

import org.junit.Test;

import mathAlgoPkg.mathAlgo;

public class mathAlgoTest {

	@Test
	public void getMaxRotatingSum() {
		assertEquals(26, mathAlgo.rotateArrayAndGetMaxSum(new int[]{4, 3, 2, 6}));
	}

}
