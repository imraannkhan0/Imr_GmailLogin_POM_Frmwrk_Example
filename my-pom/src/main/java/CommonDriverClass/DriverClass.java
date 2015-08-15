package CommonDriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DriverClass {
	private static WebDriver driver ;

	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
	}


	public static WebDriver getDriver(){
	return driver;

	}

}
