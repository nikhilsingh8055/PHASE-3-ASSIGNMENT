package StandardJUnitTest.ConditionalJUnitTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@DisplayName("Conditionals Test")
@RunWith(JUnitPlatform.class)
public class ConditionalOSTest {
	//This case executed because we are running this program on Windows..We can check console
	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows()
	{
		System.out.println("This runs on Windows");
	}
	
	//This case doesn't executed because we are running this program on Windows..
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMac()
	{
		System.out.println("This runs on MAC");
	}
	//This case doesn't executed because we are running this program on Windows..
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux()
	{
		System.out.println("This runs on Linux");

}
}