package day5;

import java.util.*;
import java.io.*;

class ScrabbleHelper
{
	public Map <String, AnagramListStructure> anagramMap;
	
	public static String constructInput(String input, String constraint) {
		for(Character c : constraint.toCharArray()) {
			if(c >= 'a' && c <= 'z')
				input += c;
		}
		return input;
	}
	
	public boolean isValidWord(String word){
    	return anagramMap.containsKey(calculateKey(word.toLowerCase()));
    }
	
	public List<String> getAnagramList(String word) {
		return anagramMap.get(calculateKey(word.toLowerCase())).anagramList;
	}
    
	public static int calculateScore(String word){
		int eachCharacterScore[] = { 1, 2, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1,
				1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
		int score = 0;
		for(Character c: word.toCharArray()) {
			if( c >= 'a' && c <= 'z')
				score += eachCharacterScore[c - 'a'];
		}
		return score;
	}
	
	
	ScrabbleHelper() throws IOException
	{	
		anagramMap = new HashMap<String, AnagramListStructure>();
		File file = new File("C:\\sowpods.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String word = br.readLine();
		while(word != null) {
			String key = calculateKey(word);
			AnagramListStructure anagramListStructure;
			if(anagramMap.containsKey(key)){
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
		
}
