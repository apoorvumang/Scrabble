import java.util.*;
import java.util.Map.Entry;

public class WordMapCreation {
	public HashMap<String, List<String>> createWordToScoreMap() {
		
		ScrabbleHelper helper = new ScrabbleHelper();
		HashMap<String, String> anagramHashMap;
		anagramHashMap = helper.getMap();	
		HashMap<String, List<String>> WordMap =  new HashMap<String, List<String>>();
		
		List<String> wordList;
		AnagramListStructure listStructObj;
		String key;
		
		for (Entry<String, AnagramListStructure> entry : anagramHashMap.entrySet()) {
			WordMap.put(entry.getKey(), entry.getValue().anagramList);			
		}	
		
		return WordMap;
	}
}
