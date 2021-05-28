package Yahoo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo 
{
	@Test 
	public void extent()
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/FirstReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Yahoo login test");
		logger.log(Status.INFO, "Logging in to Yahoo");
		logger.log(Status.PASS, "Verificaiton Done");
		extent.flush();		
		System.out.println("Extent Report Generated");
	}
}