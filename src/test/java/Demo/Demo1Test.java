package Demo;
import org.testng.annotations.Test;


public class Demo1Test {
	
	@Test (groups = "smoke")
	public void AppleTest() {
		System.out.println("apple");
	}

}
