package Page;

import org.openqa.selenium.By;

public class HoverAndSelectPage extends BasePage{
	public By bisoyHover = By.xpath("//a[contains(text(),'বিষয়')]");
	public By uponnashSelect = By.xpath("//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-menu[1]/nav[1]/ul[1]/li[3]/div[1]/ul[1]/li[6]/a[1]");
}
