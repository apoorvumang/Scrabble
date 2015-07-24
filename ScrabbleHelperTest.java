import static org.junit.Assert.*;
import org.junit.day5;

public class ScrabbleHelperTest {

	@Test
	public void scrabbleTest() {
		ScrabbleHelper scrabble = new ScrabbleHelper();
		String sortedWord=scrabble.calculateKey("zumba");
		assertEquals("Correct", "abmuz", sortedWord);
	}
}
