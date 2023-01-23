package Page;

import org.openqa.selenium.By;

public class ScrollDownPage extends BasePage{
	
	public By bisoyHover = By.xpath("//a[contains(text(),'বিষয়')]");
	public By uponnashSelect = By.xpath("//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-menu[1]/nav[1]/ul[1]/li[3]/div[1]/ul[1]/li[6]/a[1]");

	public By jsScroll  = By.xpath("//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-category-products[1]/div[1]/div[2]/div[3]/a[9]/div[5]/button[1]");
	
	public By addToCard = By.xpath("//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-product-details[1]/section[1]/div[1]/div[3]/div[2]/button[1]");
	public By goToCard = By.xpath("//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-product-details[1]/section[1]/div[1]/div[3]/div[2]/button[1]");
	public By proceedToCheck = By.xpath("//a[@href=\"/checkout\"]");
	public By loginGoogle = By.xpath("//a[@class=\"login-google\"]");
}
