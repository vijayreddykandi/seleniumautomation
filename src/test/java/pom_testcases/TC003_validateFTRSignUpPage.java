package pom_testcases;

import pom_pages.IRCTCFTRSignUpPage;
import pom_pages.IRCTCHomePage;
import wrappers.ProjectWrappers;


public class TC003_validateFTRSignUpPage extends ProjectWrappers{
	
	public void irctcFTRSignUp() {
		IRCTCHomePage obj = new IRCTCHomePage(driver);
		IRCTCFTRSignUpPage sp = new IRCTCFTRSignUpPage();
		obj.clickOkOnTheAlert();
		obj.clickOnTrains();
		obj.clickOnFTRTrainBooking();
		sp.clickOnNewUserSignUp();
		sp.enterUserId("vijaykandi451");
		sp.enterPassword("Prolific@123");
		sp.enterConfirmPassword("Prolific@123");
		sp.selectSecurityQuestion();
		sp.enterSecurityAnswer("maya");
		sp.enterDateOfBirth("01/08/1994");
		sp.selectGender();
		sp.selectMaritalStatus();
		sp.enterEmailId("vijayreddy.kandi@gmail.com");
		sp.selectOccupation();
		sp.enterFirstName("vijay");
		sp.enterLastName("kandi");
		sp.selectNationality();
		sp.enterFlatNumber("10-2-880/A/1");
		sp.enterAreaName("vidyanagar");
		sp.selectCountry();
		sp.enterMobileNumber("6281525521");
		sp.enterPincode("505001");
		sp.selectPostOffice();
		sp.selectOfficeAddress();
		sp.enterOfficeFlatNumber("10-2-879");
		sp.enterOfficeAreaName("vidyanagar");
		sp.selectOfficeCountry();
		sp.enterOfficeMobileNumber("6281525521");
		sp.enterOfficePincode("505001");
		sp.selectOfficePostOffice();
		
	}

}
