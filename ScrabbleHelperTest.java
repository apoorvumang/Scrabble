import static org.junit.Assert.*;
import org.junit.day5;

public class ScrabbleHelperTest {

	@Test
	public void scrabbleTest() {
		ScrabbleHelper scrabble = new ScrabbleHelper();
		String sortedWord=scrabble.calculateKey("zumba");
		assertEquals("Correct", "abmuz", sortedWord);
	}
	
	@Test
	public void scoreTest() {
		ScrabbleHelper list = new ScrabbleHelper();
		int score = list.calculateScore("zumba");
		assertEquals("Correct", 18, score);
	}
}
