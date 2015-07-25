package day5;

import java.util.*;
import java.io.*;

class ScrabbleWords
{
	public Map <String, AnagramListStructure> anagramMap;
	
	public boolean isValidWord(String word){
    	return anagramMap.containsKey(calculateKey(word.toLowerCase()));
    }
	
	public List<String> getAllAnagrams(String word) {
		return anagramMap.get(calculateKey(word.toLowerCase())).anagramList;
	}
    
	
	ScrabbleWords()
	{	
		anagramMap = new HashMap<String, AnagramListStructure>();
		try {
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
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public String calculateKey(String word)
	{
        char[] charsInWord = word.toCharArray();
        Arrays.sort(charsInWord);
        String sortedWord = new String(charsInWord);
        return sortedWord;		
	}
		
}
