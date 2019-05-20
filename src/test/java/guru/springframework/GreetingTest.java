package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	private Greeting greeting;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before All -- this is only called once!");
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("In before each");
		 greeting = new Greeting();
		
	}

	@Test
	void testHelloWorld() {
		System.out.println(greeting.helloWorld());
	}

	@Test
	void testHelloWorldString() {
		System.out.println(greeting.helloWorld("Saahas"));
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After All -- this is only called class");
	}

}
