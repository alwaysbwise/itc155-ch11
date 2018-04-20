import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// intro
		System.out.println("this program will tell al lthe prime numbers up to a given max");

		Scanner console = new Scanner(System.in);

		System.out.println("Whatcha want to be da max? ");

		int max = console.nextInt();

		LinkedList<Integer> primes = sieve(max);
		System.out.println("Prime numbers up to " + max + ":");
		System.out.println(primes);

		console.close();
	}

	// returns list of primes up to user entered cap
	public static LinkedList<Integer> sieve(int max) {

		// add all numbers from 2 to the given cap
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		LinkedList<Integer> primes = new LinkedList<Integer>();

		for (int i = 2; i < max; i++) {
			numbers.add(i);
		}

		while (!numbers.isEmpty()) {
			// remove a prime number from the front of the list
			int front = numbers.remove(0);
			primes.add(front);

			// remove all multiples of this prime number
			Iterator<Integer> itr = numbers.iterator();

			while (itr.hasNext()) {
				int current = itr.next();
				if (current % front == 0) {
					itr.remove();
				}
			}
		}

		return primes;

	}// end sieve()

}
