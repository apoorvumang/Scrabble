package day5;

import java.io.IOException;

public class Driver {
	public static void main(String []args) throws IOException {
		Scrabble s = new Scrabble();
		s.printWordSuggestions("abck", "b**k");
	}
}
