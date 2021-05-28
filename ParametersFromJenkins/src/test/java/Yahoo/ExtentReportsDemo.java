package Yahoo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

public class ExtentReportsDemo 
{
	@Test 
	public void extent()
	{
		//Create object for ExtentReports class
		ExtentReports report=new ExtentReports();
		//Start the test case execution
		//Log the status
		//End test case exection
		//Flush
	}
}