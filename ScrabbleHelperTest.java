import static org.junit.Assert.*;
import org.junit.day5;

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
	public void scoreTest() {
		ScrabbleHelper list = new ScrabbleHelper();
		int score = list.calculateScore("zumba");
		assertEquals("Correct", 18, score);
		int s=list.calculateScore("radhika");
		assertEquals("Correct",15,s);
	}
}
