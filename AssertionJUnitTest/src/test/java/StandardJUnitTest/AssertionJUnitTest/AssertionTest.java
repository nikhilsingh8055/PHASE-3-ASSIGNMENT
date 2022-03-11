package StandardJUnitTest.AssertionJUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;



@DisplayName("Assertions Demo") 
@RunWith(JUnitPlatform.class)
public class AssertionTest {
	
	@Test
	void test()
	{
		int a=67;
		int b=89;
		
		//I have used assertFalse annotation here
		assertFalse(5>8);
		
		//I have used assertTrue annotation here
		assertTrue(b>a);
		assertTrue(checkAge(78));
		
		String str=null;
		
		//I have used assertNull annotation here
		assertNull(str);
		assertNotNull("hello");
		
		//I have used assertEquall annotation here and if expected result is not equall to actual then test case fails..
		assertEquals(8, 2+6);
		
		//pass function as a parameter //lambda expression (>=1.8) This annotation is valid in jdk above 1.8
		assertThrows(RuntimeException.class, ()->{throw new RuntimeException();});
	}
	
	boolean checkAge(int age)
	{
		return age>=18;

}
}