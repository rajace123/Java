package arrayStringTestPkg;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sun.xml.internal.ws.policy.AssertionSet;

import ArrayStringPkg.*;
public class ArrayStringTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void TestSuccess(){
	assertTrue(true);
	
	}
	
	@Test
	public void GetAllAnagramIndex(){
	
		List<Integer> list=ArrayStringAlgo.findAnagrams("cbaebabacd", "abc");
		if (list.size()==0) 
			System.out.println("No item found");
	
	
	}
	@Test
	public void GetAllAnagramIndex1(){
	List<Integer> list= ArrayStringAlgo.findAnagrams("aab", "ab");
			if (list.size()==0) 
				System.out.println("No item found");
		
		}
	@Test
	public void isRepeatString()
	{
		//assertEquals(true, ArrayStringAlgo.repeatSubstring("aa"));
		
		//assertEquals(true, ArrayStringAlgo.repeatSubstring("abab"));
		//assertEquals(false, ArrayStringAlgo.repeatSubstring("aab"));
		//assertEquals(true, ArrayStringAlgo.repeatSubstring("abcabcabcabcabc"));
		assertEquals(false, ArrayStringAlgo.repeatSubstring("babbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabb"));
		
	}
	@Test
	public void firstNonRepeatingCharacter()
	{
		assertEquals(0, ArrayStringAlgo.firstUniqueCharacter("a"));
		
		assertEquals(-1, ArrayStringAlgo.firstUniqueCharacter("aa"));
		assertEquals(0, ArrayStringAlgo.firstUniqueCharacter("dacca"));
		//assertEquals(true, ArrayStringAlgo.repeatSubstring("abcabcabcabcabc"));
		//assertEquals(false, ArrayStringAlgo.repeatSubstring("babbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabbbabbbbaabb"));
		
	}
	@Test
	public void productOfArrayExceptItself()
	{
		int[] ar= new int[]{10,3,5,6,2};
		int[] result= new int[]{180, 600, 360, 300, 900};
		//assertArrayEquals(result, ArrayStringAlgo.productOfArrayExceptItself(ar));
		assertArrayEquals(result, ArrayStringAlgo.productOfArrayExceptItselfSaveSpace(ar));
		
	}
	@Test
	public void isValidParenthesis()
	{
		//assertArrayEquals(result, ArrayStringAlgo.productOfArrayExceptItself(ar));
		//assertEquals(true, ArrayStringAlgo.validParentheses(''));
		
	}

}
