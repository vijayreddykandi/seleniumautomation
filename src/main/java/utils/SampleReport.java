package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	public static void main(String[] args) {
		
		//startReport
		ExtentReports report = new ExtentReports("./reports/samplereport.html");
		
		//startTest
		ExtentTest test =  report.startTest("TC001", "IRCTC Registration");
		
		//logTheStatus
		test.log(LogStatus.PASS, "The browser launched successfully");
		test.log(LogStatus.FAIL, "The element is not visible on the screen");
		test.log(LogStatus.WARNING, "The test is not matching with expected");
		
		//endTest
		report.endTest(test);
		
		ExtentTest test1 =  report.startTest("TC002", "IRCTC Lounge");
		test1.log(LogStatus.PASS, "The browser launched successfully");
		test1.log(LogStatus.FAIL, "The element is not visible on the screen");
		test1.log(LogStatus.WARNING, "The test is not matching with expected");
		report.endTest(test1);
		
		//endReport
		report.flush();
		
		
		
	}

}
