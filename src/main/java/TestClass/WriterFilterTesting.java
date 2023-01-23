package TestClass;

import java.time.Duration;

import org.testng.annotations.Test;

import Page.WriterFilterPage;
import Utilities.DriverSetup;
import io.qameta.allure.Description;

public class WriterFilterTesting extends DriverSetup{
	WriterFilterPage wFObj = new WriterFilterPage();
	@Test (description = "Writer Filter")
	@Description("Writer Filter Testing --Allure")
	public void writerFilterTesting() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get("https://ehsan.com.bd/");
		
		wFObj.clickOnElement(wFObj.writer);
		
		wFObj.takeScreenShot("Writter Filter Page Testing --Allure");
		
		wFObj.clickOnElement(wFObj.writerName);
		Thread.sleep(2000);
		
		wFObj.clickOnElement(wFObj.bookCondition);
		Thread.sleep(2000);
		
	
		
		
	}
}
