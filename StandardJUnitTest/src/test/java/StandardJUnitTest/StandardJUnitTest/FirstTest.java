package StandardJUnitTest.StandardJUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("First Testdemo")
@RunWith(JUnitPlatform.class)
public class FirstTest {
	
	Calculator cal=null;
	//Here I have used @BeforeAll Annotation to check the Test
	@BeforeAll
	static void setUpforAll()
	{
		System.out.println("Call before All Tests");
	}
	////Here I have used @AfterAll Annotation to check the Test
	@AfterAll
	static void tearDownForAll()
	{
		System.out.println("Call After All tests");
	}
	
	//Here I have used @BeforeEach Annotation to check the Test
	@BeforeEach
	void setUp()
	{
		cal= new Calculator();
		System.out.println("Object created");
	}
	//Here I have used @AfterEach Annotation to check the Test
	@AfterEach
	void tearDown()
	{
		cal=null;
		System.out.println("object Destroyed");
	}
	
	//Here i have used Disabled to disable the test case
    @Disabled
	@Test
	void addMethod1()
	{
		System.out.println("Add test executed");
		assertEquals(10, cal.add(5, 5));
	}
	@Disabled
	@Test
	void addMethod2()
	{
		System.out.println("Add test Executed");
		Calculator cal= new Calculator();
		assertNotEquals(7, cal.add(5, 4));

}
}
