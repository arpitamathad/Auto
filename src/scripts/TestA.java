package scripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseClass;
import generic.CommonClass;
import generic.Results;

@Listeners(Results.class)
public class TestA extends BaseClass{

	@Test
	public void test1() {
	
		CommonClass.Screenshots(driver, "./screenshots");
		Reporter.log("success......",true);
	}
	
	@Test
	public void test2() {
		SoftAssert as = new SoftAssert();
		as.fail();
		as.assertAll();
		Reporter.log("fail........",true);
	}
	
	
}
