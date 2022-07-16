package pom_testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom_pages.IRCTCHomePage;
import pom_pages.IRCTCRegistrationPage;
import wrappers.ProjectWrappers;

public class TC001_validateRegistrationPage extends ProjectWrappers{
	
	@BeforeClass
	public void passInputs() {
		testcasename = "TC001_validateRegistrationPage" ;
		testcasedescription = "This is to validate the IRCTC Registration";
		author = "Vijay";
		category = "Regression";
	}
	
	
	@Test
	public void irctcRegistartion() {
		IRCTCHomePage obj = new IRCTCHomePage(driver);
		IRCTCRegistrationPage rp = new IRCTCRegistrationPage(driver);
		obj.clickOkOnTheAlert();
		obj.clickOnRegister();
		rp.enterUsername("vijay");
		rp.enterPassword("Prolific@123");
		rp.confirmPassword("Prolific@123");
		rp.selectPreferredLanguage();
		rp.selectSecurityQuestion();
		rp.enterSecurityAnswer("maya");
		rp.clickOnContinue();
		rp.enterFirstName("vijay");
		rp.enterLastName("kandi");
		rp.selectOccupation();
		rp.enterDateOfBirth("01-08-1994");
		rp.selectMaritalStatus();
		rp.selectGender();
		rp.enterEmailId("vijayreddy.kandi@gmail.com");
		rp.enterMobileNumber("6281525521");
		rp.selectNationality("India");
		rp.clickContinue();
		rp.enterFlatNumber("10-2-880/A/1");
		rp.enterArea("vidyanagar");
		rp.enterPincode("505001");
		rp.selectCity("karimnagar");
		rp.selectPostOffice("Karimnagar H.O");
		rp.enterMobile("6281525521");
		rp.selectOfficeAddress();
		rp.selectTermsAndConditions();
		
	}

}
