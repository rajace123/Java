package arrayStringTestPkg;


import static org.junit.Assert.*;

import org.junit.Test;

import searchSortAlgoPkg.searchSortAlgo;

public class binarySearchTest {

	@Test
	public void search2DMatrix_Sorted() {
		
		int[][] ar= new int[][]{{1,   4,  7, 11, 15},
			  {2,   5,  8, 12, 19},
			  {3,   6,  9, 16, 22},
			  {10, 13, 14, 17, 24},
			  {18, 21, 23, 26, 30}};
		//assertTrue(searchSortAlgo.searchMatrix(ar, 5));
		//assertFalse(searchSortAlgo.searchMatrix(ar, 20));
		ar= new int[][]{{-5}};
		//assertTrue(searchSortAlgo.searchMatrix(ar, -5));
		ar= new int[][]{{-1,3}};
		//assertTrue(searchSortAlgo.searchMatrix(ar, 3));
		ar= new int[][]{{1,4},{2,5}};
		assertTrue(searchSortAlgo.searchMatrix(ar, 2));
	
	}

}
