package sortingAlgoPkg;
import static org.junit.Assert.*;

import org.junit.Test;

import searchSortAlgoPkg.BubbleSort;
import searchSortAlgoPkg.SelectionSort;
import searchSortAlgoPkg.ShellSort;
import searchSortAlgoPkg.InsertionSort;
import searchSortAlgoPkg.MergeSort;
import searchSortAlgoPkg.QuickSort;

public class sortingAlgoTest {

	@Test
	public void selectionSort() {
		int[] unsortedA= new int[]{4,5,6,2,1,7,10,3,9,8};
		int[] sortedA= new int[]{1,2,3,4,5,6,7,8,9,10};
		
		assertArrayEquals(sortedA, SelectionSort.sort(unsortedA));
	}
	@Test
	public void bubbleSort() {
		int[] unsortedA= new int[]{4,5,6,2,1,7,10,3,9,8};
		int[] sortedA= new int[]{1,2,3,4,5,6,7,8,9,10};
		
		assertArrayEquals(sortedA, BubbleSort.sort(unsortedA));
	}
	@Test
	public void InsertionSort() {
		int[] unsortedA= new int[]{4,5,6,2,1,7,10,3,9,8};
		int[] sortedA= new int[]{1,2,3,4,5,6,7,8,9,10};
		
		assertArrayEquals(sortedA, InsertionSort.sort(unsortedA));
	}
	@Test
	public void shellSort() {
		int[] unsortedA= new int[]{4,5,6,2,1,7,10,3,9,8};
		int[] sortedA= new int[]{1,2,3,4,5,6,7,8,9,10};
		
		assertArrayEquals(sortedA, ShellSort.sort(unsortedA));
	}
	@Test
	public void mergeSort() {
		int[] unsortedA= new int[]{4,5,6,2,1,7,10,3,9,8};
		int[] sortedA= new int[]{1,2,3,4,5,6,7,8,9,10};
		
		assertArrayEquals(sortedA, MergeSort.sort(unsortedA));
	}
	@Test
	public void quickSort() {
		int[] unsortedA= new int[]{4,5,6,2,1,7,10,3,9,8};
		int[] sortedA= new int[]{1,2,3,4,5,6,7,8,9,10};
		
		assertArrayEquals(sortedA, QuickSort.sort(unsortedA));
	}

}
