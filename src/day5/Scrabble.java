package day5;

import java.util.*;
import java.io.*;

public class Scrabble {

  public TreeMap<Integer, String> wordsWithScore;

  public static void main(String[] args) throws IOException
  {
	String input = "tap";
	String constraint = "*c*";
	input = ScrabbleHelper.constructInput(input, constraint);
    ScrabbleHelper scrabbleHelper = new ScrabbleHelper();
    Scrabble scrabble = new Scrabble();
    Combinations c = new Combinations(input);
    for(String combination: c.combinations) {
    	if(scrabbleHelper.isValidWord(combination)) {
    		int score = ScrabbleHelper.calculateScore(combination);
    		String concatenatedString = new String();
    		for (String possibleWord: scrabbleHelper.getAnagramList(combination)) {
    			if (FilterUtility.matchUserRequest(constraint, possibleWord))
    				concatenatedString += " " + possibleWord;
    		}
    		if(concatenatedString.length() > 0)
    			scrabble.wordsWithScore.put(score, concatenatedString);
    	}
    }
    System.out.println(scrabble.wordsWithScore.descendingMap());
  }
  Scrabble() {
	  wordsWithScore = new TreeMap<Integer, String>();
  }
}
