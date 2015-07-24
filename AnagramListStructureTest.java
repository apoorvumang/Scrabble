import static org.junit.Assert.*;
import org.junit.day5;

public class AnagramListStructureTest {

	@Test
	public void scrabbleTest() {
		AnagramListStructure list = new AnagramListStructure();
		int score = list.calculateScore("zumba");
		assertEquals("Correct", 18, score);
	}

}
