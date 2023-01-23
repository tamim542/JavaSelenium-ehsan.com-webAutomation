package Page;

import org.openqa.selenium.By;

public class WriterFilterPage extends BasePage{

		public By writer = By.xpath("//a[contains(text(),'লেখক')]");
		public By writerName = By.xpath("//a[@href=\"/authors/arif-azad/603514335b72d56591888a67\"]");
		
		public By bookCondition= By.xpath("//span[contains(text(),'New')]");
		
}
