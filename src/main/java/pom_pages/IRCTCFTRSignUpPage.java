package pom_pages;

import wrappers.GenericWrappers;

public class IRCTCFTRSignUpPage extends GenericWrappers  {
	
	public void clickOnNewUserSignUp() {
		clickByXpath("/html/body/form/div/div/table/tbody/tr[4]/td[2]/div/a[2]");
		threadWait(5000);
	}
	
	public void enterUserId(String id) {
		enterById("userId", id);
	}
	
	public void enterPassword (String password) {
		enterById("password", password);
	}
	
	public void enterConfirmPassword(String confirmpassword) {
		enterById("cnfPassword", confirmpassword);
	}
	
	public void selectSecurityQuestion() {
		selectVisibileTextById("secQstn", "What is your pet name?");
	}
	
	public void enterSecurityAnswer(String answer) {
		enterById("secAnswer", answer);
	}
	
	public void enterDateOfBirth(String dob) {
		enterById("dateOfBirth", dob);
	}
	
	public void selectGender() {
	clickById("gender0");
	}
	
	public void selectMaritalStatus() {
	clickById("maritalStatus1");
	}
	
	public void enterEmailId(String email) {
	enterById("email", email);
	}
	
	public void selectOccupation() {
	selectVisibileTextById("occupation", "Others");
	}
	
	public void enterFirstName(String firstname) {
	enterById("fname", firstname);
	}
	
	public void enterLastName(String lastname) {
	enterById("lname", lastname);
	}
	
	public void selectNationality() {
	selectVisibileTextById("natinality", "Indian");
	}
	
	public void enterFlatNumber(String flatnumber) {
	enterById("flatNo", flatnumber);
	}
	
	public void enterAreaName(String areaname) {
	enterById("area", areaname);
	}
	
	public void selectCountry() {
	selectVisibileTextById("country", "India");
	}
	
	public void enterMobileNumber(String mobilenumber) {
	enterById("mobile", mobilenumber);
	}
	
	public void enterPincode(String pincode) {
	enterById("pincode", pincode);
	}
	
	public void selectPostOffice() {
	selectVisibileTextById("postOffice", "Karimnagar H.O");
	}
	
	public void selectOfficeAddress() {
	clickById("sameAddresses1");
	}
	
	public void enterOfficeFlatNumber(String officeflatnumber) {
	enterById("flatNoOffice", officeflatnumber);
	}
	
	public void enterOfficeAreaName(String officeareaname) {
	enterById("areaOffice", officeareaname);
	}
	
	public void selectOfficeCountry() {
	selectVisibileTextById("countryOffice", "India");
	}
	
	public void enterOfficeMobileNumber(String officemobilenumber) {
	enterById("mobileOffice", officemobilenumber);
	}
	
	public void enterOfficePincode (String officepincode) {
	enterById("pincodeOffice", officepincode);
	
	}
	
	public void selectOfficePostOffice() {
	selectVisibileTextById("postOfficeOffice", "Karimnagar H.O");
	}
	
	

}
