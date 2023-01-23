package Page;

import org.openqa.selenium.By;

public class ContactPage extends BasePage{
	
	public By contacIcon = By.xpath("//img[@src=\"/assets/images/icons/call-outline.svg\"]");
	
	public By name = By.xpath("//input[@id=\"mat-input-0\"]");
	public By email = By.xpath("//input[@id=\"mat-input-1\"]");
	public By contactNo = By.xpath("//input[@id=\"mat-input-2\"]");
	public By addrs = By.xpath("//input[@id=\"mat-input-3\"]");
	public By typeofQuery = By.xpath("//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-contact[1]/section[2]/div[1]/div[1]/form[1]/div[5]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]");
	public By db = By.xpath("//span[contains(text(),' Dealership Query ')]");
	public By subject = By.xpath("//input[@id=\"mat-input-4\"]");
	public By mess = By.xpath("//textarea[@id=\"mat-input-5\"]");
	public By submit = By.xpath("//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-contact[1]/section[2]/div[1]/div[1]/form[1]/div[8]/button[1]");
	
	
}
