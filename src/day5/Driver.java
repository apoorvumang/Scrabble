package day5;

import java.io.IOException;
import java.util.ArrayList;

public class Driver {
	public static void main(String []args) throws IOException {
		Scrabble s = new Scrabble();
		ArrayList<String> words = s.getScrabbleWordSuggestions("abck", "*");
		System.out.println(words);
	}
}
