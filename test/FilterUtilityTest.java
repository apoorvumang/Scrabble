import static org.junit.Assert.*;
import org.junit.day5;

public class FilterUtilityTest {

	@Test
	public void scrabbleTest() {
		FilterUtility checkRegularExpression = new FilterUtility();
		boolean ifRegexCombinationMatch=checkRegularExpression.matchUserRequest("z*.ba","zumba");
		assertTrue("Correct",ifRegexCombinationMatch);
		boolean ifRegexStarMatch=checkRegularExpression.matchStar("z*mba","zumba");
		assertTrue("Correct",ifRegexStarMatch);
	}
	
