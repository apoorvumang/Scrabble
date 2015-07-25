package day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScrabbleWordScorerTest {

	@Test
	public void testCalculateScore() {
		assertEquals("Score of abc should be 7", 7, ScrabbleWordScorer.calculateScore("abc"));
	}

}
