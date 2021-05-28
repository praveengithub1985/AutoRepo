package Yahoo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo 
{
	@Test 
	public void extent() throws IOException
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/FirstReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest logger1=extent.createTest("Yahoo login test1");
		logger1.log(Status.INFO, "Test1 Information");
		logger1.log(Status.PASS, "Verificaiton Done");
		extent.flush();		
		System.out.println("Test1 done");
		
		ExtentTest logger2=extent.createTest("Yahoo login test2");
		logger2.log(Status.INFO, "Test2 Information");
		logger2.log(Status.FAIL, "Verificaiton Failed");
		logger2.fail("Failed Test", MediaEntityBuilder.createScreenCaptureFromPath("F:\\SeleniumRevisit\\GitHub\\Screenshots\\PushBranch.png").build());
		//logger2.fail(details, provider)
		extent.flush();		
		System.out.println("Test2 done");
		
		ExtentTest logger3=extent.createTest("Yahoo login test3");
		logger3.log(Status.INFO, "Test3 Information");
		logger3.log(Status.PASS, "Verificaiton Completed");
		extent.flush();		
		System.out.println("Test3 done");
	}
}