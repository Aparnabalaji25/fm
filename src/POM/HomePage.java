package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseTest;

public class HomePage extends BaseTest 
{
	

	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
    @FindBy(id="username")
    private WebElement unTextBox;
    
    public WebElement unTextBox()
    {
    	return  unTextBox;
    }
	
    @FindBy(id="pwd")
    private WebElement pwTextBox;
    
    public WebElement pwTextBox()
    {
    	return  pwTextBox;
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    private WebElement loginbutton;
    
    public WebElement loginbutton()
    {
    	return  loginbutton;
    }
	}

