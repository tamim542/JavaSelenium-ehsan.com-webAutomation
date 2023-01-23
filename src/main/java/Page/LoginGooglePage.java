package Page;

import org.openqa.selenium.By;

public class LoginGooglePage extends BasePage{
	
	public By signupButton=By.xpath("//img[@class=\"icon\" and @src=\"/assets/images/icons/user-outline.svg\"]");
	public By googleLogin = By.xpath("//a[contains(text(),'Google')]");
	public By emailField = By.xpath("//input[@id=\"identifierId\"]");
	public By porobortiClick = By.xpath("//span[contains(text(),'পরবর্তী')]");
	public By passwordSet = By.xpath("//input[@type=\"password\" and @name=\"password\"]");
}
