package TestClass;

import org.testng.annotations.Test;

import Page.ContactPage;
import Utilities.DriverSetup;
import io.qameta.allure.Description;

public class ContactTesting extends DriverSetup{
	
	ContactPage cPObj = new ContactPage();
	
	@Test (description = "Contact Page")
	@Description("Contact Page Testing --Allure")
	public void contactFormTesting() throws InterruptedException {
		//getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get("https://ehsan.com.bd/");
		
		cPObj.takeScreenShot("Contact Page Testing --Allure");
		cPObj.clickOnElement(cPObj.contacIcon);
		cPObj.write(cPObj.name, "Tam hkn");
		cPObj.write(cPObj.email, "mdtauhi1@gmail.com");
		cPObj.write(cPObj.contactNo, "90847575");
		cPObj.write(cPObj.addrs, "Narsingdi, Dhaka");
		cPObj.clickOnElement(cPObj.typeofQuery);
		cPObj.clickOnElement(cPObj.db);
		cPObj.write(cPObj.subject, "Book Info");
		cPObj.write(cPObj.mess, "I want to know about a book");
		Thread.sleep(2000);
		cPObj.clickOnElement(cPObj.submit);
		Thread.sleep(2000);
		
		
	}
}
