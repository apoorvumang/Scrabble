package day5;
import static org.junit.Assert.*;

import org.junit.Test;

public class ScrabbleHelperTest {

	@Test
	public void scrabbleTest() {
		ScrabbleHelper scrabble = new ScrabbleHelper();
		String sortedWord=scrabble.calculateKey("zumba");
		assertEquals("Correct", "abmuz", sortedWord);
		String sortedWordnext=scrabble.calculateKey("radhika");
		assertEquals("Correct","aadhikr",sortedWordnext);
	}
	
	@Test
	public void scrabbleTestforNullString() {
		ScrabbleHelper scrabble = new ScrabbleHelper();
		String sortedWord=scrabble.calculateKey("");
		assertEquals("", sortedWord);
	}
	
	public void scrabbleTestforStringwithSpace() {
		ScrabbleHelper scrabble = new ScrabbleHelper();
		String sortedWord=scrabble.calculateKey("  test  ");
		assertEquals("test  ", sortedWord);
	}
	
	public void scrabbleTestofSortedString() {
		ScrabbleHelper scrabble = new ScrabbleHelper();
		String sortedWord=scrabble.calculateKey("aaaa");
		assertEquals("aaaa", sortedWord);
	}
	
	@Test
	public void scoreTest() {
		ScrabbleHelper list = new ScrabbleHelper();
		int score = list.calculateScore("zumba");
		assertEquals("Correct", 17, score);
		int s=list.calculateScore("radhika");
		assertEquals("Correct",15,s);
	}
}
