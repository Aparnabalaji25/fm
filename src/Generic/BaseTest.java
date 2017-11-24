package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BaseTest {

	public static WebDriver driver;
	
	public BaseTest(WebDriver driver)
	{
		this.driver=driver;
	}
	public static void pageverification(String s,String expt)
	{
	//String S=driver.getTitle();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(s));
	if(s.equals(expt))
	{
		Reporter.log("Title is matching:Pass",true);
	}
	else
	{
		Reporter.log("Title isnot matching:Pass",true);
	}
	}

}