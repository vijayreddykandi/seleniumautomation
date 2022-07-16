package testcases;



import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC004 extends GenericWrappers {
	@Test
	public void SaloonCheck() {
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
		clickByXpath("/html/body/app-root/homeheader/header/nav/div/div[2]/div[2]/ul/li[3]/a/i");
		clickByXpath("/html/body/app-root/homeheader/nav/ul/li[13]/a");
		clickByXpath("/html/body/app-root/homeheader/nav/div/i");
		clickByXpath("/html/body/app-root/ng-component/div[2]/div/div/ul/li[2]/a");
		enterByXpath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[1]/input", "vijay");
		enterByName("organization", "abcorganization");
		enterByName("address", "10-2-879, vidyanagar, karimnagar");
		enterByName("mobile", "6281525521");
		enterByName("email", "vijayreddy.kandi@mail.com");
		selectVisibileTextByXPath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[6]/select", "Saloon Charter");
		enterByName("originStation", "Hyderabad");
		enterByName("destnStation", "New Delhi");
		clickByName("checkInDate");
		clickByXpath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[9]/div/div/table/tbody/tr[4]/td[5]/span");
		clickByName("checkOutDate");
		clickByXpath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[10]/div/div/table/tbody/tr[5]/td[5]/span");
		enterByName("durationPeriod", "10");
		enterByName("coachDetails", "asdfgh");
		enterByName("numPassenger", "3");
		enterByName("charterPurpose", "abcdef");
		enterByName("services", "qwerty");
		clickByXpath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[17]/button");
		
		
		
		
		
	}

}
