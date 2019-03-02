package pl.edu.agh.mwo.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	// napisz test jednostkowy, który
	// sprawdza
	// kolejne
	// zaprezentowane warunki i
	// potem uzupełniaj implementację.

	@Test
	public void testMainFizzBuzz() {

		Assert.assertEquals("FizzBuzz", FizzBuzz.printForGivenNumber(15));
	}

	@Test
	public void testMainFizz() {

		Assert.assertEquals("Fizz", FizzBuzz.printForGivenNumber(3));
	}

	@Test
	public void testMainBuzz() {

		Assert.assertEquals("Buzz", FizzBuzz.printForGivenNumber(5));
	}

}
