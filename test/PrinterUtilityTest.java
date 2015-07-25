package day5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrinterUtilityTest {

	public void PrintTest(){
		PrinterUtility pu=new PrinterUtility();
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("hello",12);
		hm.put("hellboy",13);
		hm.put("asdheat",15);
		List<Word> output = PrinterUtility.sortWordsByRank(hm);
		
		List <Word> expetedOp=new ArrayList<Word>();
		Word w= new Word("asdheat",15);
		expetedOp.add(w);
		 w= new Word("hellboy",13);
		 expetedOp.add(w);
		 w= new Word("hello",12);
		 expetedOp.add(w);
		assertEquals("Correct" ,output,expetedOp );
		
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortWordsByRank() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintWords() {
		fail("Not yet implemented");
	}

}
	}

}
