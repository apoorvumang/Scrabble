package day5;

import java.util.*;
import java.io.*;

public class Scrabble {

  public HashMap<String, Integer> wordsWithScore;
  private ScrabbleWords scrabbleWords;
  static final int MAX_SUGGESTIONS = 10;
  
  Scrabble() {
	  wordsWithScore = new HashMap<String, Integer>();
	  scrabbleWords = new ScrabbleWords();
  }

  public ArrayList<String> getScrabbleWordSuggestions(String rack, String constraint) throws IOException
  {
	String input = constructInput(rack, constraint);
    Combinations c = new Combinations(input);
    for(String combination: c.combinations) {
    	if(scrabbleWords.isValidWord(combination)) {
    		int score = ScrabbleWordScorer.calculateScore(combination);
    		for (String possibleWord: scrabbleWords.getAllAnagrams(combination)) {
    			if (FilterUtility.matchRegex(constraint, possibleWord)) {
    				wordsWithScore.put(possibleWord, score);
    			}
    		}
    	}
    }
 	ArrayList<String> words = SortUtility.sortWordsByRank(wordsWithScore);
 	return words;
  }
 
  
  public static String constructInput(String input, String constraint) {
		for(Character c : constraint.toCharArray()) {
			if(c >= 'a' && c <= 'z')
				input += c;
		}
		return input;
	}
}
