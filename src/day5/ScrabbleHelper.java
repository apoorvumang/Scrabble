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
		
	

}
