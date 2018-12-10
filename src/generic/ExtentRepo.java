package generic;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentRepo {

	public static ExtentHtmlReporter report;
	public static ExtentReports extent;
	public static ExtentTest test;
	static {
		
		Date d = new Date();
        String time = d.toString().replaceAll(":"	, "_");
		String path = "./reports/"+time+".html";
		report = new ExtentHtmlReporter(path);
		extent = new ExtentReports();
		extent.attachReporter(report);
		test = extent.createTest("report");
//		test.log(Status.INFO, "extent report is working fine");
		extent.flush();
	}
}
