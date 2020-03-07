package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_page {
	WebDriver dr;
	By by_nam=By.xpath("//p[@class='name clearfix']");
	 public Home_page(WebDriver dr) {
		 this.dr=dr;
	 }
	 public String  get_uid() {
		 return dr.findElement(by_nam).getText();
	 }
}
