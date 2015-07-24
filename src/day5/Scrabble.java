package day5;

import java.util.*;
import java.io.*;

public class Scrabble {

  public HashMap<String, Integer> wordsWithScore;

  public static void main(String[] args) throws IOException
  {
	String input = "hl*el";
	String constraint = "*";
	input = ScrabbleHelper.constructInput(input, constraint);
    ScrabbleHelper scrabbleHelper = new ScrabbleHelper();
    Scrabble scrabble = new Scrabble();
    Combinations c = new Combinations(input);
    for(String combination: c.combinations) {
    	if(scrabbleHelper.isValidWord(combination)) {
    		int score = ScrabbleHelper.calculateScore(combination);
    		for (String possibleWord: scrabbleHelper.getAnagramList(combination)) {
    			if (FilterUtility.matchUserRequest(constraint, possibleWord)) {
    				scrabble.wordsWithScore.put(possibleWord, score);
    			}
    		}
    	}
    }
 	List<Word> words = PrinterUtility.sortWordsByRank(scrabble.wordsWithScore);
 	PrinterUtility.printWords(words);
  }
  Scrabble() {
	  wordsWithScore = new HashMap<String, Integer>();
  }
}
