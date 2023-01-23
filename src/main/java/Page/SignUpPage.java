package Page;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage{
	
	public By signupButton=By.xpath("//img[@class=\"icon\" and @src=\"/assets/images/icons/user-outline.svg\"]");
	public By signUpNow = By.xpath("//a[contains(text(),\"Register now\")]");
	
	public By phoneNoSignUp=By.xpath("//input[@formcontrolname=\"phoneNo\"]");
	public By emailSignUp=By.xpath("//input[@formcontrolname='email']");
	public By passwordSignUp=By.xpath("//input[@formcontrolname=\"password\"]");
	public By confirmPassSignUp = By.xpath("//input[@formcontrolname=\"confirmPassword\"]");
	public By nameSignUp = By.xpath("//input[@formcontrolname=\"fullName\"]");
//	
	

//	
//	public By checkboxSignUp=By.xpath("//label[@id=\"recaptcha-anchor-label\"]");

}
