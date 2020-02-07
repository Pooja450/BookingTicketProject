package Reports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Runners.TestRunner;
import utils.TakeScreenshots;

public class Reporting {
	
	public static ExtentReports report = TestRunner.report;
	public static ExtentTest test;
	public static TakeScreenshots screencapture;
	

	public static void reportFailure(String errMsg, WebDriver driver, Throwable e) throws Throwable {
    	screencapture = new TakeScreenshots(driver);
		Reporting.infoLogFail(errMsg);
		throw e;
	}
	
	public static void initReports(String scenario) {
		test = report.createTest(scenario);
	}
	
	public static void putReport() {
		report.flush();
	}
	
	public static void infoLogPass(String msg) {
		test.log(Status.PASS, msg);
	}
	
	public static void infoLogFail(String msg) throws IOException, Exception {
		test.log(Status.FAIL,msg +" Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+screencapture.TakeScreenshot()));
	}
	
	public static void infoLogMessage(String msg) {
		test.log(Status.INFO, msg);
	}

}
