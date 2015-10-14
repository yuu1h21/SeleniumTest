import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleTestCase {

	public void Initialize(String url, WebDriver driver){
		driver = new FirefoxDriver();
		driver.get(url);
	}


	public void ScreenShot(WebDriver driver){

		try {
            FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("E:\\eclipse\\workspace\\SeleniumTest\\test.jpg"));
        } catch (WebDriverException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}



}
