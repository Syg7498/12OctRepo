package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	void m1() {
		System.out.println();
		System.out.println("Test2 m1");
		// updated by another user
		System.out.println("Test2");
	}

	@Test
	void m2() {
		System.out.println();
		System.out.println("Test2 m2");
		// updated by another user
		System.out.println("Test2");
		Assert.fail();
	}

	@Test
	void m3() {
		System.out.println();
		System.out.println("Test2 m3");
		// updated by another user
		System.out.println("Test2");
		System.out.println("Test2");
		System.out.println("Test2");
		System.out.println("Test2");
	}
	
	@Test(dependsOnMethods = "m2")
	void m4() {
		System.out.println();
		System.out.println("Test2 m3");
		// updated by another user
		System.out.println("Test2");
		System.out.println("Test2");
		System.out.println("Test2");
		System.out.println("Test2");
	}
}
