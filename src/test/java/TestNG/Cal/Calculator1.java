package TestNG.Cal;

import java.util.Scanner;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Calculator1 {
	double a, b;
	NewTest method = new NewTest();
	Scanner sc = new Scanner(System.in);
	double c;
	double arr[] = { 2, 3 };
	SoftAssert softAssert = new SoftAssert();

	@BeforeTest
	void display() {
		System.out.println("BeforeTest Menu");
	}

	@Test(groups = "ajith", priority = 1)
	void Menu() {
		c = method.add(arr);
		AssertJUnit.assertEquals(c, 5.0);
		System.out.println("ajith1");
		softAssert.assertEquals(c, 5.0);
	}

	@Test(groups = "moorthy", priority = -2)
	void Menu1() {
		NewTest b = new NewTest();
		b.sub(arr);
		c = method.sub(arr);
		AssertJUnit.assertEquals(c, -1.0);
		System.out.println("moorthy1");
		softAssert.assertEquals(c, -2);
	}

	@AfterTest
	void display1() {
		System.out.println("AfterTest Menu ");
	}

	@Test(groups = "ajith", priority = 1)
	void Menu2() {
		c = method.div(arr);
		AssertJUnit.assertEquals(c, 0.66666666666666666666666666);
		System.out.println("ajith2");
		softAssert.assertEquals(c, 0.7);
	}

	@Test(groups = "moorthy", priority = 0)
	void Menu3() {
		c = method.mul(arr);
		AssertJUnit.assertEquals(c, 6.0);
		System.out.println("moorthy2");
		softAssert.assertAll();
	}

}
