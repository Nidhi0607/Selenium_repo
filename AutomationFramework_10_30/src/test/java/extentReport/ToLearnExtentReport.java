package extentReport;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	@Test
	public void createReports() //before writting the test case we have to add dependencies take it from google extentreport, doc,version5,java,
	//in that maven copy and paste it in pom.xml
	{
		String time = LocalDateTime.now().toString().replace(":", "_");//we add the current time
		//step1: create object for extentsparkreport
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentReport"+time+".html");//path// gave in project
		
		//step 2: create object for extentReport
		ExtentReports extReport = new ExtentReports();
		
		//step 3: attach extentsparkareport to extentReport
		 extReport.attachReporter(spark);
		 
		 //step4: create extenttest object
		 ExtentTest test = extReport.createTest("createReports");//here we give method name(test case name)
		 
		 //step 5: call log( and provide status and message);
		 test.log(Status.INFO, "open browser and navigate to url");
		 test.log(Status.SKIP, "enter valid credential");
		 test.log(Status.WARNING, "click on login button");
		 test.log(Status.PASS, "Successfully created extent report");
		 
		 //step 6 : call flush
		 extReport.flush();		 
	}

}
