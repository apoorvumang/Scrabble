package day5;

public class ScrabbleWordScorer {
	public static int calculateScore(String word){
		int eachCharacterScore[] = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1,
				1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
		int score = 0;
		for(Character c: word.toCharArray()) {
			if( c >= 'a' && c <= 'z')
				score += eachCharacterScore[c - 'a'];
		}
		return score;
	}
}
