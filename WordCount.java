import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;


public class WordCount {

	//minimum number of occurrences to be printed
	public static final int OCCURRENCES = 2000;
	
	public static void main(String[] args) throws FileNotFoundException {
	
		//Greeting 
		System.out.println("This program displays the most ");
		System.out.println("frequently occurring words from  ");
		System.out.println("the book Moby Dick");
		
		//read the book into a map (tree)
		Scanner in = new Scanner(new File("mobydick.txt"));
		Map<String, Integer> wordCountMap = getCountMap(in);
		
		for (String word : wordCountMap.keySet()){
			//get the word count and check against our constant
			int count = wordCountMap.get(word);
			if(count > OCCURRENCES){
				System.out.println(word + " occurs " + count + " times.");
			}
		}
		
	}

	//read the text and return a map from words to counts
	private static Map<String, Integer> getCountMap(Scanner in) {
		Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();
		
		while(in.hasNext()){
			String word = in.next().toLowerCase();
			if(!wordCountMap.containsKey(word)){
				wordCountMap.put(word, 1);
			} else {
				//get the count (value) for the word (key) 
				int count = wordCountMap.get(word);
				wordCountMap.put(word, count++);
			}
		}
		return wordCountMap;
	}

}
