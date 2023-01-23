package TestClass;
import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import Page.LoginGooglePage;
import Utilities.DriverSetup;
import io.qameta.allure.Description;

public class LoginGoogleTesting extends DriverSetup{
	
	LoginGooglePage lGPObj = new LoginGooglePage();
	
	@Test (description = "Login with Google")
	@Description("Google Login Testing --Allure")
	public void loginWithGoogleTesting() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get("https://ehsan.com.bd/");
		
		lGPObj.clickOnElement(lGPObj.signupButton);
		lGPObj.clickOnElement(lGPObj.googleLogin);
		Thread.sleep(3000);
		
		getDriver().switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		getDriver().get("https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?response_type=code&client_id=981881735009-093tp6ag7u6fpob5oih2q5vs4l7mun8o.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fehsan-ecommerce.firebaseapp.com%2F__%2Fauth%2Fhandler&state=AMbdmDnWf6l7LegFNftBn1a5MKPYxmiGReMzbXZDpfO0-1YWst5hI6Vz7g82lptW1Mx8VZsMCmOUTt4_oERIABWwh4tm3tPZw4matIeLAtNGMDGkP7IciM9IndRW1go8rvImakXTK_trrrTV3wvf2DM-F7lGUrQHJF5a9ZUCLWzc5nntE9FBUJpUe8CJwbqSwbh-jHAx3jskNn5wSn-lR1z8ApcLci-pScVXvh_6vdRU__y5J3GSiw_bDJB4JJ16DpXRTIuoiCuP-XZ7YDJrAITRvvZok53I3ui6p1rrUkJBcQE07Vh0C0lIk-IAOwGtWh7BNu0Zvtn5-g&scope=openid%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email%20profile&context_uri=https%3A%2F%2Fehsan.com.bd&service=lso&o2v=1&flowName=GeneralOAuthFlow");
		lGPObj.takeScreenShot("Hover And Select Testing --Allure");
		lGPObj.write(lGPObj.emailField, "2016-2-60-036@std.ewubd.edu");
		lGPObj.clickOnElement(lGPObj.porobortiClick);
		
		//WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.presenceOfElementLocated(lGPObj.write(lGPObj.passwordSet, "abc123")));
		
		lGPObj.write(lGPObj.passwordSet, "abc123");
		
		
		
		
		
		
	}
	
}
