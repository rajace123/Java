package arrayStringTestPkg;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import searchSortAlgoPkg.searchSortAlgo;

public class breadthFirstSearchTest {

	/*"hit", "cog", ["hot","cog","dot","dog","hit","lot","log"]
"hit", "cog", ["hot","hit","cog","dot","dog"]
"red", "tax", ["ted","tex","red","tax","tad","den","rex","pee"]*/
	@Test
	public void test() {
		HashSet<String> set= new HashSet<String>(Arrays.asList("hot","cog","dot","dog","hit","lot","log"));
		
	 assertEquals(5,searchSortAlgo.ladderLength("hit", "cog",set));
	}

}
