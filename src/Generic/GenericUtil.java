package Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtil
{
public static WebDriver driver;

public static void mouseover(WebElement ele)
{
	Actions a=new Actions(driver);
    a.moveToElement(ele).perform();
	}

public static void SelectByIndex(WebElement wb,int n)
{
	Select s=new Select(wb);
	s.selectByIndex(n);
}

public static void SelectByValue(WebElement wb1,String m)
{
	Select s1=new Select(wb1);
	s1.selectByValue(m);
}

public static void SelectByVisibleText(WebElement wb2,String l)
{
	Select s2=new Select(wb2);
	s2.selectByVisibleText(l);
}
public static void Scroll(int y)
{
JavascriptExecutor j=	(JavascriptExecutor) driver;
j.executeScript("window.ScrollBy(0,"+y+")","");
}
}
