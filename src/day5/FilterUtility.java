package day5;





import java.util.*;
import java.lang.*;
import java.io.*;

public class FilterUtility
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("hello",12);
		hm.put("hellboy",13);
		hm.put("asdheat",15);
		hm.put("sadfedfoasdf",15);
		hm.put("asdf",10);
		
	 Map<String,Integer> retMap=	filterwordsWithRegex(hm,"*");
	 

//     
//     List<Word> words = PrinterUtility.sortWordsByRank(retMap);
//     PrinterUtility.printWords(words);

     
	}
	

public static Map<String,Integer> filterwordsWithRegex( HashMap<String,Integer> mapOfPossibleWordsWithScores, String regex){

     Map<String,Integer> filteredResultMap= new HashMap<String,Integer>();
     Set<String> wordsSet =mapOfPossibleWordsWithScores.keySet();
	 for(String word:wordsSet ){
	     if(matchRegex(regex,word)){
		 filteredResultMap.put(word,mapOfPossibleWordsWithScores.get(word));
		 }
	    
	 
	 }


return filteredResultMap;
}	




public static boolean matchRegex(String regx, String candidate) {
		if (regx.isEmpty()) {
			return false;
		} else {
			if (regx.charAt(0) == '*') {
				if (regx.length() == 1) {
					return true;
				} else {
					return matchStar(regx.substring(1), candidate);
				}
			}

			else if (candidate.isEmpty()) {
				return false;
			} else if (regx.charAt(0) == '.'
					|| regx.charAt(0) == candidate.charAt(0)) {

				if (regx.length() == 1 && candidate.length() == 1) {
					return true;
				}

				else {
					return matchRegex(regx.substring(1),
							candidate.substring(1));
				}
			} else {
				return false;
			}
		}
	}

	private static boolean matchStar(String regx, String candidate) {
		for (int i = 0; i < candidate.length(); i++) {
			if (matchRegex(regx, candidate.substring(i))) {
				return true;
			} else {
				continue;
			}
		}

		return false;
	}
	
	
	
	
	
	

}