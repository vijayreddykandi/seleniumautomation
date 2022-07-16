package pom_pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import wrappers.GenericWrappers;

public class IRCTCHomePage extends GenericWrappers {
	
	public IRCTCHomePage(RemoteWebDriver driver1) {
		
		this.driver = driver1;
		System.out.println("Constructor called");
	}
	
	public void clickOkOnTheAlert() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		threadWait(4000);
	}
	
	public void clickOnRegister() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
		threadWait(3000);
		
	}
	
	public void clickOnHolidays() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]");
		
	}
	
	public void clickOnStays() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
	}
	
	public void clickOnLounge() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
		switchToLastWindow();
	}
	
	public void clickOnTrains() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/a");
	}
	
	public void clickOnFTRTrainBooking() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[9]/a/span");
		threadWait(4000);
		switchToLastWindow();
	}
	
	
}
