import java.io.*;
import java.util.*;

public class ClassProject {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("This program compares the vocabulary of two ");
		System.out.println("text files, reporting the number of words ");
		System.out.println("in common and the percent of overlap ");
		System.out.println();
		System.out.println("file 1 name: mobydick.txt");
		System.out.println("file 2 name: hamlet.txt");
		System.out.println();
		
		
		
		// find unique words in a book
		Set<String> words = new HashSet<String>();
		Scanner in = new Scanner(new File("mobydick.txt"));
		while (in.hasNext()) {
			String word = in.next();
			word = word.toLowerCase();
			words.add(word);
		}
		System.out.println("Moby Dick unique words: " + words.size());

		// find unique words in a book
		Set<String> words2 = new HashSet<String>();
		Scanner in2 = new Scanner(new File("hamlet.txt"));
		while (in2.hasNext()) {
			String word2 = in2.next();
			word2 = word2.toLowerCase();
			words2.add(word2);
		}
		System.out.println("Hamlet unique words: " + words2.size());

		// create a new set to hold the common words
		Set<String> common = new HashSet<String>();
		common.addAll(words);
		common.retainAll(words2);

		System.out.println("Common words: " + common.size());

		// calculate the percent of overlap relative to each file used
		double percentOverlap = (common.size() / (double) words.size() * 100);
		System.out.println("% of Moby Dick in overlap: " + percentOverlap);

		double percentOverlap2 = (common.size() / (double) words2.size() * 100);
		System.out.println("% of Hamlet in overlap: " + percentOverlap2);

	}

}
