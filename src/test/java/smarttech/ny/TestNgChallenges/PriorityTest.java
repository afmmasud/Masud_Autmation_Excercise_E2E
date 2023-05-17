package smarttech.ny.TestNgChallenges;

import org.testng.annotations.Test;

// WithOut Priority how test cases Will Executed?
//Ans:Alphababitic
 
//In your test cases how to set up priority?
//Ans:1,2,3,4,5 or (A,B,C,d.....)

public class PriorityTest {
 @Test(priority = 5)
	public void GetMethod1() {
		System.out.println("GetMethod1");
	}
@Test(priority = 4)
	public void GetMethod2() {
		System.out.println("GetMethod2");
	}
@Test(priority = 2)
	public void GetMethod3() {
		System.out.println("GetMethod3");
	}
	
@Test(priority = 3)
	public void GetMethod4() {
		System.out.println("GetMethod4");
	}

@Test(priority = 0)
	public void GetMethod0() {
		System.out.println("Getmethod5");
	}
	
	
}
