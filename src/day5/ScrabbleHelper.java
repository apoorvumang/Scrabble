package day5;

import java.util.*;
import java.io.*;

class ScrabbleHelper
{
	public Map <String, AnagramListStructure> anagramMap;
	
	ScrabbleHelper() throws IOException
	{
		anagramMap = new HashMap<String, AnagramListStructure>();
		File file = new File("C:\\sowpods.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String word = br.readLine();
		while(word != null) {
			String key = calculateKey(word);
			AnagramListStructure anagramListStructure;
			if(anagramMap.containsKey(word)){
				anagramListStructure = anagramMap.get(key);
				anagramListStructure.anagramList.add(word);
			}
			else{
				anagramListStructure = new AnagramListStructure(word);
				anagramMap.put(key, anagramListStructure);
			}
			word = br.readLine();
		}
		br.close();
	}
	
	public String calculateKey(String word)
	{
        char[] charsInWord = word.toCharArray();
        Arrays.sort(charsInWord);
        String sortedWord = new String(charsInWord);
        return sortedWord;		
	}
		
	
	public static int calculateScore(String word){
	int eachCharacterScore[] = { 1, 2, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1,
				1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
		int score = 0;
		char[] characterArray = word.toCharArray();

		for (int i = 0; i < characterArray.length; i++) {
			score += eachCharacterScore[Character
					.toUpperCase(characterArray[i]) - INITIAL_CHARACTER];
		}
		
		return score;
	}

	private int[] countLetters(String word){
		//TODO: do we need this? 
    	int countOfLettersInWord[] = new int[26];
    	for(int i=0;i<word.length();i++) {
    		countOfLettersInWord[Character.toLowerCase(word.charAt(i)) - 'a']++;
    	}	
	return countOfLettersInWord;	
 }
}
