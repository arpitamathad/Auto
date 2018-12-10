package scripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.CommonClass;
import generic.Results;

@Listeners(Results.class)
public class TestB extends BaseClass {

	@Test
	public void test3() {
	
		CommonClass.Screenshots(driver, "./screenshots");
		Reporter.log("success......",true);
	}
}
