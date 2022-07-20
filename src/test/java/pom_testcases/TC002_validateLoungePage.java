package pom_testcases;

import pom_pages.IRCTCHomePage;
import pom_pages.IRCTCLoungePage;
import wrappers.ProjectWrappers;


public class TC002_validateLoungePage extends ProjectWrappers{
	
	public void irctcLounge() {
		IRCTCHomePage obj = new IRCTCHomePage(driver);
		IRCTCLoungePage lp = new IRCTCLoungePage();
		obj.clickOkOnTheAlert();
		obj.clickOnHolidays();
		obj.clickOnStays();
		obj.clickOnLounge();
		lp.selectStationName("AHMEDABAD");
		lp.selectLounges("IIRCTC EXECUTIVE LOUNGE");
		lp.selectNumberOfPersons("3");
		lp.selectCheckInDate();
		lp.selectCheckInTime("11:00");
		lp.selectDuration("05:00");
		lp.clickOnBook();
		lp.clickOnGuestUserLogin();
		lp.enterGuestUserEmailId("vijayreddy.kandi@gmail.com");
		lp.enterGuestMobileNumber("6281525521");
		lp.clickOnLogin();
		lp.enterFirstPassengerName("vijay");
		lp.enterFirstPassengerAge("27");
		lp.selectFirstPassengerGender("Male");
		lp.enterSecondPassengerName("jessi");
		lp.enterSecondPassengerAge("25");
		lp.selectSecondPassengerGender("Male");
		lp.enterThirdPassengerName("sri");
		lp.enterThirdPassengerAge("30");
		lp.selectThirdPassengerGender("Male");
		lp.selectState("TELANGANA");
		lp.clickOnSubmit();
		lp.verifyEmailId("vijayreddy.kandi@gmail.com");
		lp.verifyMobileNumber("6281525521");
		lp.getTheAmountAndPrint();
		lp.clickOnAgreeButton();
		lp.clickOnMakePayment();
		
	}

}
