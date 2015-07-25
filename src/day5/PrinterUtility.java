package day5;

import java.util.Map;
import java.util.*;

public class PrinterUtility {

	
	 public static List<Word> sortWordsByRank(Map<String,Integer> wordsMap){
		 
		Set<String> keys = wordsMap.keySet();
		List<Word> words=new ArrayList<Word>();
		for(String wordString:keys){
			
		Word currentWord=	new Word (wordString,wordsMap.get(wordString));
		words.add(currentWord);
			
		}
		Collections.sort(words);

		 return words;
	 }
      public static void printWords(List<Word> sortedWWords,int limiter){
    	
    	 
    	  for(int i=0;i<limiter&&i<sortedWWords.size();++i){
    		 
    		 Word w= sortedWWords.get(i);
    	  System.out.println(w.value+" "+w.score);
    	 
    	  }
      }
}

class Word implements Comparable<Word>
{
	String value;
	int score;

	 @Override 
	 public String toString() {
		 //System.out.println("im here");
		return this.value+" "+this.score;
	}
	public Word(String value, int score)
	{
		this.value = value;
		this.score = score;
		
	}
	@Override
	public int compareTo(Word o)
	{
		if(this.score == o.score)
		{
			return (this.value.compareTo(o.value));
		}
		return o.score-this.score;
	}
}