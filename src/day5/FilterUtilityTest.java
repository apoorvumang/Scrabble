package day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilterUtilityTest {

	@Test
	public void scrabbleTest() {
		FilterUtility checkRegularExpression = new FilterUtility();
		boolean ifRegexCombinationMatch=checkRegularExpression.matchRegex("z*.ba","zumba");
		assertTrue("Correct",ifRegexCombinationMatch);
		boolean ifRegexStarMatch=checkRegularExpression.matchRegex("z*mba","zumba");
		assertTrue("Correct",ifRegexStarMatch);
	}
	
}