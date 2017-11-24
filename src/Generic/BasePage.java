package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BasePage implements AutoConstant
{
public WebDriver driver;

	@BeforeMethod
	public void Precondition()
	{
		 System.setProperty(GECKO_KEY,GECKO_VALUE);
		 driver=new FirefoxDriver();
		 driver.get("");
	}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
		
	}

}
