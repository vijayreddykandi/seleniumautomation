package testNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeSuite(groups = {"Regression","Functional","Smoke"})
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest(groups = {"Regression","Functional","Smoke"})
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass(groups = {"Regression","Functional","Smoke"})
	public void beforeClass() {
		System.out.println("Before CLass");
	}
	
	
	@AfterMethod(groups = {"Regression","Functional","Smoke"})
	public void afterMethod() {
		System.out.println("after Method");
	}
	
	@AfterSuite(groups = {"Regression","Functional","Smoke"})
	public void afterSuite() {
		System.out.println("after Suite");
	}
	
	@AfterTest(groups = {"Regression","Functional","Smoke"})
	public void afterTest() {
		System.out.println("after Test");
	}
	
	@AfterClass(groups = {"Regression","Functional","Smoke"})
	public void afterClass() {
		System.out.println("after CLass");
	}
	
	
	@BeforeMethod(groups = {"Regression","Functional","Smoke"})
	public void beforeMethod() {
		System.out.println("before Method");
	}
	
	
	@Test(priority = 1,groups = {"Regression","Functional","Smoke"})
	public void method1() {
	System.out.println("Testcase 1");	
	}
	@Test(priority = 2,groups = {"Smoke"})
	public void method6() {
	System.out.println("Testcase 6");	
	}
	@Test(priority = -9,enabled = true,groups = {"Regression"})
	public void method2() {
	System.out.println("Testcase 2");	
	}
	@Test(priority = 2,groups = {"Functional"})
	public void method3() {
	System.out.println("Testcase 3");	
	}
	@Test(priority = 676,groups = {"Smoke"})
	public void method4() {
	System.out.println("Testcase 4");	
	}
	@Test(priority = 0,groups = "Regression")
	public void method5() {
	System.out.println("Testcase 5");	
	}

}
