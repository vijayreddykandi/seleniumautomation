package pom_pages;

import wrappers.GenericWrappers;

public class IRCTCLoungePage extends GenericWrappers {
	
	public void selectStationName(String station) {
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[1]/select", station);
		
	}
	
	public void selectLounges(String lounge) {
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[2]/select", lounge);
		
	}
	
	public void selectNumberOfPersons(String persons) {
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[3]/select", persons);
		
	}
	
	public void selectCheckInDate() {
		clickByName("acservicecheckindate");
		threadWait(2000);
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/tbody/tr[4]/td[6]/span");
		
	}
	
	public void selectCheckInTime(String time) {
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[5]/select", time);
		
	}
	
	public void selectDuration(String duration) {
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[6]/select", duration);
		threadWait(3000);
		
	}
	
	public void clickOnBook() {
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[11]/button[2]");
		threadWait(3000);
	}
	
	public void clickOnGuestUserLogin() {
		clickByXpath("/html/body/app-root/login/div/div/div/div/ul/li[2]/a");
		threadWait(3000);
	}
	
	public void enterGuestUserEmailId(String guestusername) {
		enterById("modalLRInput12", guestusername);
		
	}
	
	public void enterGuestMobileNumber(String guestmobilenumber) {
		enterByName("mobileNo", guestmobilenumber);
	}
	
	public void clickOnLogin() {
		clickByXpath("/html/body/app-root/login/div/div/div/div/div/div[2]/div/form/div[3]/button");
		threadWait(3000);
	}
	
	public void enterFirstPassengerName(String firstpassengername) {
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/input", firstpassengername);
		
	}
	
	public void enterFirstPassengerAge(String firstpassengerage) {
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/input", firstpassengerage);
		
	}
	
	public void selectFirstPassengerGender(String firstpersongender) {
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select", firstpersongender);
		
	}
	
	public void enterSecondPassengerName(String secondpassengername) {
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input", secondpassengername);
		
	}
	
	public void enterSecondPassengerAge(String secondpassengerage) {
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input", secondpassengerage);
		
	}
	
	public void selectSecondPassengerGender(String secondpassengergender) {
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select", secondpassengergender);
		
	}
	
	public void enterThirdPassengerName(String thirdpassengername) {
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[2]/input", thirdpassengername);
		
	}
	
	public void enterThirdPassengerAge(String thirdpassengerage) {
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[3]/input", thirdpassengerage);
		
	}
	
	public void selectThirdPassengerGender(String thirdpassengergender) {
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[4]/select", thirdpassengergender);
		
	}
	
	public void selectState(String state) {
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[3]/form/div[3]/select", state);
		
	}
	
	public void clickOnSubmit() {
		clickByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[4]/button[2]");
		
	}
	
	public void verifyEmailId(String email) {
		verifyTextByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[2]/div/div[1]/span", email);
		
	}
	
	public void verifyMobileNumber(String mobile) {
		verifyTextByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[2]/div/div[2]/span", mobile);
		
	}
	
	public void getTheAmountAndPrint() {
		getTextByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[1]/div[3]/span");
	}
	
	public void clickOnAgreeButton() {
		clickByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[1]/div[5]/div/label/span");
		
	}
	
	public void clickOnMakePayment() {
		clickByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[2]/button");
		
	}


}
