package day5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class SortUtilityTest {

	@Test
	public void testSortWordsByRank() {
		HashMap <String, Integer> wordsMap = new HashMap<String, Integer>();
		wordsMap.put("abc", 5);
		wordsMap.put("def", 6);
		ArrayList<String> words = SortUtility.sortWordsByRank(wordsMap);
		assertTrue("First element must be def 6", "def 6".equals(words.get(0)));
	}
}
