package day5;

import java.util.*;
import java.io.*;

public class Scrabble {

  public HashMap<String, Integer> possibleWordsWithScore;

  public static void main(String[] args) throws IOException
  {
	String input = "ab*";
    ScrabbleHelper scrabbleHelper = new ScrabbleHelper();
    Scrabble scrabble = new Scrabble();
    Combinations c = new Combinations(input);
    for(String combination: c.combinations) {
    	if(scrabbleHelper.isValidWord(combination)) {
    		int score = ScrabbleHelper.calculateScore(combination);
    		for (String possibleWord: scrabbleHelper.getAnagramList(combination)) {
    			scrabble.possibleWordsWithScore.put(possibleWord, score);
    		}
    	}
    }
    System.out.println(scrabble.possibleWordsWithScore);
  }
  
  Scrabble() {
	  possibleWordsWithScore = new HashMap<String, Integer>();
  }
}
