package spaceEnrtHandler;

import java.util.*;
import java.util.Arrays;

public class Combinations {
    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    public Map<String,Integer> combinations;
    Map <String, AnagramListStructure> anagramMap;
    public Combinations( final String str ){
        inputstring = str;
        combinations = new HashMap<String,Integer> ();
        this.combine();
    }
    public int findScore(String s){
    	int score = 0;
    	char[] scoreArray = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
    	char[] charArray = s.toCharArray();
    	for(int i = 0; i < s.length(); i++){
    		score += scoreArray[charArray[i]-'a'];
    		  		
    	}
    	return score;
    }
    public boolean isValidWord(String s){
    	char[] arr = s.toCharArray();
    	Arrays.sort(arr);
    	boolean bln = anagramMap.conatinsKey(arr);
    	return bln;
    }
    	
    }
    public void combine() { combine( 0 ); }
    private void combine(int start ){
        for ( int i = start; i < inputstring.length(); ++i ){
        	if(inputstring.charAt(i) == '*') {
        		for(int j = 'a'; j <= 'z'; ++j) {	
        			output.append( (char)(j - 'a' + 'A'));
        			String word = output.toString();
        			if(isValidWord(word)){
                    combinations.put(word,findScore(word));
                    if ( i < inputstring.length() )
                    combine( i + 1);
                    output.setLength( output.length() - 1 );
        		}
        	}
        	}
        	else {
	            output.append( inputstring.charAt(i) );
	            String word = output.toString();
	            if(isValidWord(word)){
	            combinations.put(word,findScore(word));
	            if ( i < inputstring.length() )
	            combine( i + 1);
	            output.setLength( output.length() - 1 );
        	}
        	}
        }
    }
 

public static void main(String [] args){
	
	String tiles; 
	Scanner rack = new Scanner(System.in);
	tiles = rack.nextLine();
	Combinations obj = new Combinations(tiles);
	
	
}
}
