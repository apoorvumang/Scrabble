package day5;

import java.util.*;

class AnagramListStructure{	
	public List<String> anagramList;
	public int score;
	
	
    	
	AnagramListStructure(String word)
	{
		score = ScrabbleHelper.calculateScore(word);
		anagramList = new ArrayList<String>();
		anagramList.add(word);
	}
}
