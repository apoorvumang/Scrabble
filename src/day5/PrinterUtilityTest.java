package day5;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class PrinterUtilityTest {

	@Test
	public void testSortWordsByRank() {
		HashMap <String, Integer> wordsMap = new HashMap<String, Integer>();
		wordsMap.put("abc", 5);
		wordsMap.put("def", 6);
		List<Word> words = PrinterUtility.sortWordsByRank(wordsMap);
		assertEquals("First element must be def", "def", (words.get(0).value));
	}
}
