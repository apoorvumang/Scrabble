package generateWord;

public class generateWord {
	static String inputString;
	static StringBuilder output ;

	public generateWord( String inputLetters) {
		inputString = inputLetters;
		output = new StringBuilder();
	}
	
	public static void generate(int startindex) {
		for ( int i = startindex ; i < inputString.length() ; ++i) {
			output.append(inputString.charAt(i));
			 //new isvalid(output);
			if(i < inputString.length()) {
				generate(startindex + 1) ;
				output.setLength(output.length() - 1);
			}
		}
	}

	public static void main(String[] args) { 
		
		generate(0);
	}

}