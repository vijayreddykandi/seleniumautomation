package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers {
	
	public String testcasename,testcasedescription,author,category;
	@BeforeSuite
	public void intiateReport() {
		startReport();
	}
	
	@BeforeTest
	public void getProps() {
		loadProperties();
	}
	
	
	@BeforeMethod
	public void openBrowser() {
		startTest(testcasename,testcasedescription,author,category);
		invokeApp("chrome", prop.getProperty("URL"),true);
		//clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		
	}
	
	@AfterMethod
	public void closeApplication() {
//		closeAllBrowsers();
	}
	
	@AfterClass
	public void stopTest() {
		endTest();
	}
	
	@AfterSuite
	public void stopReport() {
		endReport();
	}
}
