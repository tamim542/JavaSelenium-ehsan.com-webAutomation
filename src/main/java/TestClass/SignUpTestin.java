package TestClass;

import org.testng.annotations.Test;

import Page.SignUpPage;
import Utilities.DriverSetup;
import io.qameta.allure.Description;

public class SignUpTestin extends DriverSetup{

	SignUpPage signUpObj = new SignUpPage();
	
	@Test (description = "SignUp Page")
	@Description("SignUp Page Testing --Allure")
	public void signUpTesting() {
		getDriver().get("https://ehsan.com.bd/");
		signUpObj.clickOnElement(signUpObj.signupButton);
		signUpObj.clickOnElement(signUpObj.signUpNow);
		
		signUpObj.takeScreenShot("SignUp Page Testing --Allure");
		signUpObj.write(signUpObj.phoneNoSignUp,"908768");
		signUpObj.write(signUpObj.emailSignUp,"tamim1@gmail.com");
		signUpObj.write(signUpObj.passwordSignUp,"8768");
		signUpObj.write(signUpObj.confirmPassSignUp,"8768");
		signUpObj.write(signUpObj.nameSignUp,"Tamim Bhuiyan");
	}
}
