package testcases;



import org.testng.annotations.Test;

import utils.ReadDataFromExcel;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
@Test(dataProvider = "IRCTCTC001", dataProviderClass = ReadDataFromExcel.class)
	public void IRCTCRegistration (String username,String password,String confpassword,String securityAnswer,String firstname,String lastname,String mobile) {
		threadWait(4000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
		threadWait(3000);
		enterById("userName", username);
		enterById("usrPwd", password);
		enterById("cnfUsrPwd", confpassword);
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[2]/span");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[3]/span");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[7]/input", securityAnswer);
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		enterById("firstName", firstname);
		enterById("lastname", lastname);
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[3]/span");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span");
		enterByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/input", "01-08-1994");
		threadWait(1000);
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[7]/span[2]/p-radiobutton/div/div[2]/span");
		threadWait(1000);
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[9]/p-selectbutton/div/div[1]/span");
		enterById("email", "vijayreddy.kandi@gmail.com");
		enterById("mobile", "6281525521");
		selectVisibileTextByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select", "India");
		clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		enterById("resAddress1", "10-2-880/A/1");
		enterById("resAddress3", "vidyanagar");
		enterByName("resPinCode", "505001");
		//enterById("resState", "TELANGANA");
		threadWait(1000);
		selectVisibileTextByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select", "KARIMNAGAR");
		threadWait(1000);
		selectVisibileTextByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select", "Karimnagar H.O");
		enterById("resPhone", "6281525521");
		
		
		
	}
	
}
