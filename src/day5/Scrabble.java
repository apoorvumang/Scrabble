package day5;

import java.util.*;
import java.io.*;

public class Scrabble {

  public HashMap<String, Integer> wordsWithScore;

  public static void main(String[] args) throws IOException
  {
	
	if(args.length != 2) {
		System.out.println("Give rack and constraint as input");
		System.exit(1);
	}
	String input = args[0];
	String constraint = args[1];
	input = ScrabbleWords.constructInput(input, constraint);
    ScrabbleWords scrabbleHelper = new ScrabbleWords();
    Scrabble scrabble = new Scrabble();
    Combinations c = new Combinations(input);
    for(String combination: c.combinations) {
    	if(scrabbleHelper.isValidWord(combination)) {
    		int score = ScrabbleWordScorer.calculateScore(combination);
    		for (String possibleWord: scrabbleHelper.getAllAnagrams(combination)) {
    			if (FilterUtility.matchUserRequest(constraint, possibleWord)) {
    				scrabble.wordsWithScore.put(possibleWord, score);
    			}
    		}
    	}
    }
 	List<Word> words = PrinterUtility.sortWordsByRank(scrabble.wordsWithScore);
 	PrinterUtility.printWords(words, 10);
  }
  Scrabble() {
	  wordsWithScore = new HashMap<String, Integer>();
  }
}
