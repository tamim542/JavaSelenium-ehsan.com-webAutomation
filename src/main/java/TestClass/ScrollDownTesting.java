package TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import Page.ScrollDownPage;
import Utilities.DriverSetup;
import io.qameta.allure.Description;

public class ScrollDownTesting extends DriverSetup{
	
	ScrollDownPage sDPObj = new ScrollDownPage();
	
	@Test (description = "Scroll Down")
	@Description("Scroll Down Testing --Allure")
	public void scrollDownTesting() throws InterruptedException {
		getDriver().get("https://ehsan.com.bd/");
		
		Actions action = new Actions(getDriver());
		
		action.moveToElement(sDPObj.getElement(sDPObj.bisoyHover)).perform();
		sDPObj.clickOnElement(sDPObj.uponnashSelect);
		

	WebElement element = sDPObj.getElement(sDPObj.jsScroll);
	((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(3000);
	
	sDPObj.clickOnElement(sDPObj.jsScroll);
	sDPObj.takeScreenShot("Scroll Down Testing --Allure");
	sDPObj.clickOnElement(sDPObj.addToCard);
	sDPObj.clickOnElement(sDPObj.goToCard);
	sDPObj.clickOnElement(sDPObj.proceedToCheck);
	sDPObj.clickOnElement(sDPObj.loginGoogle);
	
	
	
	}

}
