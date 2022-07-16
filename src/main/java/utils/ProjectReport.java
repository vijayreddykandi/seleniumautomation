package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class ProjectReport {
	ExtentReports report;
	static ExtentTest test;

	public void startReport() {
		long time = System.currentTimeMillis();
		report = new ExtentReports("./reports/" + time + ".html");
//		ExtentReports report1 = new ExtentReports("./reports/AutomationReport.html",false);
	}

	public void startTest(String testcasename, String testcasedesc, String author, String category) {

		test = report.startTest(testcasename, testcasedesc);
		test.assignAuthor(author);
		test.assignCategory(category);

	}
	
	public abstract long takeSnap();

	public void logStatus(String status, String description) {
		long number = takeSnap();

		if (status.equalsIgnoreCase("Pass")) {
			test.log(LogStatus.PASS, description+test.addScreenCapture("../screenshots/"+number+".jpeg"));
		} else if (status.equalsIgnoreCase("Fail")) {
			test.log(LogStatus.FAIL, description+test.addScreenCapture("../screenshots/"+number+".jpeg"));
		} else if (status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, description+test.addScreenCapture("../screenshots/"+number+".jpeg"));
		}

	}
	
	public void endTest() {
		report.endTest(test);
	}
	
	public void endReport() {
		report.flush();
	}
}
