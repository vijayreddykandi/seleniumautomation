package pom_pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import wrappers.GenericWrappers;

public class IRCTCRegistrationPage extends GenericWrappers {
	
	
	public IRCTCRegistrationPage(RemoteWebDriver driver1) {
		this.driver = driver1;
		
	}
	
	public void enterUsername(String username) {
		enterById("userName", username,"The username entered successfully");
		threadWait(3000);
	}
	
	public void enterPassword(String password) {
		enterById("usrPwd", password,"The password entered successfully");
	}
	
	public void confirmPassword(String confpassword) {
		enterById("cnfUsrPwd", confpassword,"The confirm password entered successfully");
	}
	
	public void selectPreferredLanguage() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[2]/span");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span");
		
	}
	public void selectSecurityQuestion() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[3]/span");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
		
	}
	
	public void enterSecurityAnswer(String securityAnswer) {
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[7]/input", securityAnswer);
		
	}
	
	public void clickOnContinue() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		
	}
	
	public void enterFirstName(String fname) {
		enterById("firstName", fname,"The firstname entered successfully");
	}
	
	public void enterLastName(String lname) {
		enterById("lastname", lname,"The last name entered successfully");
	}
	
	public void selectOccupation() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[3]/span");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span");
		
	}
	
	public void enterDateOfBirth(String dob) {
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/input", dob);
		threadWait(1000);
	}
	
	public void selectMaritalStatus() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[7]/span[2]/p-radiobutton/div/div[2]/span");
		threadWait(1000);
	}
	
	public void selectGender() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[9]/p-selectbutton/div/div[1]/span");
		
	}
	
	public void enterEmailId(String email) {
		enterById("email", email,"The email entered successfully");
	}
	
	public void enterMobileNumber(String mobilenumber) {
		enterById("mobile", mobilenumber,"The mobile number entered successfully");
		
	}
	
	public void selectNationality(String nationality) {
		selectVisibileTextByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select",nationality);
		
	}
	
	public void clickContinue() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		
	}
	
	public void enterFlatNumber(String housenumber) {
		enterById("resAddress1", housenumber,"The flat number entered successfully");
		
	}
	
	public void enterArea(String location) {
		enterById("resAddress3", location,"The area entered successfully");
	}
	
	public void enterPincode (String pinnumber) {
		enterByName("resPinCode", pinnumber);
	}
	
	public void selectCity(String city) {
	selectVisibileTextByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select", city);
	threadWait(1000);
	}
	
	public void selectPostOffice(String postoffice) {
	selectVisibileTextByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select", postoffice);
	}
	
	public void enterMobile(String mobile) {
	enterById("resPhone", mobile,"The residential mobile entered successfully");
	}
	
	public void selectOfficeAddress() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[9]/span[1]/p-radiobutton/div/div[2]/span");
	}
	
	public void selectTermsAndConditions() {
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[12]/span[1]/input");
	}


}
