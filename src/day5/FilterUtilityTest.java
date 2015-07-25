package day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilterUtilityTest {

	@Test
	public void scrabbleTest() {
		FilterUtility checkRegularExpression = new FilterUtility();
		boolean ifRegexCombinationMatch=checkRegularExpression.matchUserRequest("z*.ba","zumba");
		assertTrue("Correct",ifRegexCombinationMatch);
		boolean ifRegexStarMatch=checkRegularExpression.matchUserRequest("z*mba","zumba");
		assertTrue("Correct",ifRegexStarMatch);
	}
	
}