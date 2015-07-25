package day5;
import static org.junit.Assert.*;

import org.junit.Test;

public class ScrabbleWordsTest {

	@Test
	public void scrabbleTest() {
		ScrabbleWords scrabble = new ScrabbleWords();
		String sortedWord=scrabble.calculateKey("zumba");
		assertEquals("Correct", "abmuz", sortedWord);
		String sortedWordnext=scrabble.calculateKey("radhika");
		assertEquals("Correct","aadhikr",sortedWordnext);
	}
	
	@Test
	public void scrabbleTestforNullString() {
		ScrabbleWords scrabble = new ScrabbleWords();
		String sortedWord=scrabble.calculateKey("");
		assertEquals("", sortedWord);
	}
	
	public void scrabbleTestforStringwithSpace() {
		ScrabbleWords scrabble = new ScrabbleWords();
		String sortedWord=scrabble.calculateKey("  test  ");
		assertEquals("test  ", sortedWord);
	}
	
	public void scrabbleTestofSortedString() {
		ScrabbleWords scrabble = new ScrabbleWords();
		String sortedWord=scrabble.calculateKey("aaaa");
		assertEquals("aaaa", sortedWord);
	}
	
}
