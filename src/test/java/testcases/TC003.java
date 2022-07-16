package testcases;



import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers {
	@Test
	public void FTRSignUp() {
		invokeApp("chrome", "https://www.irctc.co.in/nget/");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i");
		threadWait(4000);
		clickById("messageDialogClose");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[3]/p-sidebar/div/nav/ul/li[3]/label/span[1]/strong");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[3]/p-sidebar/div/nav/ul/li[3]/ul/li[9]/a/span");
		threadWait(5000);
		switchToLastWindow();
		clickByXpath("/html/body/form/div/div/table/tbody/tr[4]/td[2]/div/a[2]");
		threadWait(5000);
		enterById("userId", "vijaykandi451");
		enterById("password", "Prolific@123");
		enterById("cnfPassword", "Prolific@123");
		selectVisibileTextById("secQstn", "What is your pet name?");
		enterById("secAnswer", "maya");
		enterById("dateOfBirth", "01/08/1994");
		clickById("gender0");
		clickById("maritalStatus1");
		enterById("email", "vijayreddy.kandi@gmail.com");
		selectVisibileTextById("occupation", "Others");
		enterById("fname", "vijay");
		enterById("lname", "kandi");
		selectVisibileTextById("natinality", "Indian");
		enterById("flatNo", "10-2-880/A/1");
		enterById("area", "vidyanagar");
		selectVisibileTextById("country", "India");
		enterById("mobile", "6281525521");
		enterById("pincode", "505001");
		selectVisibileTextById("postOffice", "Karimnagar H.O");
		clickById("sameAddresses1");
		enterById("flatNoOffice", "10-2-879");
		enterById("areaOffice", "vidyanagar");
		selectVisibileTextById("countryOffice", "India");
		enterById("mobileOffice", "6281525521");
		enterById("pincodeOffice", "505001");
		selectVisibileTextById("postOfficeOffice", "Karimnagar H.O");
		
		
		
	}

}
