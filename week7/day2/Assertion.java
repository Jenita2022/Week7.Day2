package week7.day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	/*
	 * If,else condition is not required in TC validation, if we have assert stt.
	 * If,else will not show the failed TC status as else part takes care of it. 
	 * To see actual status of TC pass/fail, use assert.
	 */
	
	@Test
	public void hard_assert() throws InterruptedException {
		String s1="TestLeaf"; 
		String s2="TestLeaf";
		Assert.assertEquals(s1, s2);//assertEquals(boolean actual,boolean expected)
		System.out.println(" This line will execute based on assertion status ");

		String N1="TestLeaf";
		String N2="TestLeaf";
		Assert.assertEquals(N1, N2); //assertEquals(boolean actual,boolean expected)
		System.out.println("Assertion stt is passed so printing next line");

		char val = 'B';
		Assert.assertEquals(val,'C'); //assertEquals(char actual,char expected)
		System.out.println("Assertion fails so not printing next line");

	}

	@Test
	public void softAssert() {
		SoftAssert SA = new SoftAssert();
		String s1="TestLeaf"; 
		String s2="TestLeaf123";
		SA.assertEquals(s1, s2);//assertEquals(boolean actual,boolean expected)
		System.out.println(" This line will execute whether assert pass or fail ");
		SA.assertAll();


	}

}
