package day5;

import java.util.*;

class AnagramListStructure{	
	List<String> anagramList;
	int score;
	
	public static int calculateScore(String word){
		int eachCharacterScore[] = { 1, 2, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1,
					1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
			int score = 0;
			char[] characterArray = word.toCharArray();

			for (int i = 0; i < characterArray.length; i++) {
				score += eachCharacterScore[Character
						.toUpperCase(characterArray[i]) - 'A'];
			}
			
			return score;
		}
    	
	AnagramListStructure(String word)
	{
		score = calculateScore(word);
		anagramList = new ArrayList<String>();
		anagramList.add(word);
	}
}
