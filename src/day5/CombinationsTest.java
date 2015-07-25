package day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CombinationsTest {

	@Test
	public void testCombine() {
		Combinations c = new Combinations("a*b");
		assertEquals("Size of combinations should be 107", 107, c.combinations.size() );
		assertTrue("Must contain aOb", c.combinations.contains("aOb"));
		assertFalse("Must not contain abc",c.combinations.contains("abc"));
	}

}
