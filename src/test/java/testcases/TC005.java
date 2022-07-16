package testcases;



import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC005 extends GenericWrappers {
	@Test
	public void GSTValidation() {
		invokeApp("chrome", "https://www.irctc.co.in/nget/");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i");
		threadWait(4000);
		clickById("messageDialogClose");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[3]/p-sidebar/div/nav/ul/li[7]/label");
		threadWait(3000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[3]/p-sidebar/div/nav/ul/li[7]/ul/li[3]/label");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[3]/p-sidebar/div/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
		switchToLastWindow();
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[1]/select", "AHMEDABAD");
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[2]/select", "IIRCTC EXECUTIVE LOUNGE");
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[3]/select", "3");
		clickByName("acservicecheckindate");
		threadWait(2000);
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/tbody/tr[5]/td[5]/span");
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[5]/select", "11:00");
		selectVisibileTextByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[6]/select", "05:00");
		threadWait(3000);
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[11]/button[2]");
		clickByXpath("/html/body/app-root/login/div/div/div/div/ul/li[2]/a");
		enterById("modalLRInput12", "vijayreddy.kandi@gmail.com");
		enterByName("mobileNo", "6281525521");
		clickByXpath("/html/body/app-root/login/div/div/div/div/div/div[2]/div/form/div[3]/button");
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[2]/form/div/select", "Yes");
		enterByName("gstNo", "123456789");
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/input", "vijay");
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/input", "27");
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select", "Male");
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input", "jessi");
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input", "25");
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select", "Male");
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[2]/input", "sri");
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[3]/input", "30");
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[4]/select", "Male");
		selectVisibileTextByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[3]/form/div[3]/select", "TELANGANA");
		clickByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[4]/button[2]");
		
	}

}
