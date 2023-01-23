package TestClass;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.HoverAndSelectPage;
import Utilities.DriverSetup;
import io.qameta.allure.Description;

public class HoverAndSelectTesting extends DriverSetup{
	
	
	HoverAndSelectPage hASPageObj = new HoverAndSelectPage();
	
	@Test (description = "Hover and Selecting")
	@Description("Hover and Selecting Testing --Allure")
	public void scrollPageTesting(){
		
		getDriver().get("https://ehsan.com.bd/");
		
		Actions action = new Actions(getDriver());
		hASPageObj.takeScreenShot("Hover And Select Testing --Allure");
		action.moveToElement(hASPageObj.getElement(hASPageObj.bisoyHover)).perform();
		hASPageObj.clickOnElement(hASPageObj.uponnashSelect);
	}
	
	
}
