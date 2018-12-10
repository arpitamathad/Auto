package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonClass {

	public static void Screenshots(WebDriver driver, String folder) {
		Date d = new Date();
        String time = d.toString().replaceAll(":"	, "_");
		String path = folder+"/"+time+".png";
		try {
			TakesScreenshot t = (TakesScreenshot) driver;
			File srcFile = t.getScreenshotAs(OutputType.FILE);
			File destFile = new File(path);
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
