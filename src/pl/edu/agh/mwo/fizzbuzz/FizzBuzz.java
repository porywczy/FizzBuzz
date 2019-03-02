package pl.edu.agh.mwo.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {

		// Write a program that
		// prints the numbers
		// from 1 to 100.
		for (int i = 1; i <= 100; i++) {
			System.out.println(printForGivenNumber(i));
		}
	}

	public static String printForGivenNumber(int i) {
		// For numbers which are
		// multiples of both
		// three and five
		// print “FizzBuzz”.
		if ((i % 3) == 0 && (i % 5) == 0) {
			return "FizzBuzz";
		}
		// But
		// for
		// multiples of three
		// print “Fizz” instead of the number
		else if ((i % 3) == 0) {
			return "Fizz";
		}
		// and
		// for the
		// multiples of five print “Buzz”.
		else if ((i % 5) == 0) {
			return "Buzz";
		} else {
			return String.valueOf(i);
		}
	}
}
