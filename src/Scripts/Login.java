package Scripts;

import org.testng.annotations.Test;

import Generic.BasePage;
import POM.HomePage;

public class Login extends BasePage
{
HomePage h;
@Test
void Login()
{
	h.unTextBox().sendKeys("admin");
	h.pwTextBox().sendKeys("manager");
	h.loginbutton().click();
}

}