import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		//create the set
		Set<String> stooges = new HashSet<String>();
		
		stooges.add("Larry");
		stooges.add("Moe");
		stooges.add("Curly");
		stooges.add("Larry");
		stooges.add("Shemp");
		stooges.add("Moe");
		
		System.out.println(stooges.toString());
		
		//find unique words in a book
		Set<String> words = new HashSet<String>();
		Scanner in = new Scanner(new File("mobydick.txt"));
		while(in.hasNext()){
			String word = in.next();
			word = word.toLowerCase();
			words.add(word);
		}
		System.out.println("number of unique words: " + words.size());
		
		List<Integer> list = new LinkedList<Integer>();
		/*
		for(int i = 0; i <10; i++){		
		list.add(i);
		}
		*/
		list.add(10);
		list.add(10);
		
		boolean listDuplicates = hasDuplicates(list); 
		
		System.out.println(listDuplicates);
		
		for(String name : stooges){
			System.out.println("Another way to interate through a set " + name);
		}
		
		
	}

	//use a set to check if a list of integers contains duplicates
	public static boolean hasDuplicates(LinkedList<Integer> list){
		
		Iterator<Integer> itr = new list.iterator(); 
		
		Set<Integer> set = new HashSet<Integer>();
		while(itr.hasNext()){
			int i = (int) itr.next();
			set.add(i);
		}
		return set.size() < list.size();
		
		
	}
	
	
}
