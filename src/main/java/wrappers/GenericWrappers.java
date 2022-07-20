package wrappers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ProjectReport;

public class GenericWrappers extends ProjectReport implements Wrappers {
	public RemoteWebDriver driver;
	Properties prop;
	WebDriverWait wait;

	public void loadProperties() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream("./ProjectProperties/env.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void invokeApp(String browser, String url,boolean flag) {

		if(flag) {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName(browser);
			dc.setPlatform(Platform.WINDOWS);
						
			try {
				driver = new RemoteWebDriver(new URL("http://192.168.1.86:4444/wd/hub"),dc);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
		
		
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("FireFox")) {
				System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("InternetExplorer")) {
				System.setProperty("webdriver.internetexplorer.driver", "./drivers/iedriver.exe");
				driver = new InternetExplorerDriver();
			}
			
		}
		try {
			wait = new WebDriverWait(driver, 30);
			driver.manage().window().maximize();
			driver.get(url);

			//threadWait(5000);
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 3; i++) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}
			
			logStatus("Pass", "The browser launched successfully");
		} catch (WebDriverException e) {
			logStatus("Fail","The browser is not lauched due to webdriver exception");
		}

	}

	@Override
	public void enterById(String idValue, String data, String logmessage) {
		// TODO Auto-generated method stub
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElementById(idValue))).sendKeys(data);
			
			//driver.findElementById(idValue).sendKeys(data);
			logStatus("Pass", logmessage);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElementById(idValue))).sendKeys(data);
			
			//driver.findElementById(idValue).sendKeys(data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		driver.findElementByName(nameValue).sendKeys(data, Keys.TAB);

	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		driver.findElementByXPath(xpathValue).sendKeys(data);
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		String text = driver.getTitle();
		if (text.equals(title)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched");
		}
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		String title = driver.findElementById(id).getText();
		if (title.equals(text)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched");
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		String title = driver.findElementByXPath(xpath).getText();
		if (title.equals(text)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched");
		}
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		driver.findElementById(id).click();
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		driver.findElementByClassName(classVal).click();
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		driver.findElementByName(name).click();
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		driver.findElementByLinkText(name).click();
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		driver.findElementByXPath(xpathVal).click();
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text = driver.findElementById(idVal).getText();
		return text;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text = driver.findElementByXPath(xpathVal).getText();
		System.out.println(text);
		return text;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		WebElement text = driver.findElementById(id);
		Select sel = new Select(text);
		sel.selectByVisibleText(value);
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		WebElement text = driver.findElementById(id);
		Select sel = new Select(text);
		sel.selectByIndex(value);
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		for (String singlewindow : allwindows) {
			driver.switchTo().window(singlewindow);
			break;
		}
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		for (String singlewindow : allwindows) {
			driver.switchTo().window(singlewindow);
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		return text;
	}

	public long takeSnap() {
		long name = 0;
		try {

			// long name = System.currentTimeMillis();

			 name = Math.round(Math.random() * 10000000l);
			System.out.println(name);

			// 0.6477 * 10000000l = 6477.000
			File screenshot = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/" + name + ".jpeg");
			FileUtils.copyFile(screenshot, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	public void threadWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectVisibileTextByXPath(String xpath, String value) {
		// TODO Auto-generated method stub
		WebElement text = driver.findElementByXPath(xpath);
		Select sel = new Select(text);
		sel.selectByVisibleText(value);
	}

	public void scrollDownByXpath(String xpath) {
		driver.findElementByXPath(xpath).sendKeys(Keys.DOWN);
	}

}
